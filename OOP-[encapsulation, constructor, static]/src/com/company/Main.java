package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Student s1 = new Student();
        s1.setName("ali");
        s1.setId("123");


        System.out.println(s1.getName());
        s1.register("Java 2");







//        Scanner scanner = new Scanner(System.in);
//
//        Product[] products = new Product[3];
//
//        for (int i = 0; i < products.length; i++) {
//
//            // read id , name and quantity from keyboard
//            System.out.print("Enter Product " + (i + 1) + " id : ");
//            String id = scanner.next();
//
//            System.out.print("Enter Product " + (i + 1) + " Name : ");
//            String name = scanner.next();
//
//            System.out.print("Enter Product " + (i + 1) + " Quantity : ");
//            int quantity = scanner.nextInt();
//
//
//            // stores new object from product class in each array index
//            products[i] = new Product(id, name, quantity);
//        }
//
//        System.out.println("");
//
//        // print all products stored in [products] array
//        for (Product p : products) {
//            // notice here we are printing the object
//            // because we have created the to string method
//            // when we print the object the to string will be executed
//            System.out.println(p);
//        }
//
//
//        System.out.println();
//
//        // call a static method from the Product class
//        System.out.println("Number of Products : " + Product.getCount());

    }

}
