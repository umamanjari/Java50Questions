package com.wbl;

public class ReverseStringWithOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Hello World";
String rever=" ";
for(int i=s1.length()-1;i>0;i--){
	rever=rever+s1.charAt(i);
}
System.out.println(rever);
	}
}