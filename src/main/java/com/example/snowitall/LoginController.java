package com.example.snowitall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

public class LoginController {
    //Labels for front login page
//    @FXML
//    private Button openLoginBlock;
//    @FXML
//    private Button openSignUpBlock;
    @FXML
    private AnchorPane loginAnchorPane;
    @FXML
    private AnchorPane titleAnchorPane;
    @FXML
    private ImageView incorrectCreds;

    //Labels for signUp block
    @FXML
    private AnchorPane newUserAnchorPane;
    @FXML
    private Button newUserSubmitButton;
    @FXML
    private TextField newUsernameField;
    @FXML
    private TextField newPasswordField;
    @FXML
    private ImageView aviImage;
    @FXML
    private Button leftSelectArrow;
    @FXML
    private Button rightSelectArrow;

    //Labels for user block
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private Button userSubmitLogin;

    //Initializers
    private Login model = new Login(); //Make Login object
    private Stage primaryStage;
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    //Set loginAnchorPane true, else false
    @FXML
    private void loginBlock() throws Exception {
        loginAnchorPane.setDisable(false);
        loginAnchorPane.setVisible(true);

        titleAnchorPane.setDisable(true);
        titleAnchorPane.setVisible(false);

        newUserAnchorPane.setDisable(true);
        newUserAnchorPane.setVisible(false);
    }

    //Set newUserAnchorPane true, else false
    @FXML
    private void signUpBlock() {
        loginAnchorPane.setDisable(true);
        loginAnchorPane.setVisible(false);

        titleAnchorPane.setDisable(true);
        titleAnchorPane.setVisible(false);

        newUserAnchorPane.setDisable(false);
        newUserAnchorPane.setVisible(true);
    }

    @FXML
    private void handleUserLogin(ActionEvent event) throws Exception {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Perform login validation here

        if (username.equals("admin") && password.equals("password")) {
            // Login successful, do something here
            System.out.println("Login successful!");

            // Load the FXML file for the new window
            FXMLLoader loader = new FXMLLoader(getClass().getResource("landing-page.fxml"));
            Parent root = loader.load();

            // Get the current stage from the button's scene
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Set the new scene on the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("SnowItAll");

            model.goToLandingPage(event);
        } else {
            // Login failed, display error message
            System.out.println("Login Failed!");

            incorrectCreds.setVisible(true);
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    incorrectCreds.setVisible(false);
                }
            }, 3000);
        }
    }
    @FXML
    public void handleNewUserLogin(ActionEvent event) throws Exception {
        // Load the FXML file for the new window
        FXMLLoader loader = new FXMLLoader(getClass().getResource("landing-page.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("SnowItAll");

        model.goToLandingPage(event);
    }

    public void switchAviBack(ActionEvent actionEvent) {

    }

    public void switchAviForward(ActionEvent actionEvent) {
    }
}