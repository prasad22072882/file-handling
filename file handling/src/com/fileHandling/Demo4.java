package com.fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Demo2.txt");
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		String s = "\nHello..\nI am a Java student.";
		bw.write(s);
		bw.close(); // save the file
		System.out.println("Write successful.");
	}
}
