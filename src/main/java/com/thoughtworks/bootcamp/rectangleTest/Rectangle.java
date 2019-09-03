package com.thoughtworks.bootcamp.rectangleTest;

public class Rectangle {
    float width;
    float length;

    Rectangle(float width,float length) {
        this.width=width;
        this.length=length;
    }

    public float area() {

        return  length;
    }


    public float perimeter() {
        return 2 * this.width;
    }
}
