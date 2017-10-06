//Write a program creating an interface Shape Constants with variable(pi=3.14).
package com.wbl;

interface Shapes{
	public final double pi=3.14;
	void  circleArea(int radius);
	void CircleCircumference(int radius);
	
}

class CircleShape implements Shapes{
        

	public void circleArea(int radius) {
		double Area=pi*radius*radius;
		System.out.println("Area of the Circle: "+Area);
	}


	public void CircleCircumference(int radius) {
		double circumference=2*pi*radius;
		System.out.println("Circumference of the Cicle: "+circumference);
	}
	
}

public class InterfaceShapeConstant {
	public static void main(String[] args) {
		CircleShape circle=new CircleShape();
		circle.circleArea(10);
		circle.CircleCircumference(12);
		
	}

}
