//Write a program to search for a string in a file and then return the count of		
//number of occurrences of the string.
package com.wbl;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class CountOccurOfStringInFile {

	public static void main(String[] args) {
		FileInputStream fis;
		String StringtoSearch=null;
		int count=0;
		try {
			fis = new FileInputStream("C:\\Users\\umaba\\Desktop\\Unix mock.txt");
			DataInputStream dis=new DataInputStream(fis);
			BufferedReader br=new BufferedReader(new InputStreamReader(dis));
			String strLine=br.readLine();
			while(strLine!=null){
				int startIndex=strLine.indexOf(StringtoSearch);
			while(startIndex!=-1){
				count++;
				//startIndex=base.indexOf
				
			}
				
				
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
