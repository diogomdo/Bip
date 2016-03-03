package com.codeography.copyValues;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.portable.ApplicationException;

import com.codeography.common.DirectoryNavigator;
import com.codeography.core.ClassNavigator;
import com.codeography.core.TargetComments;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.comments.Comment;

public class CopyValueTask {

	private  File dir;
	private  String targetBlock;
	public List<CopyValueStatement> listOfCopyValues;
	public CopyValueStatement copyValueCmmt;

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
		else
			throw new Exception();
			
	}
	
	private void commentChecker(List<Comment> allContainedComments) {
		
		for (Comment comment : allContainedComments){
			if (comment.toString().contains(TargetComments.CommentsColl.F2J_COPYVALUE.getCommetMsg())){

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
}
