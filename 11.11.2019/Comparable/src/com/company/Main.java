package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ComparableCircle[] circle = new ComparableCircle[3];
        circle[0] = new ComparableCircle(4.5);
        circle[1] = new ComparableCircle();
        circle[2] = new ComparableCircle(2.5);

        System.out.println("Pre-sort");
        for(ComparableCircle item: circle) {
            System.out.println(item.toString());
        }

        Arrays.sort(circle);

        System.out.println("After-sort");
        for(ComparableCircle item: circle) {
            System.out.println(item.toString());
        }
    }
}
