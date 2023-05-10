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

import java.sql.*;

public class GiftGlooController {
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

    public void updateLabelText() {
       int rewardCount =  getRewardCountFromDatabase();
       System.out.println("Reward Count = " + getRewardCountFromDatabase());
        String strNumber = Integer.toString(rewardCount);
        snowFlakeCount.setText("Current number of rewards: " + strNumber);
    }

    public int getRewardCountFromDatabase() {
        int rewardCount = 0;
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://snowitall-db.cyvluizuepzk.us-east-1.rds.amazonaws.com:3306/SnowItAll?user=admin&password=password&useSSL=false"))
        {
            String sql = "SELECT PracticeCheck FROM Geometry";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                rewardCount = resultSet.getInt("PracticeCheck");
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving reward count from the database: " + e.getMessage());
        }

        return rewardCount;
    }


//    // method that generates a string to display the total number of snow flakes the user has earned
//    public String toString(){
//
////        String count = snowFlakeCount();
////        if (gift.getSnowFlakeString() == null) {
////            String questionText = "You have 0 Snow Flakes";
////            return questionText;
////        } else {
//
//        int snowflakes = controller.getGift().getSnowflakes();
//        snowFlakeCount = controller.getIntLabel();
//
//
//        System.out.println("gift gloo controller Snowflakes:" + snowflakes );
//
//        return "You have " + snowflakes + "" + " Snow Flakes";
//
//    }

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
