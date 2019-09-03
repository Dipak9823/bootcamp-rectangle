package com.thoughtworks.bootcamp;

public class Square {
    private final float side;

    Square(float side) {
        this.side=side;
    }

    float area() {
        return side*side;
    }

    float perimeter() {
        return 0.0f;
    }
}
