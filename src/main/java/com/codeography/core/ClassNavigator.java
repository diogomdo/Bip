package com.codeography.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class ClassNavigator {

	private File file;
	
	public ClassNavigator(File currentFile) throws ParseException, IOException {
		this.file = currentFile;
//		LoadClass();
	}
	
	public CompilationUnit LoadClass() throws ParseException, IOException
	{
		 FileInputStream in;
		 
		try {
			in = new FileInputStream(this.file);
		

	        CompilationUnit cu;
	        try {
	            // parse the file
	            cu = JavaParser.parse(in);
	            
	        } finally {
	            in.close();
	        }
	        
	        return cu;
	        // visit and print the methods names
//	        new MethodVisitor().visit(cu, null);
	       
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
    private static class MethodVisitor extends VoidVisitorAdapter {

        @Override
        public void visit(MethodDeclaration n, Object arg) {
            // here you can access the attributes of the method.
            // this method will be called for all methods in this 
            // CompilationUnit, including inner class methods
//        	if (n.getName().equals("Soaarol_WhenNewBlockInstanceTrg")){
//        		System.out.println(n.getAllContainedComments());
//        	}
//        	new TFDecodeMessageLevelSolver(n);
//        	return n.getAllContainedComments();
        	
        }
    }

}
