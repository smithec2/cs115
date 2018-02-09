package edu.ldsbc.assinment3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CandyTest {
    @Test
    public void calculateItemCost() throws Exception {
        Candy candy = new Candy("Twix", 10, 1);

        assertEquals(10,candy.calculateItemCost());

        candy.setCostPerLb(2);
        assertEquals(20,candy.calculateItemCost());

        candy.setCostPerLb(0);
        assertEquals(0,candy.calculateItemCost());

        candy.setWight(100);
        assertEquals(0,candy.calculateItemCost());

        candy.setCostPerLb(5);
        assertEquals(500,candy.calculateItemCost());

    }

}