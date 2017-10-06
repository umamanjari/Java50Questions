package com.wbl;
// Write a program to find the common number in any given two arrays.
public class CommonNumInTwoArrays {

	public static void main(String[] args) {
		int a[]={34,67,5,7,4,6};
		int b[]={20,34,4,6,45};
		
		for (int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					System.out.println(a[i]);
				}
			}
		}

	}

}
