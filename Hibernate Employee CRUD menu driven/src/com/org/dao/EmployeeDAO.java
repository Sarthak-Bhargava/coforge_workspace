package com.org.dao;

import com.org.pojo.Employee;

public interface EmployeeDAO {
	public void getEmployeeList();
	public Employee addEmployee(Employee employee);
	public void getEmployeeById(int id);
	public void updateEmployee(int id);
	public void deleteEmployee(int id);
}
