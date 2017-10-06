//Write a program to locate and swap only 2 elements which are not sorted in a given sorted array.

package com.wbl;

public class Swapping2ElementsInSortArray{
	public static void main(String[] args){
	int arr[]={1,2,8,4,3};
	int n=arr.length;
	System.out.println("Given Array is: ");
	printArray(arr,n);
	sortByOneSwap(arr,n);
	System.out.println("Sorted Arryay is: ");
	printArray(arr,n);
	}
	
	static void printArray(int arr[],int n ){
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
	static void sortByOneSwap(int arr[],int n){
		for(int i=n-1;i>0;i--){
			if(arr[i]<arr[i-1]){
				int j=i-1;
				while(j>0 && arr[i]<arr[j])
					j--;
		int temp=arr[i];
		   arr[i]=arr[j+1];
		   arr[j+1]=temp;
				
				break;
		}
		
			
	}}
		
		
	

		
	
}