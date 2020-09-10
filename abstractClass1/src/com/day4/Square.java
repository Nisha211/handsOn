package com.day4;
import java.util.*;

public class Square extends Shape {
	public float side;
	public double calculatePerimeter() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter side of the square");
		float side=sc.nextFloat();
		sc.nextLine();
		double perimeter=(side*side);
		System.out.println("the perimeter of the square" +perimeter);
		return perimeter;
		
	}
	public Square() {
		
	}
	public Square(float side) {
		super();
		this.side = side;
	}
	public float getSide() {
		return side;
	}
	public void setSide(float side) {
		this.side = side;
	}

}
