package com.day5;

public class Exhibition extends Event {
	public int noOfstall;
	public Exhibition() {
		
	}

	
	public int getNoOfstall() {
		return noOfstall;
	}


	public void setNoOfstall(int noOfstall) {
		this.noOfstall = noOfstall;
	}


	public Exhibition(String name, String detail, String ownername, int noOfstall) {
		super(name, detail, ownername);
		this.noOfstall = noOfstall;
	}


	public double projectedRevenue() {
		super.projectedRevenue();
		double a=(noOfstall*10000);
		System.out.println(a);
		return a;
		
	}

}
