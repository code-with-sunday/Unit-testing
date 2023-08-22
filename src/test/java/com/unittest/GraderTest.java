package com.unittest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void fiftyNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    void sixtyNineShouldReturnC(){
        var grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(69));
    }

    @Test
    void seventyNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(79));
    }

    @Test
    void eightyNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(89));
    }

    @Test
    void negativeShouldThrowIllegalArguementException(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    grader.determineLetterGrade(-1);
                });
    }

}