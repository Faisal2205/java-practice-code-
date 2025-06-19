package com.kodewala.aadhar.registration.resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodewala.aadhar.registration.beans.UserInfo;


public class HibernateConfig {

public void doConnection(UserInfo userInfo) {
		
		Configuration config = new Configuration();
		
		config.configure("com\\kodewala\\aadhar\\registration\\resource\\Hibernate.cfg.xml");
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction txn = session.beginTransaction();
		
		session.save(userInfo);
		
		txn.commit();
  }
}
