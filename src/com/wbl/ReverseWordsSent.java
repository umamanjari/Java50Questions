 //Write a program to reverse each individual word in a sentence.
package com.wbl;

public class ReverseWordsSent {

	public static void main(String[] args) {
		String str="This is a sentence";
		String s[]=str.split(" ");
		String revStr="";
		for(int i=0;i<=s.length-1;i++){
		String word=s[i];	
		
		String revWord="";
		for(int j=word.length()-1;j>=0;j--){
			revWord=revWord+word.charAt(j);
			
			
		}
		System.out.println(revWord);
		revStr=revStr+revWord+" ";
		
		}
		System.out.println(revStr);
		
	}}