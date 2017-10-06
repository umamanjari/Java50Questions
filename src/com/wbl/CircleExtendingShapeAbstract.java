
 /*Write a program that creates a class Circle extending Shape abstract class and
  *  implementing ShapeConstants interface and has following behavior.

  			--> Properties: radius.

  			--> Constructor: To set number of sides.

  			--> Overrides all the methods from parents.*/
package com.wbl;
  abstract class Shape1{
	public abstract double area();
	public abstract double circumference();
	public void displayDetails(){
		System.out.println("In the superClass: we are calculating area and cicumference of the circle ");
	}
	
}
  interface ShapeConstants{
	  static final double pi=3.14;
  }
  
 class Circle extends Shape1 implements ShapeConstants{ 
	
	 public int radius;
	 Circle(int radius){
		 this.radius=radius;
	 }
	public double area(){
		double area=pi*radius*radius;
		return area;
	}
	public double circumference(){
		double circum=2*pi*radius;
		return circum;
	}
	public void displayDetails(){
		System.out.println("In the subClass: we are calculating area and cicumference of the circle");
	}
}


public class CircleExtendingShapeAbstract {
	public static void main(String[] args) {
		Circle circle=new Circle(5);
		circle.displayDetails();
		System.out.println("Area of the circle: "+circle.area());
		System.out.println("Circumference of the Circle: "+circle.circumference());
	}

}
