package com.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentJdbcRowMapper implements RowMapper<Student> 
{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student stud = new Student();
		// mapping result in colum
		
		stud.setId(rs.getInt("id"));
		stud.setStudname(rs.getString("studname"));
		stud.setAge(rs.getString("age"));
		return stud;
	}
	
}
