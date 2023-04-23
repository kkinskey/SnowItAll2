package com.example.snowitall;

public class MasteryTestModel {
    private int number1;

    private int number2;

    private int answer;

    private int correctAnswerIndex;

    private String correctAnswer;

    private String num1;

    private String num2;


    private String[] choices = new String[4];

    private String[] tfAnswers = new String[2];

    private boolean correctAnswerTF;

    private int correctAnswerCount;

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }


    public MasteryTestModel() {

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
}
