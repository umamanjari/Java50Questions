package com.wbl;

public class sentencereverse {

	public static void main(String[] args) {
		String str="How are you";
	String 	revStr=" ";
     String[] s=str.split(" ");
     for(int i=0;i<s.length;i++){
    	String  word=s[i];
    String 	 revWord="";
    for(int j=word.length()-1;j>=0;j--){
    	revWord=revWord+word.charAt(j);
    	   	
     }
   
    System.out.println(revWord);
    revStr=revStr+revWord+" ";
	}
System.out.println(revStr);
     
}
}