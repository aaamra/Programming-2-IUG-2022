package com.company;

public class Main {

    public static void main(String[] args) {

        Shape r = new Rectangle(10,5, "red");
        Shape c = new Circle(5, "blue");

        System.out.println(r.getArea());
        System.out.println(c.getArea());

        r.display();
        c.display();

    }
}
