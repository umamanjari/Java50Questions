package com.wbl;


public class FibonnaciRecursion {
	
	
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		System.out.println("index"+n1); 
		fibonacciSeries(n1,n2);
	}
	public static void fibonacciSeries(int a,int b){
		int stoppingpoint=40;
		int index=0;
		
		b=1;
		System.out.println("index" +b);
		if(index==stoppingpoint)
			return;
		 index++;
		fibonacciSeries(b,a+b);
	}
}