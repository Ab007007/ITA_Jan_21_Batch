package com.ita.training.java.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyDemo {
	static File file = null;
	static FileInputStream fis = null;

	public static void main(String[] args) {
		System.out.println("--- main started ---");
		try {
			getFileObj("data/personInfo1.txt");
		}
		catch(Exception ex)
		{
			System.out.println("Exception while getting fis obj");
		}
		finally
		{
			printName();
			try 
			{
				fis.close();
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			System.out.println("--- main ended ---");

	}

	private static FileInputStream getFileObj(String filename) throws FileNotFoundException {
		file = new File(filename);
		fis = new FileInputStream(file);
		return fis;
	}
	
	private static void printName()
	{
		System.out.println("ARAVINDA");
	}

}
