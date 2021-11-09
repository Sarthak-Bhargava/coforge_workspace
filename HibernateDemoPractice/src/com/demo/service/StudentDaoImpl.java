package com.demo.service;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.dao.StudentDAO;
import com.demo.pojo.Student;
import com.demo.util.HibernateUtil;

public class StudentDaoImpl implements StudentDAO
{
	static SessionFactory sessionFactoryObj;
	static Session sessionObj;
	@Override
	public Student createStudent(Student student) {
		Transaction tx = null;
		
		try {
			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			
			// Insert into table and formed the sql query automatically "insert into student values(?,?)
			sessionObj.save(student);
			tx.commit();
		} catch (Exception e) {
			if(tx != null)
				tx.rollback();
			e.printStackTrace();
		}
		
		finally {
			sessionObj.close();
		}
		return student;
		
		
	}
	
	}

