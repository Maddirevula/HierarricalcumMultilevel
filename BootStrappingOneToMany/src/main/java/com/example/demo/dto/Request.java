package com.example.demo.dto;

import com.example.demo.model.College;

public class Request 
{
	
	private College college;

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Request(College college) {
		super();
		this.college = college;
	}

	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Request [college=" + college + "]";
	}	

}
