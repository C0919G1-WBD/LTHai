package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point2D p2 = new Point2D(2,3);
        System.out.println(p2.toString());
        p2.setXY(3.4f, 5.6f);
        System.out.println("x = " + p2.getXY()[0] + ",y = " + p2.getXY()[1]);
        System.out.println(p2.toString());

        Point3D p3 = new Point3D(3, 4, 5);
        System.out.println(p3.toString());
        p3.setXYZ(3.4f, 5.6f, 4.2f);
        System.out.println("x = " + p3.getXYZ()[0] + ",y = " + p3.getXYZ()[1] + ",z = " + p3.getXYZ()[2]);
        System.out.println(p3.toString());
    }
}
