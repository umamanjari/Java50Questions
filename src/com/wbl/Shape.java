//Write a program creating an abstract class Shape with properties (noOfSides,area,perimeter) and 
//methods(calculateArea,calculatePerimeter,setSides)
package com.wbl;

public  abstract class Shape {
	public abstract double area();
	public abstract double perimeter();
	

}
  class Rectangle extends Shape{
	 private final double width,height;
	 public Rectangle(double width,double height){
		 this.width=width;
		 this.height=height;
		 
	 }
	      
	public double area(){
		System.out.println("Area of Rectangle:");
		return width*height;
	}
	public double perimeter(){
		System.out.println("perimeter of Rectangle: ");
		return 2*(width+height);
	}
	
	public static void main(String[] args) {
	double	width=5;
	double height=8;
		
		
		Shape rectangle= new Rectangle(width,height);
		System.out.println(rectangle.area());
		System.out.println(rectangle.perimeter());
		
		
	}
	}
 
	

