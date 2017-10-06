package com.wbl;

import java.util.Scanner;

public class particularSequencestar {

	public static void main(String[] args) {
		Scanner star=new Scanner(System.in);
		System.out.println("Enter the sequence number");
		int n=star.nextInt();
		for(int i=0;i<=n;i++){
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			
			}
			
			System.out.println();
			
		}
star.close();
	}

}
