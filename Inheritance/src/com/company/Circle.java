package com.company;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.PI * radius;
    }

    @Override
    public void display() {
        System.out.println("() دائرة" + "  " + this.getColor());
    }
}
