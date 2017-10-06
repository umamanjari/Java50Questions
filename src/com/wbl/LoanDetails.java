
 //Write a program that contains a constructor, a static block and a static method. 
// Execute the program in order to verify the 
package com.wbl;

 class Loan {
	public  int loanamount;
	public double interest;
    public  static double monthlypay=2000;
    public static  int noofmon=5;
    public static String str="mortgage";
	Loan(){
		 System.out.println("Loan Details");
	}
	 Loan(int loanAmount, double interest){
		this.loanamount=loanAmount;
		this.interest=interest;
	}
	 
		static void displayDetails(){
		System.out.println("Loan Amount details");
	}
	//static block is used to change the default values of static variables
	static{
		noofmon=5;
		str="Car Loan";
		monthlypay=5000;
	}
	
}
    public class LoanDetails{
	public static void main(String[] args) {
	   
	   
	  Loan ld=new Loan();
       ld.displayDetails();
       System.out.println(ld.str); 
      System.out.println(ld.noofmon);
      System.out.println(ld.monthlypay); 
         
	
	}
	}
