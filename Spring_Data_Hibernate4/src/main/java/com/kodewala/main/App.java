package com.kodewala.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodewala.main.beans.Employee;

public class App 
{
    public static void main( String[] args )
    {
        Employee employee = new Employee();
        
        employee.setEmpId(1001);
        employee.setEmpName("Faisal");
        employee.setEmpAddress("Bangalore");
        
        Configuration config = new Configuration();
        
        config.configure("\\com\\kodewala\\main\\resource\\Hibernate.cfg.xml");
        
        SessionFactory sessionFactory = config.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
       
        Transaction txn = session.beginTransaction();
        
        session.save(employee);
      
        txn.commit();
    }
}
