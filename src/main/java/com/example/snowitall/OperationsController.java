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
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class OperationsController {
        private Stage primaryStage;
        public void setPrimaryStage(Stage primaryStage) {
            this.primaryStage = primaryStage;
        }

    @FXML
    public Button returnButton;
    @FXML
    public Button nextButton;
    @FXML
    private WebView videoTutorial1 = new WebView();

    @FXML
    private WebView videoTutorial2 = new WebView();
    private WebEngine engine;

    @FXML
    private TextField answerField;

    @FXML
    private Label resultLabel;

//    public void initialize() {
//
//        engine = videoTutorial1.getEngine();
//        loadPage();
//    }
//
//    public void loadPage() {
//        String videoUrl = "https://www.youtube.com/embed/i9iGu_gDOU0";
//        String videoURL2 = "https://www.youtube.com/embed/9IhZDEffyTk";
//
//
//
//        engine.load(videoUrl);
//
//        engine.load(videoURL2);
//    }


    @FXML
    private Object root;

    @FXML
    private void returntolandingpageButton(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("landing-page.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

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

    @FXML
    private void handleNextButTontoPractice(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("practice.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }



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

    @FXML
    private void handlePracticeButton(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("practice.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void handleMasteryTestButton(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Mastery.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


//    public void initialize() {
//        videoTutorial1 = new WebView();
//        videoTutorial2  = new WebView();
//    }

//    @FXML
//    public void initialize() throws Exception {
//
//        String videoUrl = "https://www.youtube.com/embed/i9iGu_gDOU0";
//        String videoURL2 = "https://www.youtube.com/embed/9IhZDEffyTk";
//
////        videoTutorial1 = new WebView();
////        videoTutorial2  = new WebView();
//
//        videoTutorial1.getEngine().load(videoUrl);
//        videoTutorial2.getEngine().load(videoURL2);
//
//    }
    @FXML
    private void handleVideoTutorial(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("video-tutorial.fxml"));

//        initialize();


        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        videoTutorial1.getEngine().load("https://www.youtube.com/embed/i9iGu_gDOU0");
//        videoTutorial1.getEngine().load(" videoTutorial1.getEngine().load("https:://www.youtube.com/watch?v=GG-hoRpD-yQ"));
        videoTutorial2.getEngine().load("https://www.youtube.com/embed/9IhZDEffyTk");

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

//    @FXML
//    private void handlePracticeButton(ActionEvent event) throws Exception{
//        // Load the FXML file for the new window
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("practice.fxml"));
//        Parent root = loader.load();
//
//        // Get the current stage from the button's scene
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//
//        // Set the new scene on the stage
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//
//    }

//    private MultipleChoiceQuestion model = MultipleChoiceQuestion.generateMCQ();
//
//    private PracticeQuestionView view;
//
//
//
//    @FXML
//    private void handleGoToNewPageButtonAction(ActionEvent event) throws IOException {
//        // Create a new instance of the NewPageController class.
//        PracticeQuestionController newController = new PracticeQuestionController(model, view);
//
//        // Create a new stage and set its scene to the new page.
//        Stage newStage = new Stage();
//        Scene newScene = new Scene(newController);
//        newStage.setScene(newScene);
//
//        // Show the new stage.
//        newStage.show();
//    }



    @FXML
    void checkAnswer() {
        String userAnswer = answerField.getText().trim();
        String correctAnswer = "99";
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            resultLabel.setText("Correct!");
        } else {
            resultLabel.setText("Incorrect. The correct answer is " + correctAnswer);
        }
    }

    }
