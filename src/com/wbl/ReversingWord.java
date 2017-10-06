package com.wbl;

public class ReversingWord {

	public static void main(String[] args) {
		String str="WALMART";
		//String[] words= str.split("M");
		String revWord1="";
		String revWord2="";
		
		for(int i=2;i>=0;i--){
             revWord1=revWord1+str.charAt(i);
	}
        System.out.println(revWord1);
     for(int i=str.length()-1;i>3;i--)  {
    	 revWord2=revWord2+str.charAt(i);
     }
     System.out.println(revWord2);

	System.out.println(revWord1+"M"+revWord2);
}
}