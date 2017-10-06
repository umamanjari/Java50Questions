
// Write a program to find the missing number in a series of sorted numbers stored in an array.//
package com.wbl;

public class MissingNumInSortedArray {
	static int sumOfNumbers(int n){
		
		int total=n*(n+1)/2;
		return total;
	}
	static int SumOfArrayElements(int a[]){
		int total=0;
		for(int i=0;i<a.length;i++){
			total=total+a[i];
		}
		return total;
	}
	public static void main(String args[]){
		int n=6;
		int a[]={7,9,10,11,12,13};
	int son=	sumOfNumbers(n);
	int soa=	SumOfArrayElements(a);
		int missNum=soa-son;
		System.out.println(missNum);
		
	}
	
	
}