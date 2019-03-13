package com.aopdemo;

import com.aopdemo.dao.AccountDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 8e3Yn4uK on 13.03.2019
 */

public class MainDemoApp {
    public static void main(String[] args) {

        // read the spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from the spring container
        AccountDao theAccountDao = context.getBean("accountDao", AccountDao.class);

        // call the business method
        theAccountDao.addAccount();

        // close the context
        context.close();
    }
}