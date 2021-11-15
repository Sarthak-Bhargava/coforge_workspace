package com.org.dao;

import com.org.pojo.Employee;

public interface EmployeeDAO {
	public Employee getEmployeeList();
	public Employee addEmployee(Employee employee);
	public void getEmployeeById(int id);
	public Employee updateEmployee(int id);
	public void deleteEmployee(int id);
	
	// searchById
	public Employee searchById(int id);
}
