//package com.example.snowitall;
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//
//
//public class Login extends Application{
//    private LoginController loginController;
//    private PracticeController practiceController;
//    private LandingPageController landingPageController;
//    private GiftGlooController giftGlooController;
//    private OperationsController operationsController; // NOTE: 4/20 I never pass this anwhere maybe delete it saving it for later usage potentially.
//
//    private Stage primaryStage;
//
//    @Override
//    public void start(Stage primaryStage) throws IOException {
//
//        Login login = new Login();
//
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(getClass().getResource("Login.fxml"));
//        Parent root = loader.load();
//
//        // Set up the primary stage
//        primaryStage.setTitle("Login");
//        primaryStage.setScene(new Scene(root, 400, 300));
//        primaryStage.show();
//
//
//        // Show the primary stage
//        primaryStage.show();
//    }
//
//    public void goToLandingPage(ActionEvent event, Button button) {
//        try {
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("landing-page.fxml"));
//            Parent homePageParent = loader.load();
//            Scene homePageScene = new Scene(homePageParent); //Make scene with that path
//            Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow()); //Assign nodes to the window
//            window.setScene(homePageScene); //Set the scene
//            window.show(); //Make it visible
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
//    /**
//     This method is called by the JavaFX framework when the application is launched.
//     It initializes the controllers and scenes, sets up the necessary references, and displays the first scene.*/
////    public void start(Stage primaryStage) {
////        this.primaryStage = primaryStage;
////
////        try {
//////            LoginController loginController = new LoginController();
//////            Scene firstScene = loadFXML("Login.fxml", loginController);
//////            loginController.setLoginApp(this);
//////
//////            LandingPageController landingPageController = new LandingPageController();
//////            Scene landingPageScene = loadFXML("landing-page.fxml", landingPageController);
//////            landingPageController.setLoginApp(this);
//////            landingPageController.setLoginScene(firstScene);
//////            loginController.setLandingPageScene(landingPageController);
////
//////            Scene operationsScene = loadFXML("opGradePrompt.fxml", landingPageController);
//////            landingPageController.set
////
////            primaryStage.setScene(firstScene);
////            primaryStage.show();
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////    }
////
////    public static void main(String[] args) {
////        launch(args);
////    }
////
////    public Scene loadFXML(String fxml, Object controller) throws Exception {
////        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
////        loader.setController(controller);
////        Parent root = loader.load();
////        return new Scene(root);
////    }
////
////    /** This method sets the scene on the primary stage, which is useful for switching between different scenes*/
////    public void setScene(Scene scene) {
////        primaryStage.setScene(scene);
////    }
//}
//
//

/*package com.example.snowitall;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Login extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Login.fxml")));

        // Set up the primary stage
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root));

        // Get the primary screen bounds
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

        // Set Stage boundaries to visible bounds of the main screen
        primaryStage.setX(primaryScreenBounds.getMinX());
        primaryStage.setY(primaryScreenBounds.getMinY());
        primaryStage.setWidth(primaryScreenBounds.getWidth());
        primaryStage.setHeight(primaryScreenBounds.getHeight());

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
    }*/

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
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Login.fxml")));
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

    public static void main(String[] args) {
        launch(args);
    }
}



    //Login.fxml



