package com.prisma77.aop.aop2;

import com.prisma77.di.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.prisma77.repository","com.prisma77.aop.aop2"})
@EnableAspectJAutoProxy
public class AspectConfig {//xml이 필요없지요...

    @Bean(name = "pop")
    public Person getPrson(){
        return new Person();
    }


}