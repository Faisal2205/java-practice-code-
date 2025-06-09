package com.kodewala.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String configFile="com\\kodewala\\main\\applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
        User user = (User) context.getBean("userObj");
        
      
        
        user.show();
    }
}
