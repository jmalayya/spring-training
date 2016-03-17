package org.spring.training.spring4;

/**
 * Created by jweeta.malayya on 3/14/16.
 */
public class Student {
    private String name;
    private String id;
    Hostel hostel;

    public Hostel getHostel() {
        return hostel;
    }

    public void setHostel(Hostel hostel) {
        this.hostel = hostel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
