package com.wbl;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InputAndOutputSeries {

	public static void main(String[] args) {
		System.out.println("Enter Number of  elements in the Series: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the Elements in the series ");
		Queue<Integer> queue1=new LinkedList<Integer>();
		
		int k=n/2;
		
		for(int i=0;i<k;i++){
			queue1.add(sc.nextInt());
		}
		//System.out.println("Enter the Elements in the Queue2: ");
		Queue<Integer> queue2=new LinkedList<Integer>();
		for(int i=k;i<n;i++){
			queue2.add(sc.nextInt());
		}
		while((!queue1.isEmpty()) && (!queue2.isEmpty())){
			System.out.print(queue1.poll());
			System.out.print(" , ");
			System.out.print(queue2.poll());
			System.out.print(" , ");
		}
	
			
	sc.close();	
	}

}
