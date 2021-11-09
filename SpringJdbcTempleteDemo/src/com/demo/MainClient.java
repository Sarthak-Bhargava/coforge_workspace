package com.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentJDBCImpl studentJDBCImpl = (StudentJDBCImpl)context.getBean("studentdao");
		
		System.out.println("record creation : ");
		studentJDBCImpl.createStudent("Sarthak", "24");
		studentJDBCImpl.createStudent("Akash", "25");
		
		// update operation 
		Student student = new Student();
		student.setId(2);
		student.setStudname("tom little");
		student.setAge("30");
		
		studentJDBCImpl.updateStudentRecord(student);
		
		// delete operation
		studentJDBCImpl.deleteStudentById(4);
		
		// retrieval  of  the list of student from database
		List<Student> listOfStudent = studentJDBCImpl.listAllStudents(); {
			for(Student stud:listOfStudent) {
				String studentName = stud.getStudname();
				String age = stud.getAge();
				System.out.println("student name: "+studentName+" student age "+age);
			}
		}
		System.out.println("done....");
		

	}

}
