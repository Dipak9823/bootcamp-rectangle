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

    @Test
    void givenSideTwo_whenCalculateArea_ThenReturnFour() {
        Square square=new Square(2.0f);
        Assertions.assertEquals(4.0f,square.area());
    }

    @Test
    void givenSideZero_WhenCalculatePerimeter_ThenReturnZero(){

        Square square=new Square(0.0f);
        Assertions.assertEquals(0.0f,square.perimeter());
    }

    @Test
    void givenSideOne_WhenCalculatePerimeter_ThenReturnFour(){
        Square square=new Square(1.0f);
        Assertions.assertEquals(4.0f, square.perimeter());
    }

}
