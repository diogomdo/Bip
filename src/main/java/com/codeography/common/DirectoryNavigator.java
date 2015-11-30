package com.codeography.common;

import java.io.File;
import java.io.IOException;

public class DirectoryNavigator {

	public DirectoryNavigator (){
		File currentDir = new File("."); // current directory

		displayDirectoryContents(currentDir);
		}

	public static void displayDirectoryContents(File dir) {
		try {
			File[] files = dir.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println("directory:" + file.getCanonicalPath());
					displayDirectoryContents(file);
				} else {
					System.out.println("     file:" + file.getCanonicalPath());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
