package com.example.snowitall.GradeK1;

public class GeoModel {
    private int grade;

    private int answer;

    private String correctAnswer;
    private String num1;
    private String num2;


    private int correctAnswerCount;


    public GeoModel() {

    }
    public int getGrade() {
        return grade;
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


    public String getNum2() {
        return num2;
    }


    public String getCorrectAnswer() {
        return correctAnswer;
    }


    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }


    public int getCorrectAnswerCount() {return correctAnswerCount;}


    public void setCorrectAnswerCount(int correctAnswerCount) {
        this.correctAnswerCount = correctAnswerCount;
    }




    public String toStringFIB (){
        String questionText = "How many sides does this shape have?";
        return questionText;
    }

}
