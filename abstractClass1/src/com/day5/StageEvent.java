package com.day5;

public class StageEvent extends Event{
	public int noOfshow;
	public int noOfseatspershow;
	
	public StageEvent() {
		
	}
	
	
	public int getNoOfshow() {
		return noOfshow;
	}


	public void setNoOfshow(int noOfshow) {
		this.noOfshow = noOfshow;
	}


	public int getNoOfseatspershow() {
		return noOfseatspershow;
	}


	public void setNoOfseatspershow(int noOfseatspershow) {
		this.noOfseatspershow = noOfseatspershow;
	}


	public StageEvent(String name, String detail, String ownername, int noOfshow, int noOfseatspershow) {
		super(name, detail, ownername);
		this.noOfshow = noOfshow;
		this.noOfseatspershow = noOfseatspershow;
	}


	public double projectedRevenue() {
		super.projectedRevenue();
		double a=noOfshow*noOfseatspershow*50;
		System.out.println(a);
		return a;
	}
	

}
