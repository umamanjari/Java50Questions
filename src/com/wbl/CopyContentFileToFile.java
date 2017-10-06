//Write a program to copy content of file into another file.


package com.wbl;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Write a program to copy content of file into another file.
public class CopyContentFileToFile {

	public static void main(String[] args) throws IOException {
		InputStream input=null;
		OutputStream output=null;
		try {
			input=new FileInputStream("C:\\Users\\umaba\\Desktop\\sample.txt");
			output=new FileOutputStream("C:\\Users\\umaba\\Desktop\\sample1.txt");
			
			byte [] buf=new byte[1024];
			int bytesRead;
			while((bytesRead=input.read(buf))>0){
				output.write(buf, 0,bytesRead);
				
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}finally{
			input.close();
			output.close();
		}
		
			

	}

}
