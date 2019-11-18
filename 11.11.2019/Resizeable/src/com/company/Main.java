package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle c1 = new Circle(3.4);
        System.out.println(c1.toString());
        c1.resize(50);
        System.out.println(c1.toString());

        Rectangle r1 = new Rectangle(4.6,3.2);
        System.out.println(r1.toString());
        r1.resize(45);
        System.out.println(r1.toString());

        Square s1 = new Square(5);
        System.out.println(s1.toString());
        s1.resize(45);
        System.out.println(s1.toString());
    }
}
