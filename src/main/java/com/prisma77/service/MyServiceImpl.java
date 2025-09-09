package com.prisma77.service;


import com.prisma77.repository.MyRepository;


public class MyServiceImpl implements MyService{

    private final MyRepository myRepository;
    private String prefix = "[DEFAULT]";

    public MyServiceImpl(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String performAction(String name) {
        return prefix + " " + myRepository.getMessage(name);
    }


}
