package com.demo;

import com.demo.pojo.Employee;
import com.demo.service.EmployeeDaoImpl;

public class MainClient {

	public static void main(String[] args) {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		EmployeeDaoImpl employeeDaoImpl1 = new EmployeeDaoImpl();
		Employee employee = new Employee();
		Employee employee1 = new Employee();
		employee.setId(102);
		employee.setFirstName("Shyamlal");
		employee.setLastName("Patel");
		employee.setSalary(50000);
		//employeeDaoImpl.createEmployee(employee);
		System.out.println("Creation done...");
		
		employee.getId();
		// delete API
		employeeDaoImpl.deleteEmployeeById(102);
		System.out.println("deletion done..");
		
		

	}

}
