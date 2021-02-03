package com.ita.training.java.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		File file = null;
		FileReader fr = null;
		try {
			file = new File("data/personInfo.txt");
			fr = new FileReader(file);
			System.out.println((char)fr.read());
			
		}
		catch(Exception ex)
		{
			System.out.println("Excepiton");
		}
	}
}
