package com.example.snowitall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class GiftGlooController implements SceneController{
    @FXML
    private ImageView snowFlake;

    @FXML
    private Label snowFlakeCount;

    private PracticeModel model;

    private PracticeController controller; //= new PracticeController();

    private GiftGlooModel glooModel;

    private Login loginModel;

    public GiftGlooController() {
        this.model = new PracticeModel();
        this.snowFlakeCount = new Label();
//        this.controller = new PracticeController();

    }





    private LandingPageController landingPageController;

    private PracticeController practiceController;

    public void setMainApp(LandingPageController landingPageController) {
        this.landingPageController = landingPageController;
    }

//    public void setLoginApp(Login loginApp) {this.loginApp = loginApp;}
//    public void setLandingPageScene(LandingPageController landingPageController) {this.landingPageScene = landingPageScene; }

    public void setSecondScene(PracticeController practiceController) {
        this.practiceController = practiceController;
    }


    @Override
    public void setText(String text) {
        // This method will be empty in the first controller, since we won't be setting text here
    }

    @Override
    public Scene getScene() {
        return null;
    }

//    @Override
//    public Scene getScene() {
//        return textField.getScene();
//    }






//    public void setMainApp(LandingPageController model) {
//        this.loginModel = model;
//    }

    public GiftGlooModel getGlooModel() {
        return glooModel;
    }

    public void setGlooModel(GiftGlooModel glooModel) {
        this.glooModel = glooModel;
    }


    public String snowFlakeCount() {
        System.out.println("This inside of gift controller: " + glooModel.getSnowflakes());

        System.out.println("gift object in snowFlakeCount(): " + glooModel.toString());

        return glooModel.getSnowFlakeString();

    }

    public void updateLabelText(String text) {
        snowFlakeCount.setText(text);
    }


    // method that generates a string to display the total number of snow flakes the user has earned
    public String toString(){

//        String count = snowFlakeCount();
//        if (gift.getSnowFlakeString() == null) {
//            String questionText = "You have 0 Snow Flakes";
//            return questionText;
//        } else {

       int snowflakes = controller.getGift().getSnowflakes();
      snowFlakeCount = controller.getIntLabel();


        System.out.println("gift gloo controller Snowflakes:" + snowflakes );

        return "You have " + snowflakes + "" + " Snow Flakes";

    }

    public void setLabel(Label label) {
        snowFlakeCount = label;
    }

    @FXML
    private void returntolandingpageButton(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("landing-page.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
