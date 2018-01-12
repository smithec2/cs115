package edu.ldsbc.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals(2, calculator.add(1,1));
        assertEquals(0, calculator.add(1,-1));

    }

}