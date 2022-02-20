package com.example.demo.stu;

public class IdNotFoundException extends Exception{
	
	IdNotFoundException(){
		
	}
	IdNotFoundException(String str){
		System.out.println(str);
	}

}