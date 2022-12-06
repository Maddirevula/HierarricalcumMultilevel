package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Department")
public class Department 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dId;
	private String dName;
	private int nos;
	
	@Column
	@ElementCollection(targetClass =Subject.class )
	@OneToMany(targetEntity = Subject.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "dId",referencedColumnName = "dId")
	private List<Subject> subject;

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public int getNos() {
		return nos;
	}

	public void setNos(int nos) {
		this.nos = nos;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	public Department(int dId, String dName, int nos, List<Subject> subject) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.nos = nos;
		this.subject = subject;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + ", nos=" + nos + ", subject=" + subject + "]";
	}

	
	
	
}
