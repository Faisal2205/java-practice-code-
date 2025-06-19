package com.kodewala.aadhar.registration.cofiguration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodewala.aadhar.registration.beans.AadharUserInfo;

public class HibernateConfig {

	public void getConnection(AadharUserInfo aadharUserInfo)
	{
		 Configuration config = new Configuration();
	        
	        config.configure("com\\kodewala\\aadhar\\registration\\cofiguration\\Hibernate.cfg.xml");
	        
	        SessionFactory sessionFactory = config.buildSessionFactory();
	        
	        Session session = sessionFactory.openSession();
	        
	        Transaction txn = session.beginTransaction();
	        
	        session.save(aadharUserInfo);
	        
	        txn.commit();
	}
	
	
}
