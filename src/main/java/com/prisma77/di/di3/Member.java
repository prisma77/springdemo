package com.prisma77.di.di3;

public class Member {
    private Long id;
    private String name;

    public Member() { }
    public Member(Long id, String name) {
        this.id = id; this.name = name;
    }
    public Long getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Member{id=" + id + ", name='" + name + "'}";
    }
}