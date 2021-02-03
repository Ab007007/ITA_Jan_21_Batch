package com.ita.training.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {

	
	public static void main(String[] args) throws IOException {
		File file = new File("data/globaldata.properties");
		FileInputStream fis = new FileInputStream(file);
		
		Properties props = new Properties();
		props.load(fis);
		
		System.out.println(props.getProperty("username"));
		System.out.println(props.getProperty("password"));
		System.out.println(props.getProperty("url"));
		System.out.println(props.getProperty("timeout"));
		System.out.println(props.getProperty("reports"));
		fis.close();
	}
}
