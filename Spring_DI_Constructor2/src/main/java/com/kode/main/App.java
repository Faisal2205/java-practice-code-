package com.kode.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kode.main.beans.Employee;
import com.kode.main.resource.Config;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        
        Employee employee = (Employee) context.getBean("createEmp");
        
        System.out.println(employee);
    }
}
