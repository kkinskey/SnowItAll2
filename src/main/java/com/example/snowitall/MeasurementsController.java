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

public class MeasurementsController implements Initializable{

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
        videoTutorialK.getEngine().load("");
        videoTutorial1.getEngine().load("");
        videoTutorial2.getEngine().load("");
        videoTutorial3.getEngine().load("");
        videoTutorial41.getEngine().load("");
        videoTutorial42.getEngine().load("");
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
    //Method to handle the return button which sends the user to the measurements Landing Page
    @FXML
    private void returnToMsGradeK1(ActionEvent event) throws Exception {
        System.out.println("retunTomsGradeK1 called - GOING TO msGradeK1.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("msGradeK1.fxml"));
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void returnToMsGrade23(ActionEvent event) throws Exception {
        System.out.println("returnTomsGrade23 called - GOING TO msGrade23.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("msGrade23.fxml"));
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void returnToMsGrade4(ActionEvent event) throws Exception {
        System.out.println("returnTomsGrade4 called - GOING TO msGrade4.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("msGrade4.fxml"));
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Method to get the video tutorial fxml file for each grade to display when button is clicked on the measurements landing page of that grade
    @FXML
    private void handleVtK1(ActionEvent event) throws Exception{
        System.out.println("handleVtK1 called - GOING TO msVtK1.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("msVtK1.fxml"));
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void handleVt23(ActionEvent event) throws Exception{
        System.out.println("handleVt23 called - GOING TO msVt23.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("msVt23.fxml"));
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void handleVt4(ActionEvent event) throws Exception{
        System.out.println("handleVt4 called - GOING TO msVt4.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("msVt4.fxml"));
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Method to get the practice fxml file to display when button is clicked on the measurements page
    @FXML
    private void handlePracticeButton(ActionEvent event) throws Exception{
        System.out.println("handlePracticeButton called - GOING TO msQuestionType.fxml");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("msQuestionType.fxml"));
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
        System.out.println("handleMtK1 called - GOING TO msMtK1.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("msMtK1.fxml"));
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void handleMt23(ActionEvent event) throws Exception{
        System.out.println("handleMt23 called - GOING TO msMt23.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("msMt23.fxml"));
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void handleMt4(ActionEvent event) throws Exception{
        System.out.println("handleMt4 called - GOING TO msMt4.fxml");
        Parent root = FXMLLoader.load(getClass().getResource("msMt4.fxml"));
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
