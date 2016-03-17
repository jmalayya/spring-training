package spring12;

import javax.annotation.Resource;

/**
 * Created by jweeta.malayya on 3/16/16.
 */
public class B {

    private A a;

    public A getA() {
        return a;
    }

    @Resource(name = "aBean")
    public void setA(A a) {
        this.a = a;
    }

    public void bMethod() {
        System.out.println("This is bMethod");
        a.aMethod();
    }
}
