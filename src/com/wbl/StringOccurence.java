package com.wbl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class StringOccurence {
	 public static void main(String[] args) {
	    String line = null;
        int counter = 0;
      System.out.println("Enter the word to be searched ");
        Scanner sc = new Scanner(System.in);
       String userinput=sc.nextLine();
        
    	String word=userinput;
        try {

            FileReader fileReader = new FileReader("C:\\Users\\umaba\\Desktop\\Unix mock.txt");
            BufferedReader br = new BufferedReader(fileReader);
              line=br.readLine(); 
              while(line != null) {
            	for (int i = 0; (i = line.indexOf(word, i)) != -1; i += word.length()) {
                    
                    counter += 1;
                }
            }
           

       
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

  
    }


	