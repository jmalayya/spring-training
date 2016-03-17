package org.spring.training.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jweeta.malayya on 3/14/16.
 */
public class TestClass {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
        User user = (User) context.getBean("user");

        System.out.println(user.getCar().getName() + "--" + user.getCar().getPerDayCost());
    }
}
