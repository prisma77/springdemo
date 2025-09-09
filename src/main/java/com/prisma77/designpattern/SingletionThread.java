package com.prisma77.designpattern;

public class SingletionThread {
    private static SingletionThread instance;

    private SingletionThread() {}

    public static SingletionThread getInstance() {
        if(instance==null) {
            instance=new SingletionThread();
        }
        return instance;
    }
}
