package com.company;

public class Person {

    private String name;

    // overloading
    public Person(){
    }

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.print("name : "+ this.name);
    }
}
