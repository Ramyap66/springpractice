package com.college.model;

public class Student {
	
	int id;
	String name;
	String branch;
	String email;
	String address;
	int phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public Student(int id, String name, String branch, String email, String address, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", email=" + email + ", address="
				+ address + ", phone=" + phone + "]";
	}
	
	

}
