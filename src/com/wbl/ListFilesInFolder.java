// Write a program to show list of all file names in a folder.
package com.wbl;

import java.io.File;

public class ListFilesInFolder {

	public static void main(String[] args) {
	File file=new File("C:\\Users");
	File[] files =file.listFiles();
	for(File f:files  ){
		System.out.println( f.getName());
	}

	}

}
