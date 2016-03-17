package spring13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jweeta.malayya on 3/16/16.
 */
public class TestClass {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring13.xml");

        Student student = (Student) ctx.getBean("student");
        System.out.println(student.getHostel().getHostelName() + "--" + student.getHostel().getCity() + "--" + student.getName());

    }
}
