package com.kodewala.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.main.beans.Zepto;
import com.kodewala.main.reso.Configg;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configg.class);
        
        Zepto zepto = (Zepto) context.getBean("createZepto");
        
        System.out.println(zepto);
    }
}
