package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point p = new Point(3, 5);
        System.out.println(p.toString());

        MovablePoint mp = new MovablePoint(4, 5, 6, 7);
        System.out.println(mp.toString());
        mp.Move();
        System.out.println(mp.toString()    );
    }
}
