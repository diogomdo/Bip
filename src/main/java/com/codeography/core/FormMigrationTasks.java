package com.codeography.core;

import java.io.File;

import com.codeography.copyValues.CopyValueTask;

public class FormMigrationTasks {
	
	public CopyValueTask copyValueTask; 
	
	public FormMigrationTasks(File file) throws Exception {
		this.copyValueTask = new CopyValueTask(file);
	}

}
