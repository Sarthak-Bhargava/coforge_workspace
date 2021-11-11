package com.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeJdbcRowMapper implements RowMapper<Employee> 
{
	

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp = new Employee();
			// mapping result in colum
			
			emp.setId(rs.getInt("id"));
			emp.setFirstName(rs.getString("firstName"));
			emp.setLastName(rs.getString("lastName"));
			emp.setSalary(rs.getInt("salary"));
			return emp;
		}
		
	}

