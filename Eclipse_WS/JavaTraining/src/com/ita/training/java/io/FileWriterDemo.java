package com.ita.training.java.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterDemo {

	
	public static void main(String[] args) {
		File file = null;
		FileOutputStream fos  = null;
		String str = "content from java program";
		
		try
		{
			file = new File("data/newFile.txt");
			fos = new FileOutputStream(file, true);
			fos.write(str.getBytes());
			fos.write("\n".getBytes());
		}
		catch(Exception ex)
		{
			
			System.out.println("Error while writing to file");
		}
		finally
		{
			try {
				fos.flush();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
