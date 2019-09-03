package com.thoughtworks.bootcamp;

public class Rectangle {
    private final float width;
    private final float length;

    Rectangle(float width,float length) {
        this.width=width;
        this.length=length;
    }

    float area() {
        return  length;
    }

    float perimeter() {
        return 2 * (this.length+this.width);
    }
}
