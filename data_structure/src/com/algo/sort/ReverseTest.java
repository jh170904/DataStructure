package com.algo.sort;


import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class ReverseTest {

    private final ReverseNumericalOrder comparator = new ReverseNumericalOrder();

    @Test
    public void testNeg() {
        assertTrue(comparator.compare(10, 4) < 0);
    }

    @Test
    public void testEq() {
        assertTrue(comparator.compare(2, 2) == 0);
    }

    @Test
    public void testPos() {
        assertTrue(comparator.compare(4, 10) > 0);
    }
}
