package com.wbl;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ReplaceStringinFile {

	public static void main(String[] args) {
		System.out.println("Enter the word to be replaced");
        Scanner sc=new Scanner(System.in);
       String p= sc.nextLine();
      
       try {
    	   File  file=new File("C:\\Users\\umaba\\Desktop\\Unix mock.txt");
		   BufferedReader br=new BufferedReader(new FileReader(file));
		   String line="";
		   String oldText="";
		   while((line=br.readLine())!=null)
		   {
			   oldText +=line+"\r\n";
		   }
		   br.close();
		   String replacedText=oldText.replaceAll("u","Lin"+p);
		   FileWriter writer=new FileWriter("C:\\Users\\umaba\\Desktop\\sample.txt");
		   writer.write(replacedText);
		   writer.close();
		   
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
       sc.close();
	}

}
