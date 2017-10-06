package com.wbl;

import java.util.Scanner;

public class StringWithNum {

				public static void main(String[] args) {
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter the String: "); 
					String str=	sc.nextLine();	
					String words[]= str.split(" ");
				    for(int i=0;i<=words.length-1;i++) {
					System.out.print(words[i]+(i+1));
					System.out.print(" ");
				}
				    sc.close();
			}

		}
	


