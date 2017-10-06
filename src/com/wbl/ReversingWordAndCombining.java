package com.wbl;

public class ReversingWordAndCombining {
	public static void main(String[] args){
String s1="Hello World";
String[] str=s1.split(" ");
String revstr="";

for(int i=0;i<=str.length-1;i++){
	String word=str[i];
	String revword="";
	for(int j=word.length()-1;j>=0;j--){
		revword=revword+word.charAt(j);
		
	}
	System.out.println(revword);
	 revstr= revstr+revword+" ";
}
System.out.println(revstr);
}
}
