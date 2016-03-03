package com.codeography.core;

import java.io.File;
import java.lang.reflect.Field;

import com.codeography.copyValues.CopyValueTask;

import filteredItems.FilteredItems;

public class FormMigrationTasks {
	
	public CopyValueTask copyValueTask;
	public FilteredItems filteredItems;
	
	public FormMigrationTasks(File file) throws Exception {
		this.copyValueTask = new CopyValueTask(file);
	}

	/*
	 * TODO
	 * utilizar reflection para obter atributos da classe
	 * e puder ver quais delas estao instaciadas e executar como task
	 * 
	 * http://stackoverflow.com/questions/3333974/how-to-loop-over-a-class-attributes-in-java
	 * aqui sugere que se utilize interfaces ao reflection
	 */
	
	public void tasksToExecute() {
		for(Field c : this.getClass().getFields()){
			if(!c.equals(null)){ 
				
			}
		}
	}

}
