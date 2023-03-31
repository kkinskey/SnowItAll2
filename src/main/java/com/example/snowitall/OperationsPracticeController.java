package com.example.snowitall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class OperationsPracticeController extends Parent
        // implements Initializable
{
//    @FXML
//    private BorderPane root;
//    @FXML
//    private Label questionLabel;
//
//    @FXML
//    private RadioButton option1;
//
//    @FXML
//    private RadioButton option2;
//
//    @FXML
//    private RadioButton option3;
//
//    @FXML
//    private RadioButton option4;
//
//    @FXML
//    private ToggleGroup toggleGroup;
//
//    private MultipleChoiceQuestion question;
//
//    public void setQuestion(MultipleChoiceQuestion question) {
//        this.question = question;
//        questionLabel.setText(question.getQuestionText());
//        option1.setText(question.getOption1());
//        option2.setText(question.getOption2());
//        option3.setText(question.getOption3());
//        option4.setText(question.getOption4());
//    }
//
//    public boolean isCorrectAnswer() {
//        return toggleGroup.getSelectedToggle().getUserData().equals(question.getAnswer());
//    }

//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//
//        // Set the question text in the label
//        questionLabel.setText(question.getQuestionText());
//        option1.setText(question.getOption1());
//        option2.setText(question.getOption2());
//        option3.setText(question.getOption3());
//        option4.setText(question.getOption4());
//        try {
//            root.setCenter(new FXMLLoader().load(getClass().getResource("practice.fxml")));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        root.getCenter().setUserData(question.getQuestionText());
//    }

    @FXML
    private void handleBackButton(ActionEvent event) throws Exception{
        // Load the FXML file for the new window
        FXMLLoader loader = new FXMLLoader(getClass().getResource("operations.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);

    }

    @FXML
    private void handleKinderGarten(ActionEvent event) throws Exception{
        // Load the FXML file for the new window
        FXMLLoader loader = new FXMLLoader(getClass().getResource("operations.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);

    }

//    private MultipleChoiceQuestion model;
//    private PracticeQuestionView view;
//
//    // Constructor
//    public PracticeQuestionController(MultipleChoiceQuestion model, PracticeQuestionView view) {
//        this.model = model;
//        this.view = view;
//    }
//
//    // Check if the selected answer is correct
//    public boolean isAnswerCorrect() {
//        int selectedChoiceIndex = view.getSelectedChoiceIndex();
//        int correctChoiceIndex = model.getCorrectChoiceIndex();
//        return selectedChoiceIndex == correctChoiceIndex;
//    }
}
