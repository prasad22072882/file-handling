package com.fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo6 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Demo2.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String s;
		while ((s = br.readLine()) != null) { // Read line by line
			System.out.println(s);
		}
		br.close();
	}
}
