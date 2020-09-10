package com.day4;
import java.util.*;

public class Circle extends Shape {

	public float radius;
	public double calculatePerimeter() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of the circle");
		float radius=sc.nextFloat();
		sc.nextLine();
		double perimeter=2*3.14*radius;
		System.out.println("the perimeter of the circle" +perimeter);
		return perimeter;
	
		
	}
	public Circle() {
		
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public Circle(float radius) {
		super();
		this.radius = radius;
	}

}
