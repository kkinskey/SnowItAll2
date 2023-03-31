package com.example.snowitall;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class LoginMain extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException{
        try {
            //Retrieve the fxml for the login screen
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = (Parent) fxmlLoader.load(); //Assign that fxml as the parent node
            Scene scene = new Scene(root); //Create a new scene containing root
            primaryStage.setTitle("Snow It All"); //Title will always be the name of the software
            primaryStage.setScene(scene); //Ensure the scene is set as the primaryStage
            primaryStage.show(); //Make visible
        }

        catch (IOException e) {
            e.printStackTrace();

        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
