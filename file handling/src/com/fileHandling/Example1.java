package com.fileHandling;

import java.io.File;

/*
 * Explore all Directories and Files in the given path
 * */
public class Example1 {
	public static void main(String[] args) {
		File path = new File("G:\\downloads\\phone");
		explore(path, "");
	}

	public static void explore(File path, String s) {
		File list[] = path.listFiles();
		if (list != null) {
			for (int i = 0; i < list.length; i++) {
				if (list[i].isDirectory()) {
					System.out.println(s + "Directory: " + list[i].getName());
					explore(list[i], s + "\t");
				} else if (list[i].isFile()) {
					System.out.println(s + "\tFile: " + list[i].getName());
				}
			}
		}
	}
}
