package com.company;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {}

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume () {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height = " + this.height + ", which is subclass of " + super.toString();
    }
}
