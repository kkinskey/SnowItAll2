package com.example.snowitall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class MasteryController {

    @FXML
    private Label questionLabel;
    @FXML
    private TextField answerField;
    @FXML
    private Button submitButton;
    @FXML
    private Label feedbackLabel;

    private String answer = "36"; // The correct answer

    public void initialize() {
        // Set the question text
        questionLabel.setText("What is 9 x 4?");
    }
    @FXML
    private void handleFIBSubmitButton(ActionEvent event) {
        String userAnswer = answerField.getText().trim();
        if (userAnswer.equals(answer)) {
            feedbackLabel.setText("Correct!");
        } else {
            feedbackLabel.setText("Incorrect. The answer is " + answer);
        }
    }
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

}


