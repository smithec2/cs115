package edu.ldsbc.assignment7;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortComparerTest {
    @Test
    public void compareSorters() throws Exception {
        SortComparer comparer = new SortComparer();

        comparer.addAlgorithm(new QuickSort());
        comparer.addAlgorithm(new InsertionSort());
        //SelectionSort

        comparer.compareSorters(1000);
    }

    @Test
    public void createRandomList() throws Exception {
        SortComparer comparer = new SortComparer();
        assertEquals(0, comparer.getNumber().size());
        comparer.createRandomList(10);
        assertEquals(10, comparer.getNumber().size());
        comparer.createRandomList(100);
        assertEquals(100, comparer.getNumber().size());
    }

    @Test
    public void createAscendingList() throws Exception {
        SortComparer comparer = new SortComparer();
        assertEquals(0, comparer.getNumber().size());
        comparer.createAscendingList(10);
        assertEquals(10, comparer.getNumber().size());
        comparer.createAscendingList(100);
        assertEquals(100, comparer.getNumber().size());
        assertTrue(comparer.getNumber().get(0) < comparer.getNumber().get(10));
        assertTrue(comparer.getNumber().get(10) < comparer.getNumber().get(99));
    }

    @Test
    public void createDescendingList() throws Exception { SortComparer comparer = new SortComparer();
        assertEquals(0, comparer.getNumber().size());
        comparer.createDescendingList(10);
        assertEquals(10, comparer.getNumber().size());
        comparer.createDescendingList(100);
        assertEquals(100, comparer.getNumber().size());
    }

}