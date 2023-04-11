package com.example.snowitall;

public class Grade {

    String gradeLevel;

    //3 dimensional array to store three different question types: Multiple Choice, True/False, User Input
    String[][][] questionSet;

    public Grade(String gradeLevel) {
        this.gradeLevel = gradeLevel;

    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}
