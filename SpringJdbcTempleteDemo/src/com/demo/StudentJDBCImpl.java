package com.demo;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCImpl implements StudentDAO {
	
	private DataSource dataSourceprop;
	private JdbcTemplate JdbcTemplateobject;
	
	

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSourceprop=ds;
		this.JdbcTemplateobject= new JdbcTemplate(dataSourceprop);
		
		
	}

	@Override
	public void createStudent(String studname, String age) {
		String sql = "insert into student (studname, age) value(?,?)";
		JdbcTemplateobject.update(sql, studname, age);
		
		return;
		
	}

	@Override
	public void updateStudentRecord(Student student) {
		String updateStudentRecord = "UPDATE student SET studname = ?, age = ? where id = ?";
		JdbcTemplateobject.update(updateStudentRecord, new Object[] {
			student.getStudname(),student.getAge(), Integer.valueOf(student.getId())
		});
		}
		
	

	@Override
	public void deleteStudentById(Integer id) {
		String deleteQuery = "DELETE FROM student WHERE id = ?";
		this.JdbcTemplateobject.update(deleteQuery, id);
		
	}

	@Override
	public Student viewStudentRecordById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> listAllStudents() {
		
		List<Student> studentList = new ArrayList<Student>();
		String studentListSql = "SELECT * FROM student";
		
		studentList = JdbcTemplateobject.query(studentListSql, new BeanPropertyRowMapper(Student.class));
		
		return studentList;
	}
	
}
