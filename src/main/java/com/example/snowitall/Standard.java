package com.example.snowitall;

import java.util.List;
import java.util.Random;

// Standard.java
public enum Standard {
    GEOMETRY,
    MEASUREMENTS,
    OPERATIONS;

    private GeoModel model;

    public void setModel(GeoModel model) {
        this.model = model;
    }

    public void generateQuestionBasedOnGrade(Standard standard) {
        switch (model.getGrade()) {
            case 0 ->
                // Call a method to generate questions for Grade K
                    generateGradeKQuestion(standard);
            case 1 ->
                // Call a method to generate questions for Grade 1
                    generateGrade1Question(standard);
            case 2 ->
                // Call a method to generate questions for Grade 2
                    generateGrade2Question(standard);
            case 3 ->
                // Call a method to generate questions for Grade 3
                    generateGrade3Question(standard);
            case 4 ->
                // Call a method to generate questions for Grade 4
                    generateGrade4Question(standard);
            default -> {
                throw new IllegalArgumentException("Invalid grade provided.");
            }
        }
    }

    public void generateGradeKQuestion(Standard standard) {
        // Generate questions with a small range of numbers for Grade K
        // Set number range and operation for grade K
    }

    public void generateGrade1Question(Standard standard) {
        // Generate questions with a slightly larger range of numbers for Grade 1
        // Set number range and operation for grade 1
    }

    public void generateGrade2Question(Standard standard) {
        // Generate questions with more complexity for Grade 2
        // Set number range and operation for grade 2
    }

    public void generateGrade3Question(Standard standard) {
        // Generate questions with more complexity for Grade 3
        // Set number range and operation for grade 3
    }

    public void generateGrade4Question(Standard standard) {
        // Generate questions with more complexity for Grade 4
        // Set number range and operation for grade 4
    }

    public String generateRandomFillInTheBlankQuestion(Standard standard) {
        List<String> questions = switch (standard) {
            case GEOMETRY -> List.of(
                    "What shape is this when it has 3 sides?",
                    "What shape is this when it has 4 sides?"
                    // Add more geometry questions
            ); case MEASUREMENTS -> List.of(
                    "What is the area of a square with side length 5?",
                    "What is the perimeter of a rectangle with length 6 and width 4?"
                    // Add more measurements questions
            ); case OPERATIONS -> List.of(
                    "What is the result of 5 + 3?",
                    "What is the result of 7 * 2?"
                    // Add more operations questions
            ); default -> throw new IllegalArgumentException("Invalid standard provided.");
        };

        // Randomly select a question
        Random random = new Random();
        int randomIndex = random.nextInt(questions.size());
        String selectedQuestion = questions.get(randomIndex);

        // Display the question text
        System.out.println("This is the selected question: " + selectedQuestion);
        return selectedQuestion;
    }
    public void generateRandomMultipleChoiceQuestion(Standard standard) {

    }

    public void generateRandomTrueFalseQuestion(Standard standard) {

    }
}

