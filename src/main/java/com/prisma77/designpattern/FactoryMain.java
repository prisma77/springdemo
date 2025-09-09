package com.prisma77.designpattern;

interface Product{
    void use();
}

class ProductA implements Product{
    @Override
    public void use() {
        System.out.println("use A");
    }
}

class ProductB implements Product{
    @Override
    public void use() {
        System.out.println("use B");
    }
}



class SimpleFactory {
    public static Product createProduct(String type){
        if(type.equals("A")){
            return new ProductA();
        }else if(type.equals("B")){}
        return null;
    }

}

public class FactoryMain {
    public static void main(String[] args) {

    }
}
