package com.ita.training.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
//			file = new File("data/personInfo.txt");
//			fr = new FileReader(file);
//			br = new BufferedReader(fr);

			br = new BufferedReader(new FileReader(new File("data/personInfo.txt")));
			String line = null;
			while((line=br.readLine()) != null)
			{
				System.out.println(line);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Excepiton");
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
