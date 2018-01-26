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
    public void grabColumn() throws Exception {
        ConnectFour c = new ConnectFour();

        assertEquals(6,c.grabColumn(0).length);
        assertEquals(6,c.grabColumn(1).length);
        assertEquals(6,c.grabColumn(2).length);
        assertEquals(6,c.grabColumn(3).length);
        assertEquals(6,c.grabColumn(4).length);
        assertEquals(6,c.grabColumn(5).length);
        assertEquals(6,c.grabColumn(6).length);
        // no column expected
        assertEquals(0,c.grabColumn(7).length);

        c.addToken(0,"R");
    }

    @Test
    public void convertToString() throws Exception {
        ConnectFour c = new ConnectFour();

        assertEquals("[null, null, null, null, null, null]",c.convertToString(c.grabColumn(0)));

        c.addToken(0,"R");
        assertEquals("[null, null, null, null, null, R]", c.convertToString(c.grabColumn(0)));

        c.addToken(0,"R");
        assertEquals("[null, null, null, null, R, R]", c.convertToString(c.grabColumn(0)));

        c.addToken(0,"R");
        assertEquals("[null, null, null, R, R, R]", c.convertToString(c.grabColumn(0)));

        c.addToken(0,"R");
        assertEquals("[null, null, R, R, R, R]", c.convertToString(c.grabColumn(0)));

        c.addToken(0,"R");
        assertEquals("[null, R, R, R, R, R]", c.convertToString(c.grabColumn(0)));

        c.addToken(0,"R");
        assertEquals("[R, R, R, R, R, R]", c.convertToString(c.grabColumn(0)));
    }
@Test
    public void getRow() throws Exception {
        ConnectFour c = new ConnectFour();
         assertEquals("nullnullnullnullnullnullnull",c.getRow(0));
         c.addToken(0,"R");
    assertEquals("Rnullnullnullnullnullnull",c.getRow(5));

    }
@Test
    public void checkRow() throws Exception {
        ConnectFour c = new ConnectFour();
         assertTrue(c.checkRow("RRRR","R"));
         assertTrue(c.checkRow("RRRRR","R"));
         assertTrue(c.checkRow("RRRRRR","R"));
         assertFalse(c.checkRow("RRR","R"));
         assertFalse(c.checkRow("","R"));

    }

    @Test
    public void checkRows() throws Exception {
        ConnectFour c = new ConnectFour();

         assertFalse(c.checkRows("R"));
         c.addToken(0,"R");
        assertFalse(c.checkRows("R"));
        c.addToken(1,"R");
        c.addToken(0,"R");
        c.addToken(0,"R");
        c.addToken(0,"R");
        c.addToken(0,"R");


    }

    @Test
    public void checkOneColumn() throws Exception {
        ConnectFour c = new ConnectFour();
        assertFalse(c.checkOneColumn(0,"R"));

        c.addToken(0,"R");
        assertFalse(c.checkOneColumn(0,"R"));
        c.addToken(0,"R");
        assertFalse(c.checkOneColumn(0,"R"));
        c.addToken(0,"R");
        assertFalse(c.checkOneColumn(0,"R"));
        c.addToken(0,"R");
        assertTrue(c.checkOneColumn(0,"R"));
    }

    @Test
    public void checkHorizontal() throws Exception {
        ConnectFour c = new ConnectFour();
        assertFalse(c.checkColumns("R"));

        c.addToken(0,"R");
        assertFalse(c.checkColumns("R"));
        c.addToken(0,"R");
        assertFalse(c.checkColumns("R"));
        c.addToken(0,"R");
        assertFalse(c.checkColumns("R"));
        c.addToken(0,"R");
        assertTrue(c.checkColumns("R"));

        c = new ConnectFour();
        assertFalse(c.checkColumns("B"));

        c.addToken(1,"B");
        assertFalse(c.checkColumns("B"));
        c.addToken(1,"B");
        assertFalse(c.checkColumns("B"));
        c.addToken(1,"B");
        assertFalse(c.checkColumns("B"));
        c.addToken(1,"B");
        assertTrue(c.checkColumns("B"));
    }

    @Test
    public void haveWinner() throws Exception {
    }

    @Test
    public void print() throws Exception {
    }

}