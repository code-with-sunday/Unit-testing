package com.unittest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestserviceTest {

    @Test
    void twoPlusTwo(){
        var calculator = new Testservice();
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    void threeAndSeven(){
        var calculator = new Testservice();
        assertEquals(10, calculator.add(3,7));
    }
}