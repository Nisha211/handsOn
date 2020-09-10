package com.day5;

public class Event {
	protected String name;
	protected String detail;
	protected String ownername;
	public Event() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public Event(String name, String detail, String ownername) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownername = ownername;
	}
	public double projectedRevenue() {
		return 0;
		
		
	}
	

}
