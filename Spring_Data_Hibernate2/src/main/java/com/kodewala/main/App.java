package com.kodewala.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodewala.main.beans.user.UserOrders;

public class App 
{
    public static void main( String[] args )
    {
       UserOrders userOrders = new UserOrders() ;
       
        userOrders.setItemId(252634);
        userOrders.setItemName("MSI Laptop");
        userOrders.setItemPrice(50000);
        
        Configuration config = new Configuration();
        
        config.configure("\\com\\kodewala\\main\\resource\\Hibernate.cfg.xml");
        
        SessionFactory sessionFactory = config.buildSessionFactory();
       
        Session session = sessionFactory.openSession();
       
        Transaction txn = session.beginTransaction();
      
        session.save(userOrders);
        
        txn.commit();
    }
}
