package com.prisma77.aop.aop2;

import com.prisma77.repository.ActionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aop2Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AspectConfig.class);
//        System.out.println(applicationContext.getBean("actionServiceImp"));//비즈니스로직 수행을 하기위한 객체
        ActionService actionService= applicationContext.getBean("actionServiceImp", ActionService.class);
        actionService.showMessage();//비즈니스로직 수행...
        System.out.println(applicationContext.getBean("pop"));
    }
}