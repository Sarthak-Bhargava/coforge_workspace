package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee;

public class EmployeeDAOImpl  implements EmployeeDao {

	@Override
	public List<Employee> getAllEmployees() {
		//these values are coming db, we just mocked here
		
		
		//this is our bunisness logic which is called by service class
	   List<Employee> listofemployee= new ArrayList<Employee>();
	   
	   Employee listemp = new Employee();
	   
	   listemp.setId(101);
	   listemp.setFirstName("ram");
	   listemp.setLastName("kumar");
	   
	   listofemployee.add(listemp);
		
		return listofemployee;
	}

}
