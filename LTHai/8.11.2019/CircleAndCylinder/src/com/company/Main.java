package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle circle = new Circle(3.5, "blue");
        System.out.println(circle.toString());

        Cylinder cylinder= new Cylinder(4.5, "purple", 8.4);
        System.out.println(cylinder.toString());
    }
}
