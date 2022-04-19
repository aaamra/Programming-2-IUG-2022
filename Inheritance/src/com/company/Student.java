package com.company;

public class Student extends Person {

    private int id;
    private String college;


    public Student(){  super(); }

    public Student(String name, int id, String college){
        super(name);
        this.id = id;
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public void display() {
        System.out.println("name : " + this.getName() + " , id : " + this.id + ", college : " + this.college);
    }
}
