package com.wbl;

 class Employee1 {
	public int id;
	public String name;    
	Employee1(){
		
	}
	void displayemployeeDetails() {
		// TODO Auto-generated method stub
		
	}
	Employee1(int id,String name){
		this.id=id;
		this.name=name;
	}
	Employee1(String name){
		this.name=name;
	}
	void displayEmployeeDetails(){
		System.out.println("Name of Employee: "+name+" Id of the Employee: "+id);
	}

}
 class Manager extends Employee1{
	 double salary;
	 Manager(double salary){
		 this.salary=salary;
	 }
	 
	 Manager(int id,String name){
		 this.id=id;
		 this.name=name;
	 } 
	 
	 void displayemployeeDetails(){
		 System.out.println("Name of Manager: "+name +"  Id of the Manager: "+id); 
	 }
}
 class OverloadingAndOverriding{
public static void main(String[] args){
    
	
	Manager mg=new Manager(1,"Joe");
	
	mg.displayemployeeDetails();
	
}
 }
