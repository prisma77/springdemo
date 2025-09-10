package com.prisma77.di.di5;

import lombok.Data;

@Data
public class Book {
    private String bookName;
    private int price;
    private String author;
    private String publisher;

    public Book() {

    }

    public Book(String bookName, int price, String author, String publisher) {
        this.bookName = bookName;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
    }



    public void init(){
        System.out.println("init");
    }
    public void destory() {
        System.out.println("destroy");
    }
}
