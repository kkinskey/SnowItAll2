////package com.example.snowitall;
////
////import javafx.event.ActionEvent;
////import javafx.fxml.FXML;
////import javafx.scene.Scene;
////import javafx.scene.control.Button;
////import javafx.scene.control.Label;
////import javafx.scene.control.PasswordField;
////import javafx.scene.control.TextField;
////import javafx.stage.Stage;
////
//////import java.sql.SQLException;
////
////public class LoginController {
////    @FXML
////    private TextField usernameField;
////
////    @FXML
////    private PasswordField passwordField;
////
////    @FXML
////    private Label errorLabel;
////
////    @FXML
////    private Button enterButton;
////
////    private Login loginApp;
////    private LandingPageController landingPageScene;
////
////    private Stage primaryStage;
////
////    public void setLoginApp(Login loginApp) {this.loginApp = loginApp;}
////    public void setLandingPageScene(LandingPageController landingPageScene) {this.landingPageScene = landingPageScene; }
////    public void setPrimaryStage(Stage primaryStage) {
////        this.primaryStage = primaryStage;
////    }
////
////    public LoginController() {
////        this.loginApp = new Login();
////    }
////
////    @FXML
////    private void handleLogin(ActionEvent event) throws Exception {
////        String username = usernameField.getText();
////        String password = passwordField.getText();
////
////        // Perform login validation here
////
////        if (username.equals("admin") && password.equals("password")) {
////            // Login successful, do something here
////            System.out.println("Login successful!");
////        } else {
////            // Login failed, display error message
////            errorLabel.setText("Invalid username or password.");
////        }
//////        loginApp.setScene(landingPageScene.getScene());
////        loginApp.goToLandingPage(event, enterButton);
////
//////        public void handleGoToSecondScene(ActionEvent event) {
//////            String text = textField.getText(); // Get the text from the TextField
//////            secondScene.setText(text); // Pass the text to the second scene
//////            loginApp.setScene(landingPageScene.getScene());
//////            // Switch to the second scene
//////            // ...
//////        }
////    }
////
////    public Scene getScene() {
////        return this.getScene();
////    }
////
////}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////LoginController.java
//package com.example.snowitall;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.TextField;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.AnchorPane;
//import javafx.stage.Stage;
//
//public class LoginController {
//    //Labels for front login page
////    @FXML
////    private Button openLoginBlock;
////    @FXML
////    private Button openSignUpBlock;
//    @FXML
//    private AnchorPane loginAnchorPane;
//    @FXML
//    private AnchorPane titleAnchorPane;
//    @FXML
//    private ImageView incorrectCreds;
//
//    //Labels for signUp block
//    @FXML
//    private AnchorPane newUserAnchorPane;
//    @FXML
//    private Button newUserSubmitButton;
//    @FXML
//    private TextField newUsernameField;
//    @FXML
//    private TextField newPasswordField;
//    @FXML
//    private ImageView aviImage;
//    @FXML
//    private Button leftSelectArrow;
//    @FXML
//    private Button rightSelectArrow;
//
//    //Labels for user block
//    @FXML
//    private TextField usernameField;
//    @FXML
//    private TextField passwordField;
//    @FXML
//    private Button userSubmitLogin;
//
//    //Initializers
//    private Login model = new Login(); //Make Login object
//    private Stage primaryStage;
//    public void setPrimaryStage(Stage primaryStage) {
//        this.primaryStage = primaryStage;
//    }
//
//    //Set loginAnchorPane true, else false
//    @FXML
//    private void loginBlock() throws Exception {
//        loginAnchorPane.setDisable(false);
//        loginAnchorPane.setVisible(true);
//
//        titleAnchorPane.setDisable(true);
//        titleAnchorPane.setVisible(false);
//
//        newUserAnchorPane.setDisable(true);
//        newUserAnchorPane.setVisible(false);
//    }
//
//    //Set newUserAnchorPane true, else false
//    @FXML
//    private void signUpBlock() {
//        loginAnchorPane.setDisable(true);
//        loginAnchorPane.setVisible(false);
//
//        titleAnchorPane.setDisable(true);
//        titleAnchorPane.setVisible(false);
//
//        newUserAnchorPane.setDisable(false);
//        newUserAnchorPane.setVisible(true);
//    }
//
//    @FXML
//    private void handleUserLogin(ActionEvent event) throws Exception {
//        String username = usernameField.getText();
//        String password = passwordField.getText();
//
//        // Perform login validation here
//
////        if (username.equals("admin") && password.equals("password")) {
////            // Login successful, do something here
////            System.out.println("Login successful!");
//
//            // Load the FXML file for the new window
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("landing-page.fxml"));
//            Parent root = loader.load();
//
//            // Get the current stage from the button's scene
//            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//
//            // Set the new scene on the stage
//            Scene scene = new Scene(root);
//            stage.setScene(scene);
//            stage.setTitle("SnowItAll");
//
//            model.goToLandingPage(event);
////        } else {
////            // Login failed, display error message
////            System.out.println("Login Failed!");
////
////            incorrectCreds.setVisible(true);
////            Timer timer = new Timer();
////            timer.schedule(new TimerTask() {
////                @Override
////                public void run() {
////                    incorrectCreds.setVisible(false);
////                }
////            }, 3000);
////        }
//    }
//    @FXML
//    public void handleNewUserLogin(ActionEvent event) throws Exception {
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
//
//        model.goToLandingPage(event);
//    }
//
//    public void switchAviBack(ActionEvent actionEvent) {
//
//    }
//
//    public void switchAviForward(ActionEvent actionEvent) {
//    }
//}























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

