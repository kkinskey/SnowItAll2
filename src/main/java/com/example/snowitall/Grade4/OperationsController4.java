package com.example.snowitall.Grade4;

import com.example.snowitall.GradeK1.PracticeControllerK1;
import com.example.snowitall.GradeK1.PracticeModelK1;
import com.example.snowitall.PracticeController;
import com.example.snowitall.PracticeModel;
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

public class OperationsController4 implements Initializable {

    @FXML
    public Button returnButton;
    @FXML
    public Button nextButton;
    @FXML
    private WebView videoTutorial41 = new WebView();
    @FXML
    private WebView videoTutorial42 = new WebView();

    @FXML
    private TextField answerField;

    @FXML
    private Label resultLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Load the YouTube video
        videoTutorial41.getEngine().load("https://www.youtube.com/embed/ayFAh4VNMFA");
        videoTutorial42.getEngine().load("https://www.youtube.com/embed/lHIasWHn2HI");
    }

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

    @FXML
    private void handleOpGrade4(ActionEvent event) throws Exception {
        System.out.println("returnToOpGrade4 called - GOING TO opGrade4.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/opGrade4.fxml"));
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Method to get the practice fxml file to display when button is clicked on the operations page
    @FXML
    private void handlePracticeButton(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/snowitall/opQuestionType.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Get the controller object
        PracticeControllerK1 controller = loader.getController();
        PracticeModelK1 model = new PracticeModelK1();

        System.out.println("handlePracticeButton has been called - GOING TO Operations FIB PAGE");

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

    @FXML
    private void handleFIB(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/snowitall/opGradeK1FIB.fxml"));
        Parent root = loader.load();


        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();


        // Get the controller object
        PracticeControllerK1 controller = loader.getController();
        PracticeModelK1 model = new PracticeModelK1();


        System.out.println("handlePracticeButton has been called - GOING TO Operations FIB PAGE");


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
}


