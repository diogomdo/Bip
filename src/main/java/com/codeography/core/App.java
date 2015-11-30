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

/**
 * Code parser repo
 * https://github.com/javaparser/javaparser/wiki/Manual
 */
public class App 
{
    public static void main( String[] args ) throws ParseException, IOException
    {
        System.out.println( "Hello World!" );
        File file = new File("/home/diogo/workspace/Bip/src/main/java/com/codeography/core/SoaarolFormController.java");
     // creates an input stream for the file to be parsed
        FileInputStream in = new FileInputStream(file);

        CompilationUnit cu;
        try {
            // parse the file
            cu = JavaParser.parse(in);
            
        } finally {
            in.close();
        }
        
        // visit and print the methods names
        new MethodVisitor().visit(cu, null);

        // prints the resulting compilation unit to default system output
//        System.out.println(cu.toString());
    }
    
    /**
     * Simple visitor implementation for visiting MethodDeclaration nodes. 
     */
    private static class MethodVisitor extends VoidVisitorAdapter {

        @Override
        public void visit(MethodDeclaration n, Object arg) {
            // here you can access the attributes of the method.
            // this method will be called for all methods in this 
            // CompilationUnit, including inner class methods
        	if (n.getName().equals("Soaarol_WhenNewBlockInstanceTrg")){
        		System.out.println(n.getAllContainedComments());
        	}
        }
    }
}
