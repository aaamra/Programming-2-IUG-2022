package com.company;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void display() {
        System.out.println("----------------");
        System.out.println("|              |");
        System.out.println("|              |");
        System.out.println("|      "+ super.getColor() +"        |");
        System.out.println("|              |");
        System.out.println("|              |");
        System.out.println("|              |");
        System.out.println("----------------");
    }


    @Override
    public double getArea() {
        return 5;
    }

    @Override
    public double getPerimeter() {
        return 3;
    }
}
