// Write a program to implement hashCode() and equals() methods.
package com.wbl;

public class Employee {
	private int id;
	private String name;
	public Employee(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	public void Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
public void setId(int id){
	this.id=id;
}
public void setName(String name){
	this.name=name;
}
public boolean equals(Object o){
	if(o instanceof Employee){
		Employee e2=(Employee)o;
		if(this.id==e2.id && this.name==e2.name){
			return true;
		}
	}
	return false;
		
	}
public static void main(String[] args) {
	Employee e1=new Employee(1,"Uma");
	Employee e2=new Employee(1,"Uma");
	boolean result=e1.equals(e2);
	System.out.println("HashCode of e1: "+e1.hashCode());
	System.out.println("HashCode of e2: "+e2.hashCode());
	System.out.println("Equals Result: "+result);
	
}
}

