package com.fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo5 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Demo2.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int i;
		while ((i = br.read()) != -1) {
			System.out.print((char) i);
		}
		br.close();
	}
}
