package com.demo;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO 
{
	public void setDataSource(DataSource ds);
	
	public void createStudent(String name, String age);
	
	public void updateStudentRecord(Student student);
	
	public void deleteStudentById(Integer id);
	
	public Student viewStudentRecordById(Integer id);
	
	public List<Student> listAllStudents();
}
