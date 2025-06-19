package com.aadhar.registration.configuration;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aadhar.registration.beans.AadharUserDetails;

public class HibernateConfig {

	public void doConnection(AadharUserDetails aadharUserDetails) {
		
		Configuration config = new Configuration();
		
		config.configure("com\\aadhar\\registration\\configuration\\Hibernate.cfg.xml");
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction txn = session.beginTransaction();
		
		session.save(aadharUserDetails);
		
		txn.commit();
	}
}
