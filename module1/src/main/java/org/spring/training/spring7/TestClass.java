package org.spring.training.spring7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jweeta.malayya on 3/15/16.
 */
public class TestClass {
    public static void main(String[] arrgs) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring7.xml");
        Hello obj = (Hello) context.getBean("hello");

        obj.sayHello();
        //(AbstractApplicationContext) context.registerShutdownHook();
    }
}
