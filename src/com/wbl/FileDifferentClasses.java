package com.wbl;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileDifferentClasses {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// scannerEx();
		//bufferedReader();
		//dataInputStream();
		consoleClass();
		
	}
		 static void scannerEx(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the 1st number: ");
		    int	num1=sc.nextInt();
		    System.out.println("Enter the 2nd number: ");
		    int num2=sc.nextInt();
		    int sum=num1+num2;
		    System.out.println("Scanner Sum: "+sum);
		    sc.close();
		}
		static void  bufferedReader() throws NumberFormatException, IOException{
			 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			 System.out.println("Enter the 1st number ");
			 int num1=Integer.parseInt(br.readLine());
			 System.out.println("Enter the 2nd number: ");
			 int num2=Integer.parseInt(br.readLine());
			 int diff=num1-num2;
			 System.out.println("BufferedReader difference: "+diff);
			 
		 }
        static void dataInputStream() throws IOException{
        	DataInputStream dis=new DataInputStream(System.in);
        	System.out.println("Enter the 1st number: ");
        	int num1=(int)dis.readInt();
        	System.out.println("Enter the 2nd number: ");
        	int num2=(int)dis.readInt();
        	int mul=num1*num2;
        	System.out.println("Multiplication using DatainputStream: "+mul);
        	
        }
        static void consoleClass(){
        	Console c=System.console();
        	System.out.println("Enter the 1st number: ");
        	int num1=Integer.parseInt(c.readLine());
        	System.out.println("Enter the 2nd number: ");
        	int num2=Integer.parseInt(c.readLine());
        	float div=num1/num2;
        	System.out.println("Division of Console Class Numbers: "+div);
        	
        	
        }
	}


