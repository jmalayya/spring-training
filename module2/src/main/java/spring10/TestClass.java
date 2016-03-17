package spring10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jweeta.malayya on 3/15/16.
 */
public class TestClass {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring10.xml");

        Student student = (Student) context.getBean("student");

        System.out.println(student.getStudentName() + "--" + student.getSubject().getSubjectName());
    }
}
