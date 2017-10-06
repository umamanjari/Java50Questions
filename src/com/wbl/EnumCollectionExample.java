package com.wbl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

public class EnumCollectionExample {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("January");
		list.add("February");
		list.add("March");
		list.add("April");
		list.add("May");
		list.add("June");
		list.add("July");
		list.add("August");
		list.add("September");
		list.add("October");
		list.add("November");
		list.add("December");
		Enumeration<String> enm=Collections.enumeration(list);
		while(enm.hasMoreElements()){
			System.out.println(enm.nextElement());
		}
		
		
		
}
}