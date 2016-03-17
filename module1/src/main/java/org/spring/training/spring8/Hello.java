package org.spring.training.spring8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by jweeta.malayya on 3/15/16.
 */
public class Hello implements InitializingBean, DisposableBean {

    public void destroy() {
        System.out.println("before destroying bean");
    }

    public void sayHello() {
        System.out.println("Hello!!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after initializing bean");
    }
}
