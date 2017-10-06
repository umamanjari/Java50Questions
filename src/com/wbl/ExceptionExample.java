
/* Write a program containing a function which is expected to throw any kind of
 exception say NullPointerException or ArithmeticException etc and then handle
 this function in the parent function which calls this function.*/

		
package com.wbl;

public class ExceptionExample {
	static void divisionByZero(){
		int d=0;
		int a=100/d;
	}

	public static void main(String[] args) {
		try{
			divisionByZero();
					}
catch(ArithmeticException e){
	System.out.println("ArithmeticException :"+e);
	//e.printStackTrace();
}
	}

}
