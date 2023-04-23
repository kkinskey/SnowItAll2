package com.example.snowitall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
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

    private Login loginApp;
    private LandingPageController landingPageScene;

    private Stage primaryStage;

    public void setLoginApp(Login loginApp) {this.loginApp = loginApp;}
    public void setLandingPageScene(LandingPageController landingPageScene) {this.landingPageScene = landingPageScene; }
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public LoginController() {
        this.loginApp = new Login();
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
//        loginApp.setScene(landingPageScene.getScene());
        loginApp.goToLandingPage(event, enterButton);

//        public void handleGoToSecondScene(ActionEvent event) {
//            String text = textField.getText(); // Get the text from the TextField
//            secondScene.setText(text); // Pass the text to the second scene
//            loginApp.setScene(landingPageScene.getScene());
//            // Switch to the second scene
//            // ...
//        }
    }

    public Scene getScene() {
        return this.getScene();
    }

}
