package spring11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jweeta.malayya on 3/16/16.
 */
public class TestClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring11.xml");
        BoxOffice bo = (BoxOffice) context.getBean("boxOffice");

        bo.currentPlaying();
        bo.clearMovies();
        bo.currentPlaying();
    }
}
