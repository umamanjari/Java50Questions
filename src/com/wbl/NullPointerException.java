// Write a program that is expected to throw a null pointer exception and in turn handles it 
 //using try catch and finally.
package com.wbl;

public class NullPointerException {

	public static void main(String[] args) {
		{
			
				try{
					String str=null;
					System.out.println (str.length());
				}catch(Exception e){
				System.out.println("NullPointerException.."+e);
				}
				finally{
					System.out.println("This statement will be printed");
				}
			}
			}
}