package com.prisma77.app;

import com.prisma77.di1.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/person.xml");
        applicationContext.getBean("person1", Person.class).setName("읭읭");
        System.out.println(applicationContext.getBean("person1", Person.class).getName());
    }
}
