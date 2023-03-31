package UI.Standard.Operations;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OperationsController {
        private Stage primaryStage;
        public void setPrimaryStage(Stage primaryStage) {
            this.primaryStage = primaryStage;
        }

    @FXML
    private void returnButton(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("landing-page.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void handlePracticeButton(ActionEvent event) throws Exception{
        // Load the FXML file for the new window
        FXMLLoader loader = new FXMLLoader(getClass().getResource("practice.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);

    }

//    private MultipleChoiceQuestion model = MultipleChoiceQuestion.generateMCQ();
//
//    private PracticeQuestionView view;
//
//
//
//    @FXML
//    private void handleGoToNewPageButtonAction(ActionEvent event) throws IOException {
//        // Create a new instance of the NewPageController class.
//        PracticeQuestionController newController = new PracticeQuestionController(model, view);
//
//        // Create a new stage and set its scene to the new page.
//        Stage newStage = new Stage();
//        Scene newScene = new Scene(newController);
//        newStage.setScene(newScene);
//
//        // Show the new stage.
//        newStage.show();
//    }

    }
