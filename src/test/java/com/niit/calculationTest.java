package com.niit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculationTest {
    calculation calculation;
    @BeforeEach
    void setUp(){
        calculation=new calculation();
    }
    @AfterEach
    void tearDown(){
        calculation=null;
    }

    @Test
    void addition() {
        assertEquals(10,calculation.addition(5,5));
    }

    @Test
    void subtraction() {
        assertEquals(2,calculation.subtraction(20,18));
    }

    @Test
    void multiplication() {
        assertEquals(100,calculation.multiplication(10,10));
    }

    @Test
    void division() {
        assertEquals(100,calculation.multiplication(10,10));
    }
}