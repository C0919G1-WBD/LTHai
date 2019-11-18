package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5);

        System.out.println("Pre-sorted");
        for (Circle item: circles) {
            System.out.println(item.toString());
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After sort");
        for (Circle item: circles) {
            System.out.println(item.toString());
        }
    }
}
