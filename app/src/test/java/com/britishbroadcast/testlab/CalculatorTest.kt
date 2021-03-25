package com.britishbroadcast.testlab

import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class CalculatorTest {

    @Before
    fun setUp() {

        // place to init anything need to be init
    }

    @Test
    fun `test multiplication`(){
        assertEquals(1, Calculator.multiplication(1,1))
        assertEquals(10, Calculator.multiplication(2,5))
        assertEquals(15, Calculator.multiplication(3,5))
        assertEquals(40, Calculator.multiplication(2,20))
        assertEquals(100, Calculator.multiplication(25,4))
        assertEquals(4, Calculator.multiplication(-2,-2))
        assertEquals(-4, Calculator.multiplication(2,-2))
        assertEquals(-10, Calculator.multiplication(-2,5))
        assertEquals(10, Calculator.multiplication(-2,-5))
    }

    @Test
    fun `test addition`(){
        assertEquals(4, Calculator.addition(2,2))
        assertEquals(2, Calculator.addition(1,1))
        assertEquals(10, Calculator.addition(5,5))
        assertNotEquals(100, Calculator.addition(50,49))
        assertNotEquals(25, Calculator.addition(24,3))
        assertNotEquals(100, Calculator.addition(50,49))
        assertNotEquals(0, Calculator.addition(0,1))
        assertNotEquals(0, Calculator.addition(-1,0))
        assertNotEquals(90, Calculator.addition(40,-50))

    }

    @Test
    fun `test subtraction`(){
        assertNotEquals(100, Calculator.addition(100,-50))
        assertNotEquals(0, Calculator.addition(50,49))
        assertEquals(100, Calculator.addition(50,49))
        assertEquals(300, Calculator.addition(500,200))
        assertEquals(-1, Calculator.addition(-50,49))
        assertEquals(0, Calculator.addition(50,50))
        assertEquals(111, Calculator.addition(200,89))
        assertEquals(21, Calculator.addition(50,29))
        assertEquals(50, Calculator.addition(1000,950))
    }

    @After
    fun tearDown() {
        // place to destroy anything previous initialized
    }
}