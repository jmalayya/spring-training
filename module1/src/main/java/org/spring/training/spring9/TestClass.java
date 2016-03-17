package org.spring.training.spring9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jweeta.malayya on 3/15/16.
 */
public class TestClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring9.xml");
        Welcome obj = (Welcome) context.getBean("welcome");

        obj.setMessage("1st message");
        System.out.println(obj.getMessage());

        obj = (Welcome) context.getBean("welcome");
        System.out.println(obj.getMessage());
    }
}
