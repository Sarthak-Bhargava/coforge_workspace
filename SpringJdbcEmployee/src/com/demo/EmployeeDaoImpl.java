package com.demo;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDAO {
	private DataSource dataSourceprop;
	private JdbcTemplate JdbcTemplateobject;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSourceprop=ds;
		this.JdbcTemplateobject= new JdbcTemplate(dataSourceprop);
		
	}

	@Override
	public void createEmployee(String firstName, String lastName, int salary) {
		String sql = "insert into student (firstName, lastName, salary) value(?,?)";
		JdbcTemplateobject.update(sql, firstName, lastName, salary);
		
		return;
		
	}

	@Override
	public void updateEmployeeRecord(Employee employee) {
		String updateEmployeeRecord = "UPDATE employee SET firstName = ?, lastName = ?, salary = ?, where id = ?";
		JdbcTemplateobject.update(updateEmployeeRecord, new Object[] {
			employee.getFirstName(),employee.getLastName(),employee.getSalary(), Integer.valueOf(employee.getId())
		});
		
	}

	@Override
	public void deleteEmployeeById(Integer id) {
		String deleteQuery = "DELETE FROM employee WHERE id = ?";
		this.JdbcTemplateobject.update(deleteQuery, id);
		
	}

	@Override
	public Employee viewEmployeeRecordById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> listAllStudents() {
		List<Employee> employeeList = new ArrayList<Employee>();
		String employeeListSql = "SELECT * FROM employee";
		
		employeeList = JdbcTemplateobject.query(employeeListSql, new BeanPropertyRowMapper(Employee.class));
		
		return employeeList;
	}

}
