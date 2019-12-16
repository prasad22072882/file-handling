package com.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Demo2.txt");
		FileOutputStream fout = new FileOutputStream(file, true);
		String s = "Hello World";
		char ch[] = s.toCharArray();
		fout.write('\n');
		for (int i = 0; i < ch.length; i++) {
			fout.write(ch[i]);
		}
		fout.close(); // save the file after completion of writing process
		System.out.println("Write to the file successful");
	}
}
