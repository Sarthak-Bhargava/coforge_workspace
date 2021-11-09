package com.demo;

import com.demo.pojo.Employee;
import com.demo.service.EmployeeDaoImpl;

public class MainClient {

	public static void main(String[] args) {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		Employee employee = new Employee();
		employee.setId(101);
		employee.setFirstName("Ramlal");
		employee.setLastName("lodhi");
		employee.setSalary(50000);
		employeeDaoImpl.createEmployee(employee);
		System.out.println("done...");

	}

}
