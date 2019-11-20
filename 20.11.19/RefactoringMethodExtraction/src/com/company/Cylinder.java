package com.company;

public class Cylinder {
    public static double getVolumn(double radius, double height) {
        double baseArea = getArea(radius);
        double basePerimeter = getPerimeter(radius);
        double volume = basePerimeter * height + 2 * baseArea;
        return volume;
    }

    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
