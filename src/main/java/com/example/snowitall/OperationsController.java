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
    private WebView videoTutorialK = new WebView();
    @FXML
    private WebView videoTutorial1 = new WebView();
    @FXML
    private WebView videoTutorial2 = new WebView();
    @FXML
    private WebView videoTutorial3 = new WebView();
    @FXML
    private WebView videoTutorial41 = new WebView();
    @FXML
    private WebView videoTutorial42 = new WebView();

    @FXML
    private TextField answerField;

    @FXML
    private Label resultLabel;

    //method to pass YouTube video paths to fxml file webview elements
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Load the YouTube video
        videoTutorialK.getEngine().load("https://www.youtube.com/embed/tVHOBVAFjUw");
        videoTutorial1.getEngine().load("https://www.youtube.com/embed/9IhZDEffyTk");
        videoTutorial2.getEngine().load("https://www.youtube.com/embed/ayFAh4VNMFA");
        videoTutorial3.getEngine().load("https://www.youtube.com/embed/lHIasWHn2HI");
        videoTutorial41.getEngine().load("https://www.youtube.com/embed/eW2dRLyoyds");
        videoTutorial42.getEngine().load("https://www.youtube.com/embed/rGMecZ_aERo");
    }

    //Method to handle the return button which sends the user to the landing page
    @FXML
    private void returnToLandingPageButton(ActionEvent event) throws Exception{
        System.out.println("returnToLandingPageButton called - GOING TO landing-page.fxml");
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
    private void returnToOpGradeK1(ActionEvent event) throws Exception {
        System.out.println("retunToOpGradeK1 called - GOING TO opGradeK1.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("opGradeK1.fxml"));
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void returnToOpGrade23(ActionEvent event) throws Exception {
        System.out.println("returnToOpGrade23 called - GOING TO opGrade23.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("opGrade23.fxml"));
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void returnToOpGrade4(ActionEvent event) throws Exception {
        System.out.println("returnToOpGrade4 called - GOING TO opGrade4.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("opGrade4.fxml"));
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Method to get the video tutorial fxml file for each grade to display when button is clicked on the operations landing page of that grade
    @FXML
    private void handleVtK1(ActionEvent event) throws Exception{
        System.out.println("handleVtK1 called - GOING TO opVtK1.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("opVtK1.fxml"));
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void handleVt23(ActionEvent event) throws Exception{
        System.out.println("handleVt23 called - GOING TO opVt23.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("opVt23.fxml"));
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
        Parent root = FXMLLoader.load(getClass().getResource("opVt4.fxml"));
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
        System.out.println("handlePracticeButton called - GOING TO opQuestionType.fxml");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("opQuestionType.fxml"));
        Parent root = loader.load();
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleMtK1(ActionEvent event) throws Exception{
        System.out.println("handleMtK1 called - GOING TO opMtK1.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("opMtK1.fxml"));
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void handleMt23(ActionEvent event) throws Exception{
        System.out.println("handleMt23 called - GOING TO opMt23.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("opMt23.fxml"));
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
        Parent root = FXMLLoader.load(getClass().getResource("opMt4.fxml"));
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleTF(ActionEvent event) throws Exception{
        System.out.println("handleTF called - GOING TO TF.fxml");
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
        System.out.println("handleMC called - GOING TO MC.fxml");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MC.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Get the controller object
        PracticeController controller = loader.getController();

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
        System.out.println("handleFIB called - GOING TO opGrade4FIB.fxml");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("opGrade4FIB.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Get the controller object
        PracticeController controller = loader.getController();
        PracticeModel model = new PracticeModel();

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