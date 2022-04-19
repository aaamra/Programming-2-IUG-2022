package com.company;

public class Employee extends Person {

    private double salary;

    public Employee(){
        super();
    }

    public Employee(String name, double salary){
        super(name);
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    @Override
//    public void display(){
//        super.display();
//        System.out.println(" , salary : "+ this.getSalary());
//    }
}