import java.sql.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import java.sql.*;

import java.util.Random;

public class LoginController {

    private int currentUserID = 0;

    public int getUserID() {
        return currentUserID;
    }
    @FXML
    private ImageView moose;
    @FXML
    private ImageView fox;
    @FXML
    private ImageView narwal;
    @FXML
    private ImageView owl;
    @FXML
    private ImageView penguin;
    @FXML
    private ImageView bear;
    @FXML
    private ImageView seal;
    @FXML
    private ImageView walrus;
    @FXML
    private ImageView whale;
    private int aviTracker[] = {1,0,0,0,0,0,0,0,0};
    
    //Labels for front login page
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

        if (queryUsernameAndPassword(username, password)) {
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
        String username = newUsernameField.getText();
        String password = newPasswordField.getText();

        if (queryUsername(username)) {
            System.out.println("Duplicate Username!");

            incorrectCreds.setVisible(true);
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    incorrectCreds.setVisible(false);
                }
            }, 3000);
        }

        else
        {
            pushNewCredentials(username, password);
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
    }
    
    public int findCurrentAvi() {
        for(int i = 0; i < aviTracker.length; i++) {
            if (aviTracker[i] == 1) {
                System.out.println("current avi at: " + i);
                return i;
            }
        }
        return 0;
    }
    @FXML
    public void setAviVisibleFalse() {
        moose.setVisible(false);
        fox.setVisible(false);
        narwal.setVisible(false);
        owl.setVisible(false);
        penguin.setVisible(false);
        bear.setVisible(false);
        seal.setVisible(false);
        walrus.setVisible(false);
        whale.setVisible(false);
    }

    @FXML
    public void switchAviBack(ActionEvent actionEvent) {
        System.out.println(findCurrentAvi());
        switch (findCurrentAvi())
        {
            case 0:
                aviTracker[0] = 0;
                aviTracker[8] = 1;
                System.out.println(findCurrentAvi());
                setAviVisibleFalse();
                whale.setVisible(true);
                break;
            case 1:
                aviTracker[1] = 0;
                aviTracker[0] = 1;
                setAviVisibleFalse();
                moose.setVisible(true);
                break;
            case 2:
                aviTracker[2] = 0;
                aviTracker[1] = 1;
                setAviVisibleFalse();
                fox.setVisible(true);
                break;
            case 3:
                aviTracker[3] = 0;
                aviTracker[2] = 1;
                setAviVisibleFalse();
                narwal.setVisible(true);
                break;
            case 4:
                aviTracker[4] = 0;
                aviTracker[3] = 1;
                setAviVisibleFalse();
                owl.setVisible(true);
                break;
            case 5:
                aviTracker[5] = 0;
                aviTracker[4] = 1;
                setAviVisibleFalse();
                penguin.setVisible(true);
                break;
            case 6:
                aviTracker[6] = 0;
                aviTracker[5] = 1;
                setAviVisibleFalse();
                bear.setVisible(true);
                break;
            case 7:
                aviTracker[7] = 0;
                aviTracker[6] = 1;
                setAviVisibleFalse();
                seal.setVisible(true);
                break;
            case 8:
                aviTracker[8] = 0;
                aviTracker[7] = 1;
                setAviVisibleFalse();
                walrus.setVisible(true);
                break;
        }

    }

    @FXML
    public void switchAviForward(ActionEvent actionEvent) {
        switch (findCurrentAvi())
        {
            case 0:
                aviTracker[0] = 0;
                aviTracker[1] = 1;
                setAviVisibleFalse();
                fox.setVisible(true);
                break;
            case 1:
                aviTracker[1] = 0;
                aviTracker[2] = 1;
                setAviVisibleFalse();
                narwal.setVisible(true);
                break;
            case 2:
                aviTracker[2] = 0;
                aviTracker[3] = 1;
                setAviVisibleFalse();
                owl.setVisible(true);
                break;
            case 3:
                aviTracker[3] = 0;
                aviTracker[4] = 1;
                setAviVisibleFalse();
                penguin.setVisible(true);
                break;
            case 4:
                aviTracker[4] = 0;
                aviTracker[5] = 1;
                setAviVisibleFalse();
                bear.setVisible(true);
                break;
            case 5:
                aviTracker[5] = 0;
                aviTracker[6] = 1;
                setAviVisibleFalse();
                seal.setVisible(true);
                break;
            case 6:
                aviTracker[6] = 0;
                aviTracker[7] = 1;
                setAviVisibleFalse();
                walrus.setVisible(true);
                break;
            case 7:
                aviTracker[7] = 0;
                aviTracker[8] = 1;
                setAviVisibleFalse();
                whale.setVisible(true);
                break;
            case 8:
                aviTracker[8] = 0;
                aviTracker[0] = 1;
                setAviVisibleFalse();
                moose.setVisible(true);
                break;
        }
    }

    public Boolean queryUsernameAndPassword(String username, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://snowitall-db.cyvluizuepzk.us-east-1.rds.amazonaws.com:3306/SnowItAll?user=admin&password=password&useSSL=false");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Username, Password FROM User");

            while (rs.next()) {
                String dbUsername = rs.getString("Username");
                String dbPassword = rs.getString("Password");

                if (username.equals(dbUsername) && password.equals(dbPassword)) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean queryUsername(String username) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://snowitall-db.cyvluizuepzk.us-east-1.rds.amazonaws.com:3306/SnowItAll?user=admin&password=password&useSSL=false");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Username FROM User");

            while (rs.next()) {
                String dbUsername = rs.getString("Username");

                if (username == dbUsername) {
                    return true;
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public void pushNewCredentials(String username, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://snowitall-db.cyvluizuepzk.us-east-1.rds.amazonaws.com:3306/SnowItAll?user=admin&password=password&useSSL=false");
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO User (UserID, Username, Password, GradeLevel, Progress, SnowflakeCounter, Avatar, OwnedRewards) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"); // replace with your SQL query

            stmt.setInt(1, setUserID()); //calls setUserID
            stmt.setString(2, username);
            stmt.setString(3, password);
            stmt.setInt(4, 1); //GradeLevel
            stmt.setDouble(5, 0.0); //Progress
            stmt.setInt(6, 0); //SnowflakeCounter
            stmt.setString(7, ""); //Avatar
            stmt.setString(8, "NONE"); //Owned Rewards

            stmt.executeUpdate();

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int setUserID() {
        Random rand = new Random();
        int userID = rand.nextInt(10000);;
        while (queryUserID(userID)) {
            userID = rand.nextInt(10000);
        }
        currentUserID = userID;
        return userID;
    }

    private boolean queryUserID(int userID) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://snowitall-db.cyvluizuepzk.us-east-1.rds.amazonaws.com:3306/SnowItAll?user=admin&password=password&useSSL=false");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT UserID FROM User");

            while (rs.next()) {
                int id = rs.getInt("UserID"); // "id" is the column name for the id field
                if(id == userID) {
                    return true;
                }
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
