package spring13;

/**
 * Created by jweeta.malayya on 3/16/16.
 */
public class Student {

    private String name;
    private String id;
    private Hostel hostel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Hostel getHostel() {
        return hostel;
    }

    public void setHostel(Hostel hostel) {
        this.hostel = hostel;
    }
}
