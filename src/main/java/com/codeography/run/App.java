package com.codeography.run;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.codeography.core.ClassNavigator;
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
        System.out.println( "Hello!" );
        File file = new File("/home/diogo/Desktop/orig/Soaadas/controller/SoaadasFormController.java");
        
        new ClassNavigator(file);
        
    }
}