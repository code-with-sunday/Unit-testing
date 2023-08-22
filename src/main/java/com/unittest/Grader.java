package com.unittest;

public class Grader {

    public char determineLetterGrade (int numberGrade){
        if (numberGrade < 0 ){
            throw new IllegalArgumentException("Number cannot be accessed");
        }
        else if (numberGrade < 60){
            return 'F';
        }
        else if (numberGrade < 70){
            return 'C';

        }
        else if (numberGrade < 80){
            return 'B';
        }
        else if (numberGrade <90){
            return 'A';
        }
        else {
            return 'A';
        }
    }
}
