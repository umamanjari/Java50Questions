package com.wbl;

import java.util.Scanner;

public class Printingparticularseq {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the series number :");
		
			
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++){
			for(int s=n-i;s>0;s--){
				 System.out.print("");
			}
		
			for(int j=0;j<i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
sc.close();
	}

	}


