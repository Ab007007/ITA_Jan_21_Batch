package com.ita.training.java.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("data/newFile.txt");
		System.out.println("Read ? " + file.canRead());
		System.out.println("Write ? " + file.canWrite());
		System.out.println("Execute ?" + file.canExecute());
		
		System.out.println("File ???" + file.isFile());
		System.out.println("Folder ??? " + file.isDirectory());
		
		System.out.println("Exist ??? " + file.exists());
		System.out.println(" Absolute Path " + file.getAbsolutePath());
		
		File[] files = file.listFiles();
		System.out.println("total files and folder in :  " + file.getName() + " is " + files.length);
		for (File f : files) {
			System.out.println(f.getAbsolutePath());
			
		}
		
		System.out.println("---------------------------------------------------------------");
		String[] fileNames = file.list();
		for (String fileName : fileNames) 
		{
			System.out.println(fileName);
		}
		
		
	}

}
