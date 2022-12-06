package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Subject")
public class Subject 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sId;
	private String sName;
	private int nos;


	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getNos() {
		return nos;
	}
	public void setNos(int nos) {
		this.nos = nos;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public Subject(int sId, String sName, int nos) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.nos = nos;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Subject [sId=" + sId + ", sName=" + sName + ", nos=" + nos + "]";
	}
	
	
}