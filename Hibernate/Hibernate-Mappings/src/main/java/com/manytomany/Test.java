package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

@Entity
public class Test {
	@Id
	private int testId;
	private String testName;
	private int price;
	

	
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(name="patdetails",joinColumns= {@JoinColumn(name="testId")}
	,inverseJoinColumns= {@JoinColumn(name="patientId")})
	private List<Patient> patients = new ArrayList<Patient>();
	
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public Test(int testId, String testName,int price) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.price=price;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

}
