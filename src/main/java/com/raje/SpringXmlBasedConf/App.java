package com.raje.SpringXmlBasedConf;

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
    	ApplicationContext  context = new ClassPathXmlApplicationContext("spring.xml");
    	Vechile obj = (Vechile)context.getBean("vechile");
    	obj.drive();
    }
}
