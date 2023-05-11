package com.example.snowitall.Grade23;



import com.example.snowitall.MasteryTestController;

import com.example.snowitall.GradeK1.PracticeControllerK1;
import com.example.snowitall.GradeK1.PracticeModelK1;

import com.example.snowitall.PracticeController;
import com.example.snowitall.Grade23.PracticeModel23;
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
public class OperationsController23 implements Initializable{

    @FXML
    public Button returnButton;
    @FXML
    public Button nextButton;
    @FXML
    private WebView videoTutorial2 = new WebView();
    @FXML
    private WebView videoTutorial3 = new WebView();

    @FXML
    private TextField answerField;

    @FXML
    private Label resultLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Load the YouTube video
        videoTutorial2.getEngine().load("https://www.youtube.com/embed/ayFAh4VNMFA");
        videoTutorial3.getEngine().load("https://www.youtube.com/embed/lHIasWHn2HI");
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
    private void handleOpGrade23(ActionEvent event) throws Exception {
        System.out.println("returnToOpGrade23 called - GOING TO opGrade23.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/opGrade23.fxml"));
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleVt23(ActionEvent event) throws Exception{
        System.out.println("handleVt23 called - GOING TO opVt23.fxml");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/snowitall/opVt23.fxml"));
        Parent root = loader.load();
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    //Method to get the practice fxml file to display when button is clicked on the operations page

    @FXML
    private void handleFIB (ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/snowitall/opGradeK1FIB.fxml"));
        Parent root = loader.load();


        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();


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
    private void handleMt23(ActionEvent event) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/snowitall/opMastery.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        MasteryTestController controller = loader.getController();

        //generates fill in the blank question
        controller.FillInBlankQuestionGenerator();

        // Call the setLabelText() method on the controller object
        controller.updateLabelText(controller.getModel().toStringFIB(controller.getModel().getOperationSymbol()));


        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    @FXML
    private void handleMasteryTestButton(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/snowitall/masterytestprompt.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();


        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    @FXML
    private void handleFIB(ActionEvent event) throws Exception{
        System.out.println("handleFIB called - GOING TO opGrade23FIB.fxml");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("com/example/snowitall/opGrade23FIB.fxml"));


        Parent root = loader.load();
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();



        // Get the controller object
        PracticeController23 controller = loader.getController();
        PracticeModel23 model = new PracticeModel23();


        //generates fill in the blank question
        controller.FillInBlankQuestionGenerator();


        // Call the setLabelText() method on the controller object
        controller.updateLabelText(controller.getModel().toStringFIB(controller.getModel().getOperationSymbol()));



        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}