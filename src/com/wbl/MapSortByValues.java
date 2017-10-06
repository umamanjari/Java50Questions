package com.wbl;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

	


public class MapSortByValues {

	public static void main(String a[]){
	     TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(4, "John");
		tm.put(3, "Abraham");
		tm.put(1,"Mariane");
		tm.put(8, "Doe");
		tm.put(10, "Baker");
		tm.put(14, "Todd");
		Set<Entry<Integer, String>> set=tm.entrySet();
		System.out.println("Key vlaue pairs before Sorting: ");
		for(Entry<Integer,String> entry:set){
			System.out.println(entry.getKey());
			 System.out.println(entry.getValue());
		}
	List<Entry<Integer,String>> list=new LinkedList<Entry<Integer,String>> (set);
	Collections.sort(list, new Comparator<Entry<Integer,String>>(){
		@Override
		public int compare(Entry<Integer,String> ele1,Entry<Integer,String> ele2){
			 return ele1.getValue().compareTo(ele2.getValue());
		}
	});
	
	System.out.println("Key vlaue pairs after Sorting: ");
	for(Entry<Integer,String> entry:list){
		System.out.println(entry.getKey());
		 System.out.println(entry.getValue());
	}
	}
	
	

}
