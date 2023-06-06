package com.ironhack.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathLibraryTest {

    @Test
    public void testAddTwoPositives(){
        MyMathLibrary  lib = new MyMathLibrary();
        int result = lib.add(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void testAddTwoNegatives(){
        MyMathLibrary  lib = new MyMathLibrary();
        int result = lib.add(-2, -3);
        assertEquals(-5, result);
    }

    @Test
    public void testAddTwoZeroes(){
        MyMathLibrary  lib = new MyMathLibrary();
        int result = lib.add(0, -0);
        assertEquals(0, result);
    }

    @Test
    public void testTwoPositives(){
        MyMathLibrary  lib = new MyMathLibrary();
        int result = lib.multiply(10, 2);
        assertEquals(20, result);
    }

    @Test
    public void testOnePositiveOneNegative(){
        MyMathLibrary  lib = new MyMathLibrary();
        int result = lib.multiply(10, -2);
        assertEquals(-20, result);
    }

    @Test
    public void testOneIsZero(){
        MyMathLibrary  lib = new MyMathLibrary();
        int result = lib.multiply(10, 0);
        assertEquals(0, result);
    }
}