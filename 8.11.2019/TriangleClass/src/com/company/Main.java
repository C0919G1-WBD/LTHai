package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape s1 = new Shape();
        System.out.println(s1.toString());
        Shape s2 = new Shape("orange", false);
        System.out.println(s2.toString());

        Triangle tri1 = new Triangle();
        System.out.println(tri1.toString());
        Triangle tri2 = new Triangle(4,5,6);
        System.out.println(tri2.toString());
        Triangle tri3 = new Triangle("purple", true, 5, 6 , 7);
        System.out.println(tri3.toString());
    }
}
