package com.example.snowitall;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;


import java.io.IOException;


public class VideoTutorialController extends Application
{
    @FXML
    public  Button returnButton;
    @FXML
    public Button nextButton;
    @FXML
    private WebView videoTutorial1;


    @FXML
    private WebView videoTutorial2;
    @FXML
    private Object root;


    public static void main(String[] args)
    {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new   FXMLLoader(getClass().getResource("video-tutorial.fxml"));
        loader.setRoot(root);
        loader.setControllerFactory(c -> this);
        root = loader.load();


        videoTutorial1.getEngine().load("https://www.youtube.com/embed/i9iGu_gDOU0");
        videoTutorial2.getEngine().load("https://www.youtube.com/embed/9IhZDEffyTk");


        Scene scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private void handleButton(ActionEvent event, String fxmlFile) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        Standard controller = new Standard();
        loader.setController(controller);
        AnchorPane root = loader.load();


        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private void handleReturnButton(ActionEvent event) throws IOException
    {
        handleButton(event, "operations.fxml");
    }


    @FXML
    private void handleNextButton(ActionEvent event) throws IOException
    {
        handleButton(event, "practice.fxml");
    }


}

