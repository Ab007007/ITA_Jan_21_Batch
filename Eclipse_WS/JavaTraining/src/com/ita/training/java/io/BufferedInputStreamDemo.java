package com.ita.training.java.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {

		File file = null;
		FileInputStream fis = null;
		BufferedInputStream bis = null;

		try {
			file = new File("data/personInfo.txt");
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			int i =0;

			System.out.println(bis.read());
		} catch (FileNotFoundException ex) {
			System.out.println("Error While creating Object to file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}
}
