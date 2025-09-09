package com.prisma77.repository;

import org.springframework.stereotype.Repository;

public class MemoryMyRepository implements MyRepository{

    @Override
    public String getMessage(String name) {
        return "Hello, " + name;
    }

}
