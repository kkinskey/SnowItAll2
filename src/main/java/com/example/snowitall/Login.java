package com.example.snowitall;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

import java.io.IOException;


public class Login extends Application{

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));


        // Set up the primary stage
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();


        // Show the primary stage
        primaryStage.show();
    }




    public void goToLandingPage(ActionEvent event, Button button) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("landing-page.fxml"));
            Parent homePageParent = loader.load();
            Scene homePageScene = new Scene(homePageParent); //Make scene with that path
            Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow()); //Assign nodes to the window
            window.setScene(homePageScene); //Set the scene
            window.show(); //Make it visible

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

