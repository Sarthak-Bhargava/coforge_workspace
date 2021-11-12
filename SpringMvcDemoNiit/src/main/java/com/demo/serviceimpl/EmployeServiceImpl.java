package com.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.dao.EmployeeDAOImpl;
import com.demo.model.Employee;
import com.demo.service.EmployeeSevice;


public class EmployeServiceImpl  implements EmployeeSevice {
	// this is my service class implementatin which interact with dao and its implemention class
	
	@Autowired
	EmployeeDAOImpl employeeDAOImpl;

	@Override
	public List<Employee> showAllEmployee() {
		
		List<Employee> emplist =employeeDAOImpl.getAllEmployees();
		
		return emplist;
	}


}
