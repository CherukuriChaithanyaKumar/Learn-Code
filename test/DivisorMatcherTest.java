package com.example.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisorMatcherTest {

    DivisorMatcher matcher = new DivisorMatcher();

    @Test
    void input10Returns1() {
        assertEquals(1, matcher.countMatchingDivisors(10));
    }

    @Test
    void input15Returns2() {
        assertEquals(2, matcher.countMatchingDivisors(15));
    }

    @Test
    void input1Returns0() {
        assertEquals(0, matcher.countMatchingDivisors(1));
    }

    @Test
    void input0Returns0() {
        assertEquals(0, matcher.countMatchingDivisors(0));
    }

    @Test
    void negativeInputReturns0() {
        assertEquals(0, matcher.countMatchingDivisors(-5));
    }

    @Test
    void input2Returns0() {
        assertEquals(0, matcher.countMatchingDivisors(2));
    }
}
