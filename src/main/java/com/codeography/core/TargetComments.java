package com.codeography.core;

public interface TargetComments {
	
	public enum CommentsColl{
		F2J_WARNING("Please validate if you need to surround the message level manipulation with a try/finally block"),
		F2J_COPYVALUE("Copy Value from Item");
		
		private final String msg;
		
		private CommentsColl (final String msg){
			this.msg = msg;
		}
		public String getCommetMsg(){
			return msg;
		}
	}
}
