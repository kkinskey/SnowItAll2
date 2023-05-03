package com.example.snowitall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LandingPageController implements SceneController{

    private Login model;
    private Scene loginScene;
    private Scene operationScene;

    private Stage primaryStage;


    public void setLoginScene(Scene loginScene) { this.loginScene = loginScene; }

    //used to go from ' GradePrompt.fxml ' back to the main landing page
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


//    public void labelSetter() {
//        model.getGiftGlooController().setLabel(model.getPracticeController().getIntLabel());
//    }
    @FXML
    private void handleOperations(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("GradePrompt.fxml"));

            // Get the current stage from the button's scene
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

            // Set the new scene on the stage
            Scene scene = new Scene(root);
            stage.setTitle("Snow It All");
            stage.setScene(scene);
            stage.show();
//        this.loginApp.setScene(this.operationScene.getScene());
    }

    @FXML
    private void handleMeasurements(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("msGradePrompt.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setTitle("Snow It All");
        stage.setScene(scene);
        stage.show();
//        this.loginApp.setScene(this.operationScene.getScene());
    }

    @FXML
    private void handleGeometry(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("gyGradePrompt.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setTitle("Snow It All");
        stage.setScene(scene);
        stage.show();
//        this.loginApp.setScene(this.operationScene.getScene());
    }


//    public void handleGoToSecondScene(ActionEvent event) {
//        String text = this.textField.getText();
//        this.secondScene.setText(text);
//        this.mainApp.setScene(this.secondScene.getScene());
//    }

    @FXML
    private void handleGrade(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("operationsLandingPage.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setTitle("Snow It All");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleMsGrade(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("measurementsLandingPage.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setTitle("Snow It All");
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private void handleGyGrade(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("geometryLandingPage.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setTitle("Snow It All");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleGiftGloo(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GiftGloo.fxml"));
//        FXMLLoader l = new FXMLLoader(getClass().getResource("FIB.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Get the controller object
//        GiftGlooController giftGlooController = loader.getController();
//        PracticeController practiceController = l.getController();
//        GiftGlooController giftGlooController = l.getController(); //NOTE: You cannot have two loaders apparently!

//        System.out.println("SnowFlakes" + );
        // Call the setLabelText() method on the controller object
//        giftGlooController.setLabel(practiceController.getIntLabel());
//           String text = giftGlooController.practiceController.getGift().getSnowflakes() + "";
//           System.out.println(text);
//           giftGlooController.updateLabelText(text);
//        labelSetter();


        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setTitle("Snow It All");
        stage.setScene(scene);
        stage.show();
    }


//    @FXML
//    private void handleGiftGloo(ActionEvent event) throws Exception {
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("GiftGloo.fxml"));
////        FXMLLoader l = new FXMLLoader(getClass().getResource("FIB.fxml"));
//        Parent root = loader.load();
//
//        // Get the current stage from the button's scene
//        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
//
//        GiftGlooController firstController = new GiftGlooController();
//        Scene firstScene = loadFXML("FirstView.fxml", firstController);
//        firstController.setMainApp(this);
//
//        PracticeController secondController = new PracticeController();
//        Scene secondScene = loadFXML("SecondView.fxml", secondController);
//        secondController.setMainApp(this);
//        secondController.setFirstScene(firstScene);
//        firstController.setSecondScene(secondController);
//
//
//        // Set the new scene on the stage
//        Scene scene = new Scene(root);
//        stage.setTitle("Snow It All");
//        stage.setScene(scene);
//        stage.show();
//    }

    public Scene loadFXML(String fxml, Object controller) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
        loader.setController(controller);
        Parent root = loader.load();
        return new Scene(root);
    }

    /** This method sets the scene on the primary stage, which is useful for switching between different scenes*/
    public void setScene(Scene scene) {
        primaryStage.setScene(scene);
    }

    @Override
    public void setText(String text) {

    }

    @Override
    public Scene getScene() {
        return null;
    }
}
