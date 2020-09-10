package com.day4;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Circle,2.rectangle,3.square");
		int a=sc.nextInt();
		sc.nextLine();
		switch(a) {
		case 1:
			Shape s=new Circle();
			s.calculatePerimeter();  
			break;
		case 2:
			Shape s1=new Rectangle();
			s1.calculatePerimeter();
			break;
			
		case 3:
			Shape s2=new Square();
			s2.calculatePerimeter();
			break;
	 

	}

}
}
