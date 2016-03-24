package com.codeography.copyValues;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.portable.ApplicationException;

import com.codeography.common.DirectoryNavigator;
import com.codeography.core.ClassNavigator;
import com.codeography.core.TargetComments;
import com.codeography.core.Task;
import com.github.javaparser.ASTHelper;
import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.ModifierSet;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.comments.BlockComment;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.expr.FieldAccessExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.expr.ThisExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.visitor.ModifierVisitorAdapter;

public class CopyValueTask implements Task, TargetComments{

	private  File dir;
	private  String targetBlock;
	private FileInputStream in;
	public List<CopyValueStatement> listOfCopyValues;
	public CopyValueStatement copyValueCmmt;
	private Boolean jobTodDo = false;

	public CopyValueTask(File file) throws Exception {
		this.dir = file;
		this.copyValueCmmt = new CopyValueStatement();
		this.listOfCopyValues = new ArrayList<CopyValueStatement>();
		search();
	}

	public void search() throws Exception{
		/*Aqui e necessario procurar adapters com comentarios de copy values e criar
		e criar uma lista de objectos CopyValues
		*/
		
		//Esta chamada e apenas para debug
		//DirectoryNavigator.displayDirectoryContents(dir);
		
		File path = DirectoryNavigator.specificDirectoryContents(dir, "model");
		if (path.toString()!=null)
			for(File file: path.listFiles()){
				if (file.getAbsoluteFile().getName().endsWith("Adapter.java") ){
					CompilationUnit loadedClass = new ClassNavigator(file).LoadClass();
					targetBlock = file.getAbsoluteFile().getName().split("Adapter.java")[0];
					commentChecker(loadedClass.getAllContainedComments());
				}
			}
		if(this.listOfCopyValues!=null) jobTodDo  =true;
		
		else
			throw new Exception();
			
	}
	
	private void commentChecker(List<Comment> allContainedComments)  {
		
		for (Comment comment : allContainedComments){
			if (comment.toString().contains(CommentsColl.F2J_COPYVALUE.getCommetMsg())){
				copyValueCmmt.create(comment.toString());
				copyValueCmmt.setTargetBlock(targetBlock.toUpperCase());
				
				/*
				 * E necessario fazer uma verificacao sobre o manager do item a ser copiado
				 * pode acontecer no comentario nao haver bloco correspondente a copia.
				 */
				
				this.listOfCopyValues.add(copyValueCmmt);
			}
		}
	}

	public void execute() throws ParseException, IOException {
		/*
		 * TODO
		 * CopyValues
		 * Verificar o controlador e o manager correspondente do bloco
		 * 
		 * Controlador
		 * Verificar se tem o metodo beforequery, caso não é preciso cria-lo adicionar instrucoes
		 * iniciais
		 * caso contrario, verificar se a instrucao existe e se corresponde a algum copy value
		 * ATENCAO: ha beforequery que tem a where clause imbutida e necessario fazer o despiste
		 * 
		 */
		File path = DirectoryNavigator.specificDirectoryContents(dir, "controller");
		if (path.toString()!=null)
			for(File file: path.listFiles()){
				String filePath = file.getAbsoluteFile().getName();
				if (filePath.endsWith("Controller.java") && filePath.contains(targetBlock) ){
					this.in = new FileInputStream(file);
					CompilationUnit loadedClass = JavaParser.parse(in);
					
					findMethods(loadedClass);
					this.copyValueCmmt.getBlockCopyFrom();
					Files.write(file.getAbsoluteFile().toPath(), 
							loadedClass.toString().getBytes(Charset.defaultCharset()), 
			                StandardOpenOption.TRUNCATE_EXISTING
				
		        );
			}
		}
	}

	private void findMethods(CompilationUnit cu)  {
		Boolean stat = false;
		
		List<TypeDeclaration> types = cu.getTypes();
        for (TypeDeclaration type : types) {
		    List<BodyDeclaration> members = type.getMembers();
		    if (hasBeforeMethod(members)){
		    	/*
		  	   * vai confirmar se os parametros dos copy value estao criados e que
		  	   * tipo de parametros são. 
		  	   */
		    	checkParameters();
		    }else{
		       /*
		      	* o beforeQuery vai ser criado assim como
		      	* os parametros. Dentro do createMethod pode ser chamado o mesmo
		      	* metodo de criar parametros.
		        * http://stackoverflow.com/a/30390300
		        * 
		    	*/
		    	createMethod(cu, members);
		    	break;
		    	}
		   }
	}
	
	private void createMethod(CompilationUnit cu, List<BodyDeclaration> members) {
		
	    // create a method
		
	    MethodDeclaration method = new MethodDeclaration(ModifierSet.PUBLIC, ASTHelper.VOID_TYPE, targetBlock.concat("_BeforeQuery"));
	    method.setModifiers(ModifierSet.addModifier(method.getModifiers(), ModifierSet.STATIC));
	    
		members.add(method);
		
		/*
		 * TODO
		 * passar os parametros correctos 'queryevent args'
		 */
		
	    // add a parameter to the method
	    Parameter param = ASTHelper.createParameter(ASTHelper.createReferenceType("QueryEvent",0), "args");
	    param.setVarArgs(true);
	    ASTHelper.addParameter(method, param);

	    // add a body to the method
	    BlockStmt block = new BlockStmt();
	    method.setBody(block);

	    // add a statement do the method body
	    NameExpr clazz = new NameExpr("System");
	    FieldAccessExpr field = new FieldAccessExpr(clazz, "out");
	    MethodCallExpr call = new MethodCallExpr(field, "println");
	    ASTHelper.addArgument(call, new StringLiteralExpr("Hello World!"));
	    ASTHelper.addStmt(block, call);

	}
	
	public static Boolean hasBeforeMethod(List<BodyDeclaration> members){
		 for (BodyDeclaration member : members) {
	         if (member instanceof MethodDeclaration) {
	         	/*
	         	 * sao duas maneiras de obter a classe que representa
	         	 * o metodo
	         	 * ((MethodDeclaration) member).getName();
	         	 */ 
			   MethodDeclaration method = (MethodDeclaration) member;          	
			   if (method.getName().contains("BeforeQuery")){
				   return true;
			   }
	         }
		 }
		return false;
	}

	
	private static void checkParameters() {
	/*
	 * TODO
	 * class para checar parametros e where clauses
	 */
	}
	
	public Boolean getHasJobs() {
		return jobTodDo;
	}	
}
