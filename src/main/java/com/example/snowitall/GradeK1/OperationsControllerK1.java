package com.example.snowitall.GradeK1;

import com.example.snowitall.MasteryTestController;
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

    public class OperationsControllerK1 implements Initializable {


        @FXML
        public Button returnButton;
        @FXML
        public Button nextButton;
        @FXML
        private WebView videoTutorialK = new WebView();
        @FXML
        private WebView videoTutorial1 = new WebView();

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
        }

        //Method to handle the return button which sends the user to the landing page
        @FXML
        private void returntolandingpageButton(ActionEvent event) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/landing-page.fxml"));

            // Get the current stage from the button's scene
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            // Set the new scene on the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        //Method to handle the return button which sends the user to the operationsLandingPage
        @FXML
        private void handleOpGradeK1(ActionEvent event) throws Exception {
            System.out.println("retunToOpGradeK1 called - GOING TO opGradeK1.fxml");
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/opGradeK1.fxml"));
            // Get the current stage from the button's scene
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            // Set the new scene on the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        //Method to get the video tutorial fxml file for each grade to display when button is clicked on the operations landing page of that grade
        @FXML
        private void handleVtK1(ActionEvent event) throws Exception {
            System.out.println("handleVtK1 called - GOING TO opVtK1.fxml");
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/opVtK1.fxml"));
            // Get the current stage from the button's scene
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            // Set the new scene on the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        //Method to get the practice fxml file to display when button is clicked on the operations page
        @FXML
        private void handlePracticeButton(ActionEvent event) throws Exception {
            System.out.println("handlePracticeButton called - GOING TO opQuestionType.fxml");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/snowitall/opGrade23FIB.fxml"));
            Parent root = loader.load();
            // Get the current stage from the button's scene
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            // Set the new scene on the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        @FXML
        private void handleMtK1(ActionEvent event) throws Exception {
            System.out.println("handleMtK1 called - GOING TO opMtK1.fxml");
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/opMtK1.fxml"));
            // Get the current stage from the button's scene
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            // Set the new scene on the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        @FXML
        private void handleTF(ActionEvent event) throws Exception {
            System.out.println("handleTF called - GOING TO TF.fxml");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/snowitall/TF.fxml"));
            Parent root = loader.load();

            // Get the current stage from the button's scene
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

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

//    @FXML
//    private void handleMC(ActionEvent event) throws Exception {
//        System.out.println("handleMC called - GOING TO MC.fxml");
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/snowitall/MC.fxml"));
//        Parent root = loader.load();
//
//        // Get the current stage from the button's scene
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//
//        // Get the controller object
//        PracticeController controller = loader.getController();
//
//        //sets submit button disable attribute to false when radio button is selected
//        controller.mcInitialize();
//
//        //generates multiple choice question
//        controller.MultipleChoiceQuestionGenerator();
//
//        // Call the setLabelText() method on the controller object
//        controller.updateLabelText(controller.getModel().toStringFIB(controller.getModel().getOperationSymbol()));
//
//        // Set the new scene on the stage
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//
//    }

        @FXML
        private void handleFIB(ActionEvent event) throws Exception {
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



        //Method to get the practice fxml file to display when button is clicked on the operations page
//        @FXML
//        private void handlePracticeButton(ActionEvent event) throws Exception {
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/snowitall/opGradeK1FIB.fxml"));
//            Parent root = loader.load();
//
//            // Get the current stage from the button's scene
//            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//
//            // Get the controller object
//            PracticeControllerK1 controller = loader.getController();
//            PracticeModelK1 model = new PracticeModelK1();
//
//            System.out.println("handlePracticeButton has been called - GOING TO Operations FIB PAGE");
//
//            //generates fill in the blank question
//            //controller.generateQuestionBasedOnGrade();
//            controller.randomShapeGenerator();
//
//            // Call the setLabelText() method on the controller object
//            controller.updateLabelText(model.toStringFIB());
//
//            // Set the new scene on the stage
//            Scene scene = new Scene(root);
//            stage.setScene(scene);
//            stage.show();
//
//        }

        //Method to get the Mastery fxml file to display when button is clicked on the operations page
        @FXML
        private void handleMasteryTestButton(ActionEvent event) throws Exception {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(""));
            Parent root = loader.load();

            // Get the current stage from the button's scene
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
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


        //Method to get the video-tutorial fxml file to display when button is clicked on the operations page
        @FXML
        private void handleVideoTutorial(ActionEvent event) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("opVideoTutorial.fxml"));


            // Get the current stage from the button's scene
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Set the new scene on the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }

