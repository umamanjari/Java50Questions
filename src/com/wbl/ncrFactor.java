//Java program to find NCR factor of given number.
//Calculate the combinations for C(n,r) = n! / ( r!(n - r)! ). For 0 <= r <= n.


package com.wbl;

import java.util.Scanner;

public class ncrFactor {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the value of n: ");
	 int n= sc.nextInt();
	 System.out.println("Enter the value of r: ");
	 int r=sc.nextInt();
	 int ncr=fact(n)/(fact(r)*fact(n-r));
	 System.out.println("Ncr factor of given number ncr : "+ncr);
	 sc.close();
	}
	public static int fact(int n){
		int i=1;
		while(n!=0){
			 i=i*n;
			n--;
		}
		return i;
		
	}
		
			
			
		}

	


