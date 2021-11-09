package com.demo.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	static SessionFactory sessionfactoryobj;
	static Session sessionobj;

	public static SessionFactory buildSessionFactory() {

		// Creating Configuration Instance & Passing Hibernate Configuration File
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		// Since Hibernate Version 4.x, ServiceRegistry Is Being Used
		ServiceRegistry serviceRegistryobj = new StandardServiceRegistryBuilder().applySettings(config.getProperties())
				.build();

		// Creating Hibernate SessionFactory Instance

		sessionfactoryobj = config.buildSessionFactory(serviceRegistryobj);
		return sessionfactoryobj;

	}

}
