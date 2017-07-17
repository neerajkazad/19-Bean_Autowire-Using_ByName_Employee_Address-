package com.ba.beans;

public class Employee {
	private String empName;
	private Address address;

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", address=" + address + "]";
	}
	
	
}
