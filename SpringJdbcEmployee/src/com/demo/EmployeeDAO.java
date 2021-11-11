package com.demo;

import java.util.List;

import javax.sql.DataSource;

public interface EmployeeDAO {
public void setDataSource(DataSource ds);
	
	public void createEmployee(String firstName, String lastName, int salary);
	
	public void updateEmployeeRecord(Employee employee);
	
	public void deleteEmployeeById(Integer id);
	
	public Employee viewEmployeeRecordById(Integer id);
	
	public List<Employee> listAllStudents();
}
