 
//Write a program to check if a given string of parenthesis has balanced parenthesis or not.For example a string as "(())"
package com.wbl;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> stack=new Stack<Integer>();
		System.out.println("Enter the String/Expression");
		String regEx=sc.nextLine();
		for(int i=0;i<=regEx.length()-1;i++){
			char ch=regEx.charAt(i);
			if(ch== '(')
				stack.push(i);
			else if(ch==')'){
			try{		
			int p=stack.pop()+1;
			System.out.println("Expression is matching");	
			}
		catch(Exception e){
			System.out.println("Expression is not matching");
		}
			
	}}

		 while (!stack.isEmpty() )
	            System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
		 sc.close();
}
}