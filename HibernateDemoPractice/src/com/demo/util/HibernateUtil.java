package com.demo.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	static SessionFactory sessionFactoryObj;
	static Session sessionObj;
	
	public static SessionFactory buildSessionFactory() {
		// creating configuration Instance and passing Hibernate Configuration File
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		
		// creating Hibernate SessionFactory Instance
		sessionFactoryObj = config.buildSessionFactory(serviceRegistryObj);
		return sessionFactoryObj;
		
	}
}
