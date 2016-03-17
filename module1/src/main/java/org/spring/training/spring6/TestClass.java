package org.spring.training.spring6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jweeta.malayya on 3/14/16.
 */
public class TestClass {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring6.xml");
        Database database = (Database) context.getBean("database");

        System.out.println(database.getNoSqls());
    }

}
