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

@Entity
public class Patient {
	@Id
	private int patientId;
	private String patientName;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "testdetails", joinColumns = { @JoinColumn(name = "patientId") }, inverseJoinColumns = {
			@JoinColumn(name = "testId") })
	List<Test> tests = new ArrayList<Test>();

	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public Patient(int patientId, String patientName) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
	}

	public List<Test> getTests() {
		return tests;
	}

	public void setTests(List<Test> tests) {
		this.tests = tests;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

}
