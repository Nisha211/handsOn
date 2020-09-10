package com.day5;
import java.util.*;


public class Main extends Event {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of the event");
		String a=sc.nextLine();
		System.out.println("enter the detail of the event");
		String b=sc.nextLine();
		System.out.println("enter the owner name of the event");
		String c=sc.nextLine();
		System.out.println(("1.exhibition,2.stage event"));
		int d=sc.nextInt();
		
		switch(d) {
		case 1:
			System.out.println("enter the number of stalls");
			int noOfstall=sc.nextInt();
			sc.nextLine();
			Exhibition  e=new Exhibition();
			e.setNoOfstall(noOfstall);
			e.projectedRevenue();
			break;
		case 2:
			System.out.println("enter the number of shows");
			int noOfshow=sc.nextInt();
			System.out.println("enter the number of seats");
			int noOfseatspershow=sc.nextInt();
			sc.nextLine();
			StageEvent se=new StageEvent();
			se.setNoOfshow(noOfshow);
			se.setNoOfseatspershow(noOfseatspershow);
			se.projectedRevenue();	
			break;
			
	}

}
}
