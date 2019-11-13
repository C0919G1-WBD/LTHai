package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Fan f1 = new Fan();
        Fan f2 = new Fan();
        f1.setSpeed(f1.getFAST());
        f1.setRadius(10);
        f1.setColor("Yellow");
        f1.setOn(true);
        f2.setSpeed(f1.getMEDIUM());
        System.out.println("Fan 1:\n"+f1.toString());
        System.out.println("Fan 2:\n"+f2.toString());
    }
}
