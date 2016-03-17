package org.spring.training.assignment;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by jweeta.malayya on 3/14/16.
 */
public class InitDisposableBean implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.print("#####in afterPropertiesSet#####");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("====in destroy====");
    }
}
