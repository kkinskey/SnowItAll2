package com.example.snowitall;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Login extends Application{
    private LoginController loginController;
    private PracticeController practiceController;
    private LandingPageController landingPageController;
    private GiftGlooController giftGlooController;
    private OperationsController operationsController; // NOTE: 4/20 I never pass this anwhere maybe delete it saving it for later usage potentially.
    private ControllerManager controllerManager;
    public Login() {
        this.loginController = new LoginController();
        this.practiceController = new PracticeController();
        this.landingPageController = new LandingPageController();
        this.giftGlooController = new GiftGlooController();
        this.operationsController = new OperationsController();
        this.controllerManager = new ControllerManager();
    }

    public LoginController getLoginController() {
        return loginController;
    }

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }

    public PracticeController getPracticeController() {
        return practiceController;
    }

    public void setPracticeController(PracticeController practiceController) {
        this.practiceController = practiceController;
    }

    public LandingPageController getLandingPageController() {
        return landingPageController;
    }

    public void setLandingPageController(LandingPageController landingPageController) {
        this.landingPageController = landingPageController;
    }

    public GiftGlooController getGiftGlooController() {
        return giftGlooController;
    }

    public void setGiftGlooController(GiftGlooController giftGlooController) {
        this.giftGlooController = giftGlooController;
    }

    public OperationsController getOperationsController() {
        return operationsController;
    }

    public void setOperationsController(OperationsController operationsController) {
        this.operationsController = operationsController;
    }

    public ControllerManager getControllerManager() {
        return controllerManager;
    }

    public void setControllerManager(ControllerManager controllerManager) {
        this.controllerManager = controllerManager;
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Login login = new Login();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("landing-page.fxml"));
        Parent root = loader.load();

        // Set up the primary stage
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();


        // Show the primary stage
        primaryStage.show();
    }

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


}

