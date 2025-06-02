package com.kodewala.main;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.main.beans.Employee;
import com.kodewala.main.resource.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
       Employee emp = (Employee) context.getBean("createEmp");
       System.out.println(emp);
    }
}
