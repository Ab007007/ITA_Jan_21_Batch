package com.ita.training.java.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {
	static File file = null;
	static FileInputStream fis = null;

	public static void main(String[] args) {
		System.out.println("--- main started ---");
		try {
			getFileObj("data/personInfo.txt");
		}
		catch(Exception ex)
		{
			System.out.println("Exception while getting fis obj");
		}
			System.out.println("--- main ended ---");

	}

	private static FileInputStream getFileObj(String filename) throws FileNotFoundException {
		file = new File(filename);
		fis = new FileInputStream(file);
		return fis;
	}

}
