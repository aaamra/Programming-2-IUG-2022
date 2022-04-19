package com.company;

public class Student {

    private String name;
    private int age;
    private String id;
    private String college;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.equalsIgnoreCase("abdallah")){
            this.name = name;
        }else{
            System.out.println("your are not allowed to set name");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void register(String course){
        System.out.println("you registered this course : " + course);
    }
}
