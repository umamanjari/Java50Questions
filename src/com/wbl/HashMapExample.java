/*Write a program having below methods.

  			--> To create a hashmap.

  			--> To search for a key in the created map and then returns its value.*/
package com.wbl;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(2, "John");
		map.put(5, "William");
		map.put(7, "Rosy");
		map.put(7, "Shane");
		map.put(10, "wong");
		map.put(13, "Winnie");
		System.out.println("Value: "+map.get(10));
		for(Map.Entry<Integer,String> entry :map.entrySet()){
			System.out.println("key: "+entry.getKey());
			System.out.println("Value: "+entry.getValue());
		}
	}

}
