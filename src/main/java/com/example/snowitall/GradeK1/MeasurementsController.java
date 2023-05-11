package com.example.snowitall.GradeK1;

import com.example.snowitall.GiftGlooController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.ResourceBundle;

public class MeasurementsController implements Initializable
{
    @FXML
    private ImageView redcow, bluecow, yellowcow, four;

    @FXML
    public Button returnButton;
    @FXML
    public Button nextButton;

    @FXML
    public Button nextQuestionButton;

    @FXML
    public Button submitButtonFIB;

    @FXML
    private ImageView correctAnswerImage;
    @FXML
    private ImageView incorrectAnswerImage1;

    @FXML
    private ImageView giftAlert;
    @FXML
    private Label intLabel;
    @FXML
    private WebView videoTutorial1 = new WebView();

    @FXML
    private WebView videoTutorial2 = new WebView();

    @FXML
    private TextField answer;

    private final PracticeModelK1 model;

    @FXML
    private Button xButton;

    public int reward;

    public void setReward(int reward) {
        this.reward = reward;
    }

    // Updates question label text for practice multiple choice questions
    public void updateLabelText(String text) {
        questionText.setText(text);
    }
    @FXML
    private Label questionText;



    public MeasurementsController() {
        this.model = new PracticeModelK1();
    }

    @FXML
    private Label resultLabel;

    //Method to handle the return button which sends the user to the landing page
    @FXML
    private void returnToLandingPageButton(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/landing-page.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    //Method to handle the return button which sends the user to the operationsLandingPage
    @FXML
    private void returnToMeasurementsButton(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/msGradeK1.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    //Method to get the practice fxml file to display when button is clicked on the operations page
    @FXML
    private void handlePracticeButton(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/snowitall/msGradeK1FIB.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        mspracticecontroller controller = loader.getController();
        PracticeModelK1 model = new PracticeModelK1();


        System.out.println("handlePracticeButton has been called - GOING TO Measurements FIB PAGE");

        //generates fill in the blank question
        //controller.generateQuestionBasedOnGrade();
        controller.randomQuestionGenerator();

        // Call the setLabelText() method on the controller object
        controller.updateLabelText(controller.toStringFIB());

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }



    @FXML
    private void returntolandingpageButton(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/landing-page.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }



    //Method to get the Mastery fxml file to display when button is clicked on the operations page
    @FXML
    private void handleMasteryTestButton(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/msMastery.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    //Method to get the video-tutorial fxml file to display when button is clicked on the operations page
    @FXML
    private void handleVideoTutorial(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/msVideoTutorial.fxml"));


        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    //method to pass youtube video paths to fxml file webview elements
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Load the YouTube video
        videoTutorial1.getEngine().load("https://www.youtube.com/embed/2wUsdsae0ro");
        videoTutorial2.getEngine().load("https://www.youtube.com/embed/MbtmucV-U2c");

    }




}
