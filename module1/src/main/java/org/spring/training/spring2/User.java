package org.spring.training.spring2;

/**
 * Created by jweeta.malayya on 3/14/16.
 */
public class User {
    private Car car;

    public Car getCar() {
        return car;
    }

    public User(Car car) {
        this.car = car;
    }
}
