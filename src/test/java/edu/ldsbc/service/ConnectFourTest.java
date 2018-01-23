package edu.ldsbc.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConnectFourTest {
    @Test
    public void addToken() throws Exception {
    }

    @Test
    public void findOpenSlot() throws Exception {

        ConnectFour c = new ConnectFour();

        assertEquals(5, c.findOpenSlot(0));
        assertEquals(5, c.findOpenSlot(1));
        assertEquals(5, c.findOpenSlot(2));
        assertEquals(5, c.findOpenSlot(3));
        assertEquals(5, c.findOpenSlot(4));
        assertEquals(5, c.findOpenSlot(5));
        assertEquals(5, c.findOpenSlot(6));

        c.addToken(0,"R");

        assertEquals(4, c.findOpenSlot(0));
        assertEquals(5, c.findOpenSlot(1));
        assertEquals(5, c.findOpenSlot(2));
        assertEquals(5, c.findOpenSlot(3));
        assertEquals(5, c.findOpenSlot(4));
        assertEquals(5, c.findOpenSlot(5));
        assertEquals(5, c.findOpenSlot(6));

        c.addToken(0,"R");

        assertEquals(3, c.findOpenSlot(0));
        assertEquals(5, c.findOpenSlot(1));
        assertEquals(5, c.findOpenSlot(2));
        assertEquals(5, c.findOpenSlot(3));
        assertEquals(5, c.findOpenSlot(4));
        assertEquals(5, c.findOpenSlot(5));
        assertEquals(5, c.findOpenSlot(6));

        c.addToken(0,"R");
        c.addToken(0,"R");

        assertEquals(1, c.findOpenSlot(0));
        assertEquals(5, c.findOpenSlot(1));
        assertEquals(5, c.findOpenSlot(2));
        assertEquals(5, c.findOpenSlot(3));
        assertEquals(5, c.findOpenSlot(4));
        assertEquals(5, c.findOpenSlot(5));
        assertEquals(5, c.findOpenSlot(6));

        c.addToken(0,"R");

        assertEquals(0, c.findOpenSlot(0));
        assertEquals(5, c.findOpenSlot(1));
        assertEquals(5, c.findOpenSlot(2));
        assertEquals(5, c.findOpenSlot(3));
        assertEquals(5, c.findOpenSlot(4));
        assertEquals(5, c.findOpenSlot(5));
        assertEquals(5, c.findOpenSlot(6));


    }

    @Test
    public void haveWinner() throws Exception {
    }

    @Test
    public void print() throws Exception {
    }

}