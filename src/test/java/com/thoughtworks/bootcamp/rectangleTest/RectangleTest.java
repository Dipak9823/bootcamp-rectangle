package com.thoughtworks.bootcamp.rectangleTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    void givenWidthLengthZero_WhenCalculateArea_ThenReturnZero(){

        Rectangle rectangle=new Rectangle(0.0f,0.0f);
        Assertions.assertEquals(0.0f,rectangle.area());
    }


    @Test
    void givenWidthLengthOne_whenCalculateArea_ThenReturnOne() {

        Rectangle rectangle=new Rectangle(1.0f,1.0f);
        Assertions.assertEquals(1.0f,rectangle.area());
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


}
