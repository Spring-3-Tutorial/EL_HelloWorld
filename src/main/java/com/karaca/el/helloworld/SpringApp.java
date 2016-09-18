package com.karaca.el.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author kemalsamikaraca
 */
public class SpringApp {
    
    public static void main(String[] args){
        System.out.println("Deneme");
        
        ApplicationContext content = new ClassPathXmlApplicationContext("Beans.xml");
        
        Customer customer = (Customer)content.getBean("customerBean");
        
        System.out.println(customer.toString());
    }
    
}
