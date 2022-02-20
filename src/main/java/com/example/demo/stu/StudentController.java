package com.example.demo.stu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController  {
	
	@RequestMapping("/showstudents")
	public List<Student> getAllStudents() {
		List <Student> stuList= new ArrayList <>();
		stuList.add(new Student(1, "Alok Kumar", 96));
		stuList.add(new Student(2, "Saloni Kumari", 96));
		stuList.add(new Student(3, "Sachin Kumar", 98));
		stuList.add(new Student(4, "Rashi Kumari", 87));
		stuList.add(new Student(5, "Ravikant Kumar", 92));
		stuList.add(new Student(6, "Tinku Kumar", 84));
		stuList.add(new Student(7, "Suresh Kumar", 92));
		stuList.add(new Student(8, "Mahesh Kumar", 94));
		stuList.add(new Student(9, "Pankaj Kumar", 95));
		stuList.add(new Student(10, "Subham Kumar", 78));
		
		Collections.sort(stuList, new StuNameComp());
		return stuList;
	}
	
	
	
	@RequestMapping(value="/searchbyid/{id}")
	@ResponseBody
	public String Studentbyid(@PathVariable int id) {
		List <Student> stuList= new ArrayList <>();
		stuList= getAllStudents();
			String res=" ";
		boolean flag = false;
		for(Student st: stuList) {
			if(st.getStuId()==id) {
				res= st.getStuId()+" "+ st.getStuName() +" "+ st.getMarks();	
				flag=true;
			}
		}
	
			return res;
		
		
		
	}
	
	@RequestMapping(value="/updatemarks/{marks}/toid/{id}")
	@ResponseBody
	
	public String updateMarksById(@PathVariable int id, @PathVariable double marks ) {
		List <Student> stuList= new ArrayList <>();
		stuList= getAllStudents();
		String res=" ";
		boolean flag = false;
		for(Student st: stuList) {
			if(st.getStuId()==id) {
				st.setMarks(marks);
				res= st.getStuId()+" "+ st.getStuName() +" "+ st.getMarks();
				
			}
			
		}
		
			return res;
		
	}

}
