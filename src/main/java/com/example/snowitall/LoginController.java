package com.example.snowitall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//import java.sql.SQLException;

public class LoginController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorLabel;

    @FXML
    private Button enterButton;

    private Login model = new Login(); //Make Login object

    private Stage primaryStage;
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    private void handleLogin(ActionEvent event) throws Exception {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Perform login validation here

        if (username.equals("admin") && password.equals("password")) {
            // Login successful, do something here
            System.out.println("Login successful!");
        } else {
            // Login failed, display error message
            errorLabel.setText("Invalid username or password.");
        }

//        // Load the FXML file for the new window
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("landing-page.fxml"));
//        Parent root = loader.load();
//
//        // Get the current stage from the button's scene
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//
//        // Set the new scene on the stage
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.setTitle("SnowItAll");

        model.goToLandingPage(event, enterButton);
    }

    //Take them to the homepage when they click the enter button
//    @FXML
//    void enterClicked(ActionEvent event) throws SQLException {
//        if(Database.loginUser(usernameTextField.getText(), passwordTextField.getText())) {
//            model.goToHomePage(event, enterButton);
//        }
//        else { //The username or password was incorrect
//            model.openPopup(event, enterButton); //Open popup warning
//        }
//    }

}
