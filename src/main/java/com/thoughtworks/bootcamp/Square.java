package com.thoughtworks.bootcamp;

public class Square {
    private final float side;

    Square(float side) {
        this.side=side;
    }

    float area() {
        return side*side;
    }
}
