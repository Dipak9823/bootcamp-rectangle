package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    void givenSideZero_WhenCalculateArea_ThenReturnZero(){
        Square square=new Square(0.0f);
        Assertions.assertEquals(0.0f,square.area());
    }

    @Test
    void givenSideOne_whenCalculateArea_ThenReturnOne() {
        Square square=new Square(1.0f);
        Assertions.assertEquals(1.0f,square.area());
    }


}
