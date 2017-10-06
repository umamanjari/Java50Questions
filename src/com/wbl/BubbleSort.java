package com.wbl;

import java.util.Scanner;

public class BubbleSort {
	
public static void main(String[] args) {
  int num;
  Scanner sc=new Scanner (System.in);
  System.out.println("Enter the number of elements in the array: " );
  num=sc.nextInt();
  int a[]= new int [num];
  System.out.println("Enter the elements: ");
  for(int i=0;i<num;i++){
	  a[i]=sc.nextInt();
  }
  for(int i=0;i<num;i++){
	 for(int j=i+1;j<num;j++) {
		 if(a[i]>a[j]){
		int	 temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		 }
	 }
  }
  System.out.println("Asscending order of the elements : ");
  for(int i=0;i<num;i++){
	  System.out.println(a[i]);
  }
	}

}
