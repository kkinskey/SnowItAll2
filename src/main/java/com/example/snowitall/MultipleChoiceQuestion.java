package com.example.snowitall;

import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class MultipleChoiceQuestion {

//    private StringProperty questionText;
//    private StringProperty option1;
//    private StringProperty option2;
//    private StringProperty option3;
//    private StringProperty option4;
//    private StringProperty answer;
//
//    ArrayList<MultipleChoiceQuestion> questions = new ArrayList<>();
//
//
////    public MultipleChoiceQuestion(String questionText, List<String> answerChoices, int correctAnswerIndex) {
////        this.questionText = questionText;
////        this.answerChoices = answerChoices;
////        this.correctAnswerIndex = correctAnswerIndex;
////    }
//
//    public MultipleChoiceQuestion(String questionText, String option1, String option2, String option3, String option4, String answer) {
//        this.questionText = new SimpleStringProperty(questionText);
//        this.option1 = new SimpleStringProperty(option1);
//        this.option2 = new SimpleStringProperty(option2);
//        this.option3 = new SimpleStringProperty(option3);
//        this.option4 = new SimpleStringProperty(option4);
//        this.answer = new SimpleStringProperty(answer);
//    }
//
//    public String getQuestionText() {
//        return questionText.get();
//    }
//
//    public String getOption1() {
//        return option1.get();
//    }
//
//    public String getOption2() {
//        return option2.get();
//    }
//
//    public String getOption3() {
//        return option3.get();
//    }
//
//    public String getOption4() {
//        return option4.get();
//    }
//
//    public String getAnswer() {
//        return answer.get();
//    }
//
//
//
//    public void setQuestionText(String question) {
//        this.questionText.set(question);
//    }
//
//    public void setOption1(String option1) {
//        this.option1.set(option1);
//    }
//
//    public void setOption2(String option2) {
//        this.option2.set(option2);
//    }
//
//    public void setOption3(String option3) {
//        this.option3.set(option3);
//    }
//
//    public void setOption4(String option4) {
//        this.option4.set(option4);
//    }
//
//    public void setAnswer(String answer) {
//        this.answer.set(answer);
//    }
//
//    public void storeQuestions(MultipleChoiceQuestion question) {
//
//        for (MultipleChoiceQuestion question_ : questions) {
//            questions.add(question);
//        }
//
//    }

    private static String question;
    private static List<String> choices;
    private static int correctChoiceIndex;

    // Constructor
    public MultipleChoiceQuestion(String question, List<String> choices, int correctChoiceIndex) {
        this.question = question;
        this.choices = choices;
        this.correctChoiceIndex = correctChoiceIndex;
    }

    // Getters
    public String getQuestion() {
        return question;
    }

    public List<String> getChoices() {
        return choices;
    }

    public int getCorrectChoiceIndex() {
        return correctChoiceIndex;
    }



    public static MultipleChoiceQuestion generateMCQ() {
        question = "What is the correct Option?";
        choices.add("Option 1");
        choices.add("Option 2");
        choices.add("Option 3");
        choices.add("Option 4");
        correctChoiceIndex = 3;

        MultipleChoiceQuestion q1 = new MultipleChoiceQuestion(question, choices, correctChoiceIndex);

        return q1;
    }









}
