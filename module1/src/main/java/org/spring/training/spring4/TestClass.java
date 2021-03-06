package org.spring.training.spring4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jweeta.malayya on 3/14/16.
 */
public class TestClass {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");
        Student student = (Student) context.getBean("new_student");

        System.out.println(student.getId() + "--" + student.getName() + "--" + student.getHostel().getCity());
    }
}
