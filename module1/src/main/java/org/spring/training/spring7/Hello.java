package org.spring.training.spring7;

/**
 * Created by jweeta.malayya on 3/15/16.
 */
public class Hello {
    public void init() {
        System.out.println("after initializing bean");
    }

    public void destroy() {
        System.out.println("before destroying bean");
    }

    public void sayHello() {
        System.out.println("Hello!!");
    }
}
