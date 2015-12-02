package com.codeography.core;

import java.util.Iterator;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.comments.Comment;

import sun.awt.TracedEventQueue;

public class TFDecodeMessageLevelSolver implements TargetComments {

	private MethodDeclaration currentMethod;
	
	

	public TFDecodeMessageLevelSolver(MethodDeclaration n) {
		this.currentMethod = n;
		traceMessages();
	}
	
	private void traceMessages(){
	if (!currentMethod.getAllContainedComments().isEmpty()){
		
		
		Iterator<Comment> CommentsIterator = currentMethod.getAllContainedComments().iterator();
		while (CommentsIterator.hasNext()){
			Object comm = CommentsIterator.next();
			if (comm.toString().contains(TargetComments.CommentsColl.F2J_WARNING.getCommetMsg())){
				System.out.print(CommentsIterator.next().asLineComment());
				System.out.println(currentMethod.getBeginLine());
				System.out.println(currentMethod.getEndLine());
				System.out.println(comm.toString());
			}
		}
//		System.out.println(currentMethod.getAllContainedComments().iterator().next().getComment().getContent().contains(TargetComments.CommentsColl.F2J_WARNING.getCommetMsg()));
//		System.out.println(currentMethod.getBody());
	}
	
	}

}
