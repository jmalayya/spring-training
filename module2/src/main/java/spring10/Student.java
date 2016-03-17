package spring10;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jweeta.malayya on 3/15/16.
 */
public class Student {

    private String studentName;
    @Autowired
    private Subject subject;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}