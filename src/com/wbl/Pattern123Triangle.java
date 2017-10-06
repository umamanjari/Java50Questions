package com.wbl;

import java.util.Scanner;

public class Pattern123Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number n: ");
	int n=	sc.nextInt();
	for(int i=0;i<=n;i++){
		for(int j=0;j<=n-i;j++){
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++){
			System.out.print(k);
			
		}
		for(int l=i-1;l>0;l--){
			System.out.print(l);
		}
		System.out.println();	
	}

	}

}
