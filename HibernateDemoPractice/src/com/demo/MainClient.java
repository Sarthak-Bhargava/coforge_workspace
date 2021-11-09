package com.demo;

import com.demo.pojo.Student;
import com.demo.service.StudentDaoImpl;

public class MainClient {

	public static void main(String[] args) {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		Student student = new Student();
		
		student.setId(101);
		student.setStudname("Pallavi");
		student.setAge("24");
		studentDaoImpl.createStudent(student);
		
		System.out.println("Done...");

	}

}
