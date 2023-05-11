package com.example.snowitall;


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


public class OperationsController implements Initializable{

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
        Parent root = FXMLLoader.load(getClass().getResource("landing-page.fxml"));


        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();


        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }




    //Method to handle the return button which sends the user to the operationsLandingPage
    @FXML
    private void returnToOperationsPageButton(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("opGrade4.fxml"));


        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();


        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }


    //Method that handles the next button on the practice page to send the user to the mastery page
    @FXML
    private void handleNextButTontoPractice(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("opQuestionType.fxml"));
        Parent root = loader.load();


        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();


        // Get the controller object
        OperationsController controller = loader.getController();




//        controller.MultipleChoiceQuestionGenerator();
//
//        // Call the setLabelText() method on the controller object
//        controller.updateLabelText(controller.toString());


        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }






    //Method to get the practice fxml file to display when button is clicked on the operations page
    @FXML
    private void handlePracticeButton(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("opQuestionType.fxml"));
        Parent root = loader.load();


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
        Parent root = FXMLLoader.load(getClass().getResource("opMastery.fxml"));


        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();


        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    private void handleVt4(ActionEvent event) throws Exception{
        System.out.println("handleVt4 called - GOING TO opVt4.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/opVt4.fxml"));
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleMt4(ActionEvent event) throws Exception{
        System.out.println("handleMt4 called - GOING TO opMt4.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/opMt4.fxml"));
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
        Parent root = FXMLLoader.load(getClass().getResource("opVideoTutorial.fxml"));




        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();


        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private void handleTF(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TF.fxml"));
        Parent root = loader.load();


        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();




        // Get the controller object
        PracticeController controller = loader.getController();


        controller.tfInitialize();




        //generates True False question
        controller.TrueFalseQuestionGenerator();


        // Call the setLabelText() method on the controller object
        controller.updateLabelText(controller.getModel().toStringTF(controller.getModel().getOperationSymbol()));


        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }


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
        controller.updateLabelText(controller.getModel().toStringFIB(controller.getModel().getOperationSymbol()));


        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    private void handleFIB(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("opGrade4FIB.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Get the controller object
        PracticeController controller = loader.getController();
        PracticeModel model = new PracticeModel();

        System.out.println("Handle FIB has been called");

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