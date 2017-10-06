//Write a program to count the number of words in a file.
package com.wbl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsInFile {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\umaba\\Desktop\\Unix mock.txt");
        BufferedReader br=new BufferedReader(fr);
       String currentLine= br.readLine();
       int count=0;
       while(currentLine!=null){
    	   String words[]=currentLine.split(" ");
    	   for(String w:words){
    		   count++;
    		     	   }
    	   currentLine=br.readLine();
       }
       System.out.println(count);
       fr.close();
	}

}
