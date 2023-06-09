package com.example.snowitall;

import java.util.Random;

public class PracticeModel {


    private int number1;

    private int number2;

    private int answer;

    private int correctAnswerIndex;

    private int correctAnswerIndexTF;

    private String incorrectAnswerTF;

    private String correctAnswer;

    private String num1;

    private String num2;


    private String[] choices = new String[4];

    private String[] tfAnswers = new String[2];

    private boolean correctAnswerTF;

    private int correctAnswerCount;

    private String operationSymbol;

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }


    public PracticeModel() {

    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public void setCorrectAnswerIndex(int correctAnswerIndex) {
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public int getCorrectAnswerCount() {
        return correctAnswerCount;
    }

    public void setCorrectAnswerCount(int correctAnswerCount) {
        this.correctAnswerCount = correctAnswerCount;
    }

    public String[] getTfAnswers() {
        return tfAnswers;
    }

    public void setTfAnswers(String[] tfAnswers) {
        this.tfAnswers = tfAnswers;
    }

    public boolean getCorrectAnswerTF() {
        return correctAnswerTF;
    }

    public void setCorrectAnswerTF(boolean correctAnswerTF) {
        this.correctAnswerTF = correctAnswerTF;
    }

    public String getOperationSymbol() {
        return operationSymbol;
    }

    public void setOperationSymbol(String operationSymbol) {
        this.operationSymbol = operationSymbol;
    }

    public int getCorrectAnswerIndexTF() {
        return correctAnswerIndexTF;
    }

    public void TrueFalseQuestion() {
        randomQuestion();

        // create a new Random object
        Random random = new Random();

        //generates random number between 0 and 1
        correctAnswerIndexTF = getCorrectAnswerIndex();
        correctAnswerIndexTF = random.nextInt(2);

        String[] array = getTfAnswers();

        String cA = getCorrectAnswer();
        array[correctAnswerIndexTF] = cA;

        for (int i = 0; i < array.length; i++) {
            // if the index is null or its value is already in the array, replace with a new random integer value
            while (array[i] == null || containsDuplicate(array, i)) {
                int choice = random.nextInt(120);
                array[i] = Integer.toString(choice);
            }
        }

        if (getNumber1() + getNumber2() == getAnswer()) {
            correctAnswerTF = true;
        } else {
            correctAnswerTF = false;
        }

//        for (String s : array) {
//            if (array[i] != correctAnswer) {
//                incorrectAnswerTF = array[i++];
//            } else
//
//        }
    }

    public void MultipleChoiceQuestion () {
        randomQuestion();

        for (String a : choices
        ) {
            System.out.println("These are the answers in choices array before generating incorrect answers:" + a);
        }

        // create a new Random object
        Random random = new Random();

        int cAI = getCorrectAnswerIndex();
        //generates random number between 0 and 3
        cAI = (random.nextInt(4));
        System.out.println(cAI + "");

        String[] array = getChoices();

        String cA = getCorrectAnswer();
        array[cAI] = cA;
        System.out.println(cA);

        for (int i = 0; i < array.length; i++) {
            // if the index is null or its value is already in the array, replace with a new random integer value
            while (array[i] == null || containsDuplicate(array, i)) {
                int choice = random.nextInt(120);
                array[i] = Integer.toString(choice);
            }
        }

        for (String a : choices
        ) {
            System.out.println("These are the answers in choices array after generating incorrect answers:" + a);
        }
    }

    // method to check if the array contains a duplicate of the element at the given index
    public static boolean containsDuplicate (Object[]array,int index){
        for (int i = 0; i < array.length; i++) {
            if (i != index && array[i] != null && array[i].equals(array[index])) {
                return true;
            }
        }
        return false;
    }

    public void additionQuestion () {


        // create a new Random object
        Random random = new Random();

        // generate a random integer between 0 (inclusive) and 10 (exclusive)
        number1 = (random.nextInt(100));
        number2 = (random.nextInt(10));

        answer = (number1 + number2);

        correctAnswer = (Integer.toString(answer));


        num1 = (Integer.toString(number1));

        num2 = (Integer.toString(number2));

    }

    public void subtractionQuestion () {


        // create a new Random object
        Random random = new Random();

        // generate a random integer between 0 (inclusive) and 10 (exclusive)
        number1 = (random.nextInt(100));
        number2 = (random.nextInt(10));

        answer = (number1 - number2);

        correctAnswer = (Integer.toString(answer));

        num1 = (Integer.toString(number1));

        num2 = (Integer.toString(number2));

    }

    public void multiplicationQuestion () {


        // create a new Random object
        Random random = new Random();

        // generate a random integer between 0 (inclusive) and 10 (exclusive)
        number1 = (random.nextInt(100));
        number2 = (random.nextInt(10));

        answer = (number1 * number2);

        correctAnswer = (Integer.toString(answer));

        num1 = (Integer.toString(number1));

        num2 = (Integer.toString(number2));

    }

    public void divisionQuestion () {

        Random random = new Random();
        int number11 = random.nextInt(91) + 10;
        int number22 = random.nextInt(9) + 2;
        while (number11 % number22 != 0) {
            number11 = random.nextInt(91) + 10;
            number22 = random.nextInt(9) + 2;
        }
        number1 = (number11);
        number2 = (number22);
        answer = (number11 / number22);

        correctAnswer = (Integer.toString(answer));

        num1 = (Integer.toString(number1));

        num2 = (Integer.toString(number2));

    }
    public void randomQuestion () {
        Random random = new Random();
        int randomNumber = random.nextInt(4) + 1; // Generates a random number between 1 and 4
        switch (randomNumber) {
            case 1:
                additionQuestion();
                operationSymbol = " + ";
                toStringFIB(operationSymbol);
                System.out.println("Addition " + operationSymbol);
                break;
            case 2:
                subtractionQuestion();
                operationSymbol = " - ";
                toStringFIB(operationSymbol);
                System.out.println("Subtraction " + operationSymbol);
                break;
            case 3:
                multiplicationQuestion();
                operationSymbol = " x ";
                toStringFIB(operationSymbol);
                System.out.println("Multiplication " + operationSymbol);
                break;
            case 4:
                divisionQuestion();
                operationSymbol = " / ";
                toStringFIB(operationSymbol);
                System.out.println("Division " + operationSymbol);
                break;
            default:
                System.out.println("default");
                break;
        }
    }


    // method that generates a string to display the mulitple choice question we are asking
    public String toStringMC () {

        String questionText = "What is " + num1 + " + " + num2 + "?";
        return questionText;
    }

    public String toStringTF (String string){
        String[] array = getTfAnswers();
        for (String string1 : array
        ) {
            System.out.println("This is a string in the array: " + string1);
        }

        System.out.println("The correct answer is: " + getCorrectAnswerTF());

//            for (int i = 0; i < array.length; i++) {
//
//                if (array[i] == array[correctAnswerIndexTF]) {
////                System.out.println("String at index 0: " + array[i] );
////                System.out.println("String at index 1: " + array[i++]);
////                System.out.println("array[i]: " + array[i] + "array[correctAnswerIndexTF]: " + array[correctAnswerIndexTF]);
//                    System.out.println("array[i] == array[correctAnswerIndexTF]");
//                    array[i++] = incorrectAnswerTF;
//                    System.out.println("Line 365 Practice Model: incorrect answer: " + incorrectAnswerTF);
//                    System.out.println("Array at index 1 = " + );
//                } else if (array[i] != array[correctAnswerIndexTF]) {
//                    System.out.println("inside else if");
//                    array[i] = incorrectAnswerTF;
//                }
//
//            }
        if (array[0] == array[correctAnswerIndexTF]) {
            incorrectAnswerTF = array[1];
        } else if (array[1] == array[correctAnswerIndexTF]) {
            incorrectAnswerTF = array[0];
        }

        System.out.println("This is the incorrect answer: " + incorrectAnswerTF + "This is the correctAnswerIndexTF: " + correctAnswerIndexTF + "");


        if (getCorrectAnswerTF()) {
            return "Is " + num1 + string + num2 + " = " + correctAnswer + "?";
        } else
            return "Is " + num1 + string + num2 + " = " + incorrectAnswerTF + "?";

    }

    public String toStringFIB (String string){
        String questionText = "What is " + num1 + string + num2 + "?";
        return questionText;
    }
}


