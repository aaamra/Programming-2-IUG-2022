package com.company;

public class Product {

    // private attributes
    private String id;
    private String name;
    private String brand;
    private int quantity;
    private double price;

    // private static variable that stores the number of object have been created
    private static int count = 0;

    // default constructor
    public Product() {
        // increment the counter when we create a new object when we use the default constructor
        count++;
    }

    // constructor that takes some params and initialize some attributes
    public Product(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;

        // increment the counter when we create a new object using this constructor
        count++;
    }

    // static method
    public static int getCount() {
        return count;
    }

    // getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // to string method
    // this method will be executed when we print the object
    // if we did not created it. it will return the hex string of the hash code (memory location)
    @Override
    public String toString() {
        return "id : " + this.id + " , name : " + this.name + " , quantity : " + this.quantity;
    }
}
