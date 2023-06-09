package com.example.snowitall.GradeK1;

import com.example.snowitall.Grade;
import com.example.snowitall.PracticeController;
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
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class GeometryController implements Initializable
{
    @FXML
    public Button returnButton;
    @FXML
    public Button nextButton;
    @FXML
    private WebView videoTutorial1 = new WebView();

    @FXML
    private WebView videoTutorial2 = new WebView();

    @FXML
    private TextField answerField;

    @FXML
    private Label resultLabel;

    //Method to handle the return button which sends the user to the landing page
    @FXML
    private void returnToLandingPageButton(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/snowitall/landing-page.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        System.out.println("returnToLandingPageButton has been called - GOING TO MAIN LANDING PAGE");
    }

    //Method to handle the return button which sends the user to the operationsLandingPage
    @FXML
    private void returnToGeometryButton(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/snowitall/geometryLandingPage.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        System.out.println("returnToGeometryButton has been called - GOING TO GEOMETRY LANDING PAGE");
    }

    //Method to get the video-tutorial fxml file to display when button is clicked on the operations page
    @FXML
    private void handleVideoTutorial(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("gyVideoTutorial.fxml"));
        Parent root = loader.load();


        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        System.out.println("handleVideoTutorial has been called - GOING TO GEOMETRY VIDEO TUTORIAL PAGE");
    }

    //Method to get the practice fxml file to display when button is clicked on the operations page
    @FXML
    private void handlePracticeButton(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/snowitall/gyQuestionType.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        System.out.println("handlePracticeButton has been called - GOING TO GEOMETRY PRACTICE PAGE");
    }

    //Method to get the Mastery fxml file to display when button is clicked on the operations page
    @FXML
    private void handleMasteryTestButton(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("gyMastery.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        System.out.println("handleMasteryTestButton has been called - GOING TO GEOMETRY MASTERY PAGE");
    }

    //method to pass youtube video paths to fxml file webview elements
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Load the YouTube video
        videoTutorial1.getEngine().load("https://www.youtube.com/embed/i9iGu_gDOU0");
        videoTutorial2.getEngine().load("https://www.youtube.com/embed/9IhZDEffyTk");

        System.out.println("intialize has been called - DISPLAYING YOUTUBE VIDEOS");


    }

//    @FXML
//    private void handleTF(ActionEvent event) throws Exception{
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("TF.fxml"));
//        Parent root = loader.load();
//
//        // Get the current stage from the button's scene
//        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
//
//
//        // Get the controller object
//        PracticeController controller = loader.getController();
//
//        controller.tfInitialize();
//
//
//        //generates True False question
//        controller.TrueFalseQuestionGenerator();
//
//        // Call the setLabelText() method on the controller object
//        controller.updateLabelText(controller.toStringTF());
//
//        // Set the new scene on the stage
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//
//    }

    @FXML
    private void handleMC(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MC.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Get the controller object
        PracticeController controller = loader.getController();

        System.out.println("Handle MC has been called");

        //sets submit button disable attribute to false when radio button is selected
        controller.mcInitialize();

        //generates multiple choice question
        controller.MultipleChoiceQuestionGenerator();

        // Call the setLabelText() method on the controller object
        controller.updateLabelText(controller.toString());

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    //Method to go to Fill in the Blank questions
    @FXML
    private void handleFIB(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/snowitall/gyFIB.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Get the controller object
        GeoPracController controller = loader.getController();
        GeoModel model = new GeoModel();

        System.out.println("handleFIB has been called - GOING TO GEOMETRY FIB PAGE");

        //generates fill in the blank question
        //controller.generateQuestionBasedOnGrade();
        controller.randomShapeGenerator();

        // Call the setLabelText() method on the controller object
        controller.updateLabelText(model.toStringFIB());

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private Object model; // Replace 'Object' with the actual type of your model

    public void setModel(Object model) {
        this.model = model;
        // Additional logic to update the UI or perform other actions with the model
    }
}
