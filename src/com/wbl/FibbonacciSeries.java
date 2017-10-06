//Write a program that prints a fibonaci series that is a sequence of numbers like0 1 1 2 3 5 8.You can vary the number of elements
package com.wbl;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int i=1;
		int j=0;
		System.out.print(0+" ");
		while(i<=num){
			System.out.print(i+" ");
			int temp=i;
			 i=i+j;
			 j=temp;
		}
		
			
sc.close();
	}

}
