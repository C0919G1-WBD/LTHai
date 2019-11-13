package com.company;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filed) {
        this.color = color;
        this.filled = filed;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String Color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean Filled){
        this.filled = filled;
    }

    @Override
    public String toString() {
        if(this.filled) {
            return "A shape with color " + this.color + " and filled";
        }
        return "A shape with color " + this.color + " and not filled";
    }
}
