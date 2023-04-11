package com.example.snowitall;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.Random;

public class PracticeController {


    @FXML
    private Label questionText;
    @FXML
    private RadioButton choiceButtonOne;
    @FXML
    private RadioButton choiceButtonTwo;
    @FXML
    private RadioButton choiceButtonThree;
    @FXML
    private RadioButton choiceButtonFour;
    @FXML
    public Button returnButton;
    @FXML
    public Button nextButton;

    PracticeModel model = new PracticeModel();

    // Updates question label text for practice multiple choice questions
    public void updateLabelText(String text) {
        questionText.setText(text);
    }

    //Method to handle the return button which sends the user to the operationsLandingPage
    @FXML
    private void returntooperationspageButton(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("operationsLandingPage.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    //Method that handles the next button on the mastery page
    @FXML
    private void handleNextButtonToMasteryTest(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mastery.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    //generates random multiple choice questions for adding two numbers
    public void MultipleChoiceQuestionGenerator() {

        // create a new Random object
        Random random = new Random();

        // generate a random integer between 0 (inclusive) and 10 (exclusive)
        model.setNumber1(random.nextInt(100));
        model.setNumber2(random.nextInt(10));

        model.setAnswer(model.getNumber1() + model.getNumber2());

        model.setCorrectAnswer(Integer.toString(model.getAnswer()));


        model.setNum1(Integer.toString(model.getNumber1()));

        model.setNum2(Integer.toString(model.getNumber2()));


        //generates random number between 0 and 3
        model.setCorrectAnswerIndex(random.nextInt(4));

        String[] array1 = model.getChoices();

        array1[model.getCorrectAnswerIndex()] = model.getCorrectAnswer();

        model.setChoices(array1);

        String[] array = model.getChoices();

        for (int i = 0; i<4; i++) {

            if (array[i] == null) {
                int choice = random.nextInt(120);
                String incorrectAnswer = Integer.toString(choice);
                array[i] = incorrectAnswer;
            }
        }

        model.setChoices(array);

        choiceButtonOne.setText(array[0]);
        choiceButtonTwo.setText(array[1]);
        choiceButtonThree.setText(array[2]);
        choiceButtonFour.setText(array[3]);

    }

   // method that generates a string to display the mulitple choice question we are asking
    public String toString(){

        String questionText = "What is " + model.getNum1() + " + " + model.getNum2() + "?";
        return questionText;
    }
}
