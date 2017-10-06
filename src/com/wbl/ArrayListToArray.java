package com.wbl;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Joe");
		list.add("Allisa");
		list.add("Mariane");
		list.add("Kurt");
		list.add("James");
		System.out.println(list);
		String[] arr=new String[list.size()];
		list.toArray(arr);
		System.out.println("Array Elements: ");
		for(String array:list){
			System.out.println(array);
		}
		
		

	}

}
