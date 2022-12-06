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
@Table(name = "College")
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	private String cName;
	private int aoc;
	private String location;

	@Column
	@ElementCollection(targetClass = Department.class)
	@OneToMany(targetEntity = Department.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cId", referencedColumnName = "cId")
	private List<Department> departments;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getAoc() {
		return aoc;
	}

	public void setAoc(int aoc) {
		this.aoc = aoc;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public College(int cId, String cName, int aoc, String location, List<Department> departments) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.aoc = aoc;
		this.location = location;
		this.departments = departments;
	}
	

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "College [cId=" + cId + ", cName=" + cName + ", aoc=" + aoc + ", location=" + location + ", departments="
				+ departments + "]";
	}
	

}
