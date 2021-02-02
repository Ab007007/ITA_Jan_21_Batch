package com.ita.training.java.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionInFile {

	
	public static void main(String[] args) {
		
		File f = null ; 
		FileInputStream fis = null;  
		try
		{
			System.out.println("Creating file Object");
			f = new File("data/personInfo123.txt");
			fis = new FileInputStream(f);
			System.out.println("file Object is created successfullly");
		}
		catch(FileNotFoundException fex)
		{
			System.out.println("File Not found..!!!");
		}
		printMyName();
		System.out.println("--- Main ended----");
		
	}
	
	
	private static void printMyName() {
		System.out.println("My name is AHB");
	}
}
