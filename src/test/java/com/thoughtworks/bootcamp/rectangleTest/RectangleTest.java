package com.thoughtworks.bootcamp.rectangleTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    Rectangle rectangleWidthLengthOne;
    @BeforeEach
    void setUp() {
        rectangleWidthLengthOne =new Rectangle(1.0f,1.0f);
    }

    @Test
    void givenWidthLengthZero_WhenCalculateArea_ThenReturnZero(){

        Rectangle rectangle=new Rectangle(0.0f,0.0f);
        Assertions.assertEquals(0.0f,rectangle.area());
    }


    @Test
    void givenWidthLengthOne_whenCalculateArea_ThenReturnOne() {
        Assertions.assertEquals(1.0f, rectangleWidthLengthOne.area());
    }

    @Test
    void givenWidthOneLengthTwo_WhenCalculateArea_ThenReturnLength(){
        Rectangle rectangle=new Rectangle(1.0f,2.0f);
        Assertions.assertEquals(2.0f,rectangle.area());
    }

    @Test
    void givenWidthLengthZero_WhenCalculatePerimeter_ThenReturnZero(){

        Rectangle rectangle=new Rectangle(0.0f,0.0f);
        Assertions.assertEquals(0.0f,rectangle.perimeter());
    }
    @Test
    void givenWidthLengthOne_WhenCalculatePerimeter_ThenReturnFour(){
        Assertions.assertEquals(4.0f, rectangleWidthLengthOne.perimeter());
    }

}
