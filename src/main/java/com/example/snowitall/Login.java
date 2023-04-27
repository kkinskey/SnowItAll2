package com.example.snowitall;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Login extends Application{
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load((getClass().getResource("Login.fxml")));
        // Set up the primary stage
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 553, 400));

        // Show the primary stage
        primaryStage.show();
    }
    public void goToLandingPage(ActionEvent event) {
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
