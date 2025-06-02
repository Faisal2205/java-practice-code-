package com.kodewala.main;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodewala.main.beans.payment.Payment;

public class App 
{
    public static void main( String[] args )
    {
        Payment payment = new Payment();
        
        payment.setAmount(150);
        payment.setPaymentStatus("Completed");
        
        Configuration config = new Configuration();
        
        config.configure("\\com\\kodewala\\main\\config\\Hibernate.cfg.xml");
        
        SessionFactory sessionFactory = config.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction txn = session.beginTransaction();
        
        session.save(payment);
        
        txn.commit();
    }
}
