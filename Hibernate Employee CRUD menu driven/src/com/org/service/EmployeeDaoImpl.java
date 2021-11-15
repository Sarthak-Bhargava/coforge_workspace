package com.org.service;

import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Query;
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
	Scanner sc = new Scanner(System.in);
	
	@Override
	public Employee getEmployeeList() {
		Employee employee = null;
		try {
			session = HibernateUtil.buildSessionFactory().openSession();
			Query q= session.createQuery("from Employee");
			List<Employee> employeeList = (List<Employee>)q.list();
			for(Employee temp : employeeList) {
				System.out.println(temp.getId()+
									":\n"+temp.getFirstName()+
									":\n"+temp.getLastName()+
									":\n"+temp.getDesignation()+
									":\n"+temp.getSalary());
			}
		} catch (HibernateException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return employee;
		
		
	}

	

	@Override
	public void getEmployeeById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee updateEmployee(int id) {
		Transaction tx = null;
		Employee employee = null;
		
		try {
			session = HibernateUtil.buildSessionFactory().openSession();
			tx = session.beginTransaction();
			employee = (Employee) session.get(Employee.class, id);
			System.out.println("Enter designation");
			employee.setDesignation(sc.nextLine());
			System.out.println("Enter salary");
			employee.setSalary(sc.nextInt());
			
			session.save(employee);
			tx.commit();
			System.out.println("Record updated");
		} catch (HibernateException e) {
			if(tx !=null)
				tx.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return employee;
		
	}

	@Override
	public void deleteEmployee(int id) {
		Transaction tx = null;
		Employee employee = null;
		
		try {
			session = HibernateUtil.buildSessionFactory().openSession();
			tx = session.beginTransaction();
			employee = searchById(id);
			session.delete(employee);
			//session.getTransaction().commit();
			System.out.println("deleted...");
			tx.commit();
		} catch (HibernateException e) {
			
			e.printStackTrace();
		}
		finally {
			if(session !=null)
				session.close();
		}
		
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



	@Override
	public Employee searchById(int id) {
		Transaction tx = null;
		Employee searchById = null;
		
		try {
			session = HibernateUtil.buildSessionFactory().openSession();
			tx = session.beginTransaction();
			searchById = (Employee) session.load(Employee.class, id);
			tx.commit();
			System.out.println("Found by ID"+searchById.getId());
		} catch (HibernateException e) {
			if(tx != null)
				tx.rollback();
			e.printStackTrace();
		}
		return searchById;
	}



	



	

	

}
