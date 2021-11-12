package com.org.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.org.pojo.Employee;
import com.org.dao.EmployeeDAO;
import com.org.util.HibernateUtil;


public class EmployeeDaoImpl implements EmployeeDAO {
	static SessionFactory sessionfactory;
	static Session session;
	
	@Override
	public void getEmployeeList() {
		
		
	}

	

	@Override
	public void getEmployeeById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Employee addEmployee(Employee employee) {
		Transaction tx = null;
		try {
			session = HibernateUtil.buildSessionFactory().openSession();
			 tx = session.beginTransaction();
			session.save(employee);
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		}
		return employee;
	}



	



	

	

}
