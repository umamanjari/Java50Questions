package com.wbl;

public class SwappingExample {
	static void sortByOneSwap(int arr[], int n)
	{
	for (int i = n-1; i > 0; i--)
	{
		if (arr[i] < arr[i-1])
				{
	         int j = i-1;
	       while (j>=0 && arr[i] < arr[j])
	                j--;
	       
	       
	       swap(arr[i], arr[j+1]);
				} 
		else {
			return;
		}}}



	
		
	
	
	private static void swap(int i, int j) {
		int temp=i;
		i= j;
		j=temp;
		
	}
	static void printArray(int arr[], int n)
	{
		int i;
		for (i=0; i < n; i++)
			System.out.println(i);
	}
	public static void main(String[] args) {
		int arr[] = {10, 30, 20, 40, 50, 60, 70};
		int n = arr.length;
		System.out.println("Given array is :");
		printArray(arr, n);
		sortByOneSwap(arr, n);
		System.out.println("Sorted Array is: ");
		printArray(arr, n);
		
	}
}