package com.example.demo.stu;

public class Student {
	private int stuId;
	private String stuName;
	private double marks;

	Student(){
		
	}
	
	Student(int stuId, String stuName, double marks) {
		
		this.stuId = stuId;
		this.stuName = stuName;
		this.marks = marks;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	

}
