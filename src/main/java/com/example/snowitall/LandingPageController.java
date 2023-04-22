package com.example.snowitall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LandingPageController {


    public LandingPageController(Login model) {

    }

    public void labelSetter() {
        model.getGiftGlooController().setLabel(model.getPracticeController().getIntLabel());
    }
    @FXML
    private void handleOperations(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("GradePrompt.fxml"));

            // Get the current stage from the button's scene
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

            // Set the new scene on the stage
            Scene scene = new Scene(root);
            stage.setTitle("Snow It All");
            stage.setScene(scene);
            stage.show();
    }

    @FXML
    private void handleGrade(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("operationsLandingPage.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setTitle("Snow It All");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleGiftGloo(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GiftGloo.fxml"));
//        FXMLLoader l = new FXMLLoader(getClass().getResource("FIB.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Get the controller object
//        GiftGlooController giftGlooController = loader.getController();
//        PracticeController practiceController = l.getController();
//        GiftGlooController giftGlooController = l.getController(); //NOTE: You cannot have two loaders apparently!

//        System.out.println("SnowFlakes" + );
        // Call the setLabelText() method on the controller object
//        giftGlooController.setLabel(practiceController.getIntLabel());
//           String text = giftGlooController.practiceController.getGift().getSnowflakes() + "";
//           System.out.println(text);
//           giftGlooController.updateLabelText(text);
        labelSetter();


        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setTitle("Snow It All");
        stage.setScene(scene);
        stage.show();
    }

}
