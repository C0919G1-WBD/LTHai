package com.company;

public class Shape {
    private String color = "red";
    private boolean filled = false;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if(this.filled) {
            return "a shape with color " + color + " and is filled";
        } else {
            return "a shape with color " + color + " and isn't filled";
        }
    }
}
