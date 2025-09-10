package com.prisma77.di.di4;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/persondi.xml");
        PersonCollection personCollection=(PersonCollection)context.getBean("pCollection");
//		 for(Person p:personCollection.getList()) {
//			 System.out.println(p);
//		 }
//		Iterator<Person>iter= personCollection.getSet().iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//		Iterator<Entry<Object, Object>>iter= personCollection.getProperties().entrySet().iterator();
//		while(iter.hasNext()) {
//			Entry<Object, Object>entry=iter.next();
//			System.out.println(entry.getKey()+" "+entry.getValue() );
//		}
        Map<Integer, Person>map=personCollection.getMap();
        Set<Integer>set=map.keySet();
        for(Integer i:set) {
            System.out.println(i+" "+map.get(i));
        }

    }

}