package com.thoughtworks.bootcamp.rectangleTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    void givenWidthLengthZero_WhenCalculateArea_ThenReturnAreaZero(){

        Rectangle rectangle=new Rectangle(0,0);
        Assertions.assertEquals(0,rectangle.area());

    }

}
