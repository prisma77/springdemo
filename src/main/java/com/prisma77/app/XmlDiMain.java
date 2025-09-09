package com.prisma77.app;

import com.prisma77.service.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlDiMain {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring/di-xml.xml");

        MyService myService = ctx.getBean("myService", MyService.class);
        System.out.println(myService.performAction("XML-DI")); // [XML] Hello, XML-DI
    }
}
