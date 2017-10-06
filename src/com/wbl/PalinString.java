package com.wbl;

public class PalinString {

	public static void main(String[] args) {
		String str="madam";
		String revStr="";
	for(int i=str.length()-1;i>=0;i-- )	{
		revStr=revStr+str.charAt(i);
	}
	System.out.println(revStr);
if(str.equals(revStr))
	System.out.println("String is a palindrome");
else
	System.out.println("String is a not a palindrome");
	}

}
