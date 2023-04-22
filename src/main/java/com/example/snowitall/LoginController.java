package com.example.snowitall;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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

//    private Login model; //Make Login object
//
//    public LoginController() {
//        this.model = new Login();
//    }

    private Stage primaryStage;
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

//    @FXML
//    private void handleLogin(ActionEvent event) throws Exception {
//        String username = usernameField.getText();
//        String password = passwordField.getText();
//
//        // Perform login validation here
//
//        if (username.equals("admin") && password.equals("password")) {
//            // Login successful, do something here
//            System.out.println("Login successful!");
//        } else {
//            // Login failed, display error message
//            errorLabel.setText("Invalid username or password.");
//        }
//
//        model.goToLandingPage(event, enterButton);
//    }

}
