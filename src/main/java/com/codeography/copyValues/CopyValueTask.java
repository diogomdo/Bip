package com.codeography.copyValues;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.portable.ApplicationException;

import com.codeography.common.DirectoryNavigator;
import com.codeography.core.ClassNavigator;
import com.codeography.core.TargetComments;
import com.codeography.core.Task;
import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class CopyValueTask implements Task, TargetComments{

	private  File dir;
	private  String targetBlock;
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
				if (file.getAbsoluteFile().getName().endsWith("Controller.java") ){
					CompilationUnit loadedClass = JavaParser.parse(file);
					
					findMethods(loadedClass);
					}
			}
	}

	private static void findMethods(CompilationUnit cu) {
        List<TypeDeclaration> types = cu.getTypes();
        for (TypeDeclaration type : types) {
            List<BodyDeclaration> members = type.getMembers();
            for (BodyDeclaration member : members) {
                if (member instanceof MethodDeclaration) {
                	/*
                	 * sao duas maneiras de obter a classe que representa
                	 * o metodo
                	 */
                  MethodDeclaration method = (MethodDeclaration) member;
//                	((MethodDeclaration) member).getName();
                  if (method.getName().contains("beforeQuery")){
                	  /*
                	   * vai confirmar se os parametros dos copy value estao criados e que
                	   * tipo de parametros são. 
                	   */
                	  checkParameters();
                  }
                  else{
                	  /*
                	   * o beforeQuery vai ser criado assim como
                	   * os parametros. Dentro do createMethod pode ser chamado o mesmo
                	   * metodo de criar parametros.
                	   */
                	  createMethod();
                  }
                }
            }
        }
	}
	
	private static void createMethod() {
		// TODO Auto-generated method stub
		
	}

	private static void checkParameters() {
		// TODO Auto-generated method stub
		
	}

	public Boolean getHasJobs() {
		return jobTodDo;
	}
	
}
