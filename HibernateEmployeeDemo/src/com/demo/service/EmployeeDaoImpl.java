package com.demo.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.dao.EmployeeDAO;
import com.demo.pojo.Employee;
import com.demo.util.HibernateUtil;


public class EmployeeDaoImpl implements EmployeeDAO {
	static SessionFactory sessionFactoryObj;
	static Session sessionObj;

	@Override
	public Employee createEmployee(Employee employee) {
		Transaction tx = null;
		
		try {
			// enable the session by calling open session method
			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();

			sessionObj.save(employee);// insert into table and formed the sql query automaticall "insert into student values(?,?)
			tx.commit();
		
			}catch(Exception e) {
				
				if (tx != null)
					tx.rollback();
				e.printStackTrace();
			}
			 finally {
					sessionObj.close();
				}
		
		return employee;
	}
	
}
