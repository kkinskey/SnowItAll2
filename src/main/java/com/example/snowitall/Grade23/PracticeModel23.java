package com.example.snowitall.Grade23;

import java.util.Random;

public class PracticeModel23 {

    public PracticeModel23() {

    }

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

        public void additionQuestion () {


            // create a new Random object
            Random random = new Random();

            // generate a random integer between 0 (inclusive) and 10 (exclusive)
            number1 = (random.nextInt(20) + 1 );
            number2 = (random.nextInt(20) + 1);

            answer = (number1 + number2);

            correctAnswer = (Integer.toString(answer));


            num1 = (Integer.toString(number1));

            num2 = (Integer.toString(number2));

        }

        public void subtractionQuestion () {


            // create a new Random object
            Random random = new Random();

            // generate a random integer between 0 (inclusive) and 10 (exclusive)
            number1 = (random.nextInt(20)+1);
            number2 = (random.nextInt(10) + 1);

            answer = (number1 - number2);

            correctAnswer = (Integer.toString(answer));

            num1 = (Integer.toString(number1));

            num2 = (Integer.toString(number2));

        }

        public void randomQuestion () {
            Random random = new Random();
            int randomNumber = random.nextInt(2) + 1; // Generates a random number between 1 and 4
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
                default:
                    System.out.println("default");
                    break;
            }
        }

        public String toStringFIB (String string){
            String questionText = "What is " + num1 + string + num2 + "?";
            return questionText;
        }
    }







