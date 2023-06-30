package com.employee.sample.model;

public class Employee {

	String employeename;
	String mailid;
	int number;
	String state;
	String job_role;
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getJob_role() {
		return job_role;
	}
	public void setJob_role(String job_role) {
		this.job_role = job_role;
	}
	public Employee(String employeename, String mailid, int number, String state, String job_role) {
		super();
		this.employeename = employeename;
		this.mailid = mailid;
		this.number = number;
		this.state = state;
		this.job_role = job_role;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [employeename=" + employeename + ", mailid=" + mailid + ", number=" + number + ", state="
				+ state + ", job_role=" + job_role + "]";
	}

}
