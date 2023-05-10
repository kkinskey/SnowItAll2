package com.example.snowitall.GradeK1;

import com.example.snowitall.LoginController;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.sql.*;
import java.util.Random;
public class GeoModel {
    private int grade;

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

    public GeoModel() {


    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
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

    public int getCorrectAnswerCount() {return correctAnswerCount;}


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

    public String toStringFIB (){
        String questionText = "How many sides does this shape have?";
        return questionText;
    }

}
