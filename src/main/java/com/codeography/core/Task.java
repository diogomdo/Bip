package com.codeography.core;

import java.io.IOException;

import com.github.javaparser.ParseException;

public interface Task {

	public void execute() throws ParseException, IOException;
	public Boolean getHasJobs();
}
