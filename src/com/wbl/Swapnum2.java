package com.wbl;

import java.util.Scanner;

public class Swapnum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num1=sc.nextInt();
		Scanner sc2=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num2=sc2.nextInt();
		System.out.println("num1 "+num1);
		System.out.println("num2 "+num2);
		
	//public void withVariable(){	
			
	 num1=num1+num2;
	 num2=num1-num2;
	 num1=num1-num2;
	 System.out.println("num1 "+num1);
     System.out.println("num2 "+num2);

        sc.close();
		sc2.close();
	
	}
}
