package com.day4;
import java.util.*;

public class Rectangle extends Shape{
	public float length;
	public float breadth;
	
	public double calculatePerimeter() {
		
		System.out.println("enter length& breadth");
		Scanner sc=new Scanner(System.in);
		float length=sc.nextFloat();
		sc.nextLine();
		float breadth=sc.nextFloat();
		sc.nextLine();
		double perimeter=(2*(length+breadth));
		System.out.println("the perimeter of the rectangle" +perimeter);
		return perimeter;
	}
	public Rectangle() {
		
	}
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getBreadth() {
		return breadth;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}


}
