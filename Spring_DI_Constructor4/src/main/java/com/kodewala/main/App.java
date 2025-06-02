package com.kodewala.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.main.beans.User;
import com.kodewala.main.config.Config;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        User user =(User) context.getBean("createUser");
        System.out.println(user);
    }
}
