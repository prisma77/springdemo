package com.prisma77.di.di6;

import com.prisma77.di.di5.BookStore2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DbmsMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/dbms.xml");
        System.out.println(context.getBean("server1"));

    }

}