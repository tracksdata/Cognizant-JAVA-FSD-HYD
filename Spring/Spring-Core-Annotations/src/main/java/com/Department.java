package com;

import org.springframework.stereotype.Component;

@Component("dept")
public class Department {

	private int deptId=1;
	private String deptName="HR";

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
