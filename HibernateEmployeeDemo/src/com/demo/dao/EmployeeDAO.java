package com.demo.dao;

import com.demo.pojo.Employee;

public interface EmployeeDAO {
	public Employee createEmployee(Employee employee);
	
	public void deleteEmployeeById(Integer id);
	
	public Employee updateStudentById(Employee employee);

}
