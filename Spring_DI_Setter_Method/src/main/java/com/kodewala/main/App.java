package com.kodewala.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.main.beans.Employee;
import com.kodewala.main.resource.SpringConfig;


import io.micrometer.observation.Observation.Context;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(SpringConfig.class);
        
       Employee employee =  (Employee) applicationContext.getBean("emp");
       
       System.out.println(employee);
        
    }
}
