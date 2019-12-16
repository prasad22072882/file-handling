package com.fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Demo1.txt");
		System.out.println("Is file exist: " + file.exists());
		file.createNewFile();
		System.out.println("Is file exist: " + file.exists());
		System.out.println("File is readable: " + file.canRead());
		System.out.println("File is writable: " + file.canWrite());
		System.out.println("Length: " + file.length());
		System.out.println("Name: " + file.getName());
		file.delete();
		System.out.println("Is file exist: " + file.exists());
	}
}
