package com.codeography.copyValues;

import java.io.File;
import java.util.List;

import org.omg.CORBA.portable.ApplicationException;

import com.codeography.common.DirectoryNavigator;
import com.codeography.core.ClassNavigator;
import com.codeography.core.TargetComments;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.comments.Comment;

public class Analyser {

	private static File dir;

	public Analyser(File file) throws Exception {
		this.dir = file;
		search();
	}

	public static void search() throws Exception{
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
					commentChecker(loadedClass.getAllContainedComments());
					
					/*
					 * E necessario fazer uma verificacao sobre o manager do item a ser copiado
					 * pode acontecer no comentario nao haver bloco correspondente a copia.
					 */
					
				}
			}
		else
			throw new Exception();
			
	}
	
	private static void commentChecker(List<Comment> allContainedComments) {
		
		for (Comment comment : allContainedComments){
			if (comment.toString().contains(TargetComments.CommentsColl.F2J_COPYVALUE.getCommetMsg())){
				CopyValueStatement.create(comment);
			}
		}
	}

}
