package com.ita.training.java.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	
	public static void main(String[] args) throws IOException {
		File file = null;
		
		file = new File("data/newFile.txt");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
		bw.write("------------------------------------------------");
		bw.newLine();
		bw.write("I'n new content through programming ");
		bw.newLine();
		bw.write("-------------------------------------------------");
		bw.flush();
		bw.close();
		
	}

}
