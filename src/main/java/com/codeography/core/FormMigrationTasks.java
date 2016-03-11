package com.codeography.core;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.codeography.copyValues.CopyValueTask;
import com.github.javaparser.ParseException;

public class FormMigrationTasks {
	
	public List<Task> taskList = new ArrayList<Task>();
	
	/*
	 * TODO
	 * ir adicionando as tasks ao construtor conforme forem 
	 * codificadas
	 */
	public FormMigrationTasks(File file) throws Exception {
		taskList.add(new CopyValueTask(file));
	}

	public void tasksToExec() throws ParseException, IOException{
		for (Task job : taskList){
			if(job.getHasJobs()) job.execute();
		}
	}
}
