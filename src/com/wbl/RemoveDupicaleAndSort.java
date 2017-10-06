package com.wbl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDupicaleAndSort {

	public static void main(String[] args) {
		int a1[]={56,5,3,6,9};
		int a2[]={5,8,2,7,9,10};
		List<Integer> a3=new ArrayList<Integer>();
		for(int i=0;i<a1.length;i++){
			if(!(a3.contains(a1[i]))){
			a3.add(a1[i]);
		}
		}
		for(int j=0;j<a2.length;j++){
			if(!(a3.contains(a2[j]))){
			a3.add(a2[j]);
		}
		}
      Collections.sort(a3);
      System.out.println(a3);
	}

}
