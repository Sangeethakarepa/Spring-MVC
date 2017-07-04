package com.niit.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
ApplicationContext context=new FileSystemXmlApplicationContext("bean.xml");
        Demo greetings=(Demo)context.getBean("helloWorld");
        System.out.println(greetings.getMessage());
       
    }
}
