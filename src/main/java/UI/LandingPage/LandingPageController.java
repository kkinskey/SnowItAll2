package UI.LandingPage;

import Backend.Grade.Grade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.InputStream;

public class LandingPageController {
//    private Stage primaryStage;
//    public void setPrimaryStage(Stage primaryStage) {
//        this.primaryStage = primaryStage;
//    }
//
    @FXML
    private void handleOperations(ActionEvent event) throws Exception {

        try {
            InputStream stream = getClass().getResourceAsStream("operationsLandingPage.fxml");
            // Load the FXML file for the new window
            FXMLLoader loader = new FXMLLoader(getClass().getResource("operationsLandingPage.fxml"));
            Parent root = loader.load();

            // Get the current stage from the button's scene
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Set the new scene on the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(getClass().getResource("operationsLandingPage.fxml").getPath());
        InputStream stream = getClass().getResourceAsStream("operationsLandingPage.fxml");
        System.out.println(stream);
    }



//    @FXML
//            private void handBackButton(ActionEvent event) throws Exception{
//
//
//
////                Button backButton = new Button("Back");
////                backButton.setOnAction(e -> {
////                    Scene previousScene = getPreviousScene(); // Implement this method to get the previous scene
////                    if (previousScene != null) {
////                        Stage stage = (Stage) backButton.getScene().getWindow();
////                        stage.setScene(previousScene);
////                    }
////                });
//    }


    //Purpose: Controller in the MVC structure for the landingpage

//        @FXML
//        private Button operations;
//
        @FXML
        private Button operationsButton;
//

//
//        @FXML
//        private Label island1Name;

//        @FXML
//        private Label island2Name;
//
//        @FXML
//        private Label island3Name;
//
//        @FXML
//        private ImageView kFlag;
//
//        @FXML
//        private ImageView fsFlag;
//
//        @FXML
//        private ImageView tfFlag;
//

//

        private LandingPage model = new LandingPage();


        public LandingPageController() {
            super();
        }

    @FXML
    void operationsButtonPressed(ActionEvent event){
        /*Call goToStandard() from LandingPage;
        When Operations button is pressed, the software takes you back to the Standard*/
        model.goToStandard(event, operationsButton);
//                ,"/UI/Standard/Operations/operationsLandingPage.fxml"
//        );

        //mediaPlayer.stop();
    }


}
