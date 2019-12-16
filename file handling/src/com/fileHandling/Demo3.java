package com.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Demo2.txt");
		FileInputStream fin = new FileInputStream(file);
		int i;
		do {
			i = fin.read();
			if (i != -1)
				System.out.print((char) i);
		} while (i != -1); // At the end of the file the read() method will return -1
		fin.close();
	}
}
