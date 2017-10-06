package com.wbl;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to be reversed :"); 
		int num=sc.nextInt();
		int rev=0;
		while(num!=0){
			rev=rev*10;
			rev=rev+num%10;
			
			num=num/10;
		}
		
		System.out.println(rev);
	}

}
