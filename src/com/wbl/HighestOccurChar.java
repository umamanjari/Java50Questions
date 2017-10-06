package com.wbl;

public class HighestOccurChar {
	static final int SIZE=256;
	static char frequentOccurence(String str){
		int count[] = new int[SIZE];
		
		int max=0;
		char result=' ';
		//int len=str.length();
		for(int i=0;i<str.length();i++){
			count[str.charAt(i)]++;
		}
		for(int j=0;j<str.length();j++){
		if(max<count[str.charAt(j)]){
			max=count[str.charAt(j)];
			result =str.charAt(j);
					}
			
		}
		return result;
	}
	
		public static void main(String[] args) {
		String str="uma manjari";
		System.out.println("Maximmum occurence character is :"+frequentOccurence(str));

	}

}
