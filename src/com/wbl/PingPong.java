package com.wbl;

import java.util.Scanner;

public class PingPong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ener the Number of elements to find: ");
        int n=  sc.nextInt();
        for(int i=1;i<=n;i++ ){
       if((i%3==0) && (i%5==0)){
    	   System.out.println("Ping Pong");
       }
       else if(i%3==0){
    	   System.out.println("Ping");   
       }
       else if(i%5==0){
    	   System.out.println("Pong"); 
	}
       else
    	   System.out.println(i);
        }
       sc.close();
}
}