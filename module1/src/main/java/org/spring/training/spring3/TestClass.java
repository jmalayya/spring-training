package org.spring.training.spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jweeta.malayya on 3/14/16.
 */
public class TestClass {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
        Student student = (Student) context.getBean("student");

        System.out.println(student.getId() + "--" + student.getName() + "--" + student.getHostel().getCity());
    }
}
