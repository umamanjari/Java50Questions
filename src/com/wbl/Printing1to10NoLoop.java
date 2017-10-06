 //Write a program to print 1 to 10 numbers without using loops and
 //you should not have more than 1 print statement.
package com.wbl;

public class Printing1to10NoLoop {

	public static void main(String[] args) {
		int n=1;
		
		recursivePrint(n);
		
				

	}
public static void recursivePrint(int num){
	  if(num>10)
		 return;
	System.out.println(num);
    recursivePrint(num+1);
	
	
}

} 
