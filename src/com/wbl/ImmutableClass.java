// Write an Immutable class
package com.wbl; 
	
  final class ImmutableClass{
	private final  String studname;
    private	final int studno;
	ImmutableClass(String studname,int studno){
		this.studname=studname;
		this.studno=studno;
	}
	public String getName(){
		return studname;
	}
	public int getStudno(){
		return studno;
		
	}
	public static void main(String[] args){
		ImmutableClass ic=new ImmutableClass("Uma", 816);
		System.out.println(ic.studname);
		System.out.println(ic.studno);
	}
}
