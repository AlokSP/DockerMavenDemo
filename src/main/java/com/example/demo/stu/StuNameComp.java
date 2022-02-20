package com.example.demo.stu;

import java.util.Comparator;

public class StuNameComp implements Comparator< Student>{
	
	public int compare(Student st1, Student st2 ) {
		
			return st1.getStuName().compareTo(st2.getStuName());
		
	
}
}
