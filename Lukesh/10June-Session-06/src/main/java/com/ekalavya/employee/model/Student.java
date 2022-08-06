package com.ekalavya.employee.model;

public class Student {

	private String rollno;

	private String stuName;

	private String stuCity;

	private String stuState;

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuCity() {
		return stuCity;
	}

	public void setStuCity(String stuCity) {
		this.stuCity = stuCity;
	}

	public String getStuState() {
		return stuState;
	}

	public void setStuState(String stuState) {
		this.stuState = stuState;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", stuName=" + stuName + ", stuCity=" + stuCity + ", stuState=" + stuState
				+ "]";
	}

	public Student(String rollno, String stuName, String stuCity, String stuState) {
		super();
		this.rollno = rollno;
		this.stuName = stuName;
		this.stuCity = stuCity;
		this.stuState = stuState;
	}

}
