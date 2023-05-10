package com.example.snowitall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class GeoPracController implements SceneController{
    @FXML
    private ImageView square;
    @FXML
    private ImageView triangle;
    @FXML
    private ImageView heptagon;
    @FXML
    private ImageView hexagon;
    @FXML
    private ImageView nonagon;
    @FXML
    private ImageView pentagon;
    @FXML
    private ImageView octagon;
    @FXML
    private ImageView circle;


    @FXML
    private Label questionText;
    @FXML
    private RadioButton choiceButtonOne;
    @FXML
    private RadioButton choiceButtonTwo;
    @FXML
    private RadioButton choiceButtonThree;
    @FXML
    private RadioButton choiceButtonFour;

    @FXML
    private RadioButton choiceButtonFive;

    @FXML
    private RadioButton choiceButtonSix;
    @FXML
    public Button submitButton;
    @FXML
    public Button submitButtonTF;

    @FXML
    public Button submitButtonFIB;
    @FXML
    public Button nextQuestionButton;
    @FXML
    public Button returnButton;
    @FXML
    public Button nextButton;
    @FXML
    public ToggleGroup radioGroup;

    @FXML
    public ToggleGroup radioGroup2;

    @FXML
    private ImageView correctAnswerImage;

    @FXML
    private ImageView incorrectAnswerImage1;

    @FXML
    private ImageView giftAlert;
    @FXML
    private Label intLabel;
    private final GeoModel model;
    private GiftGlooModel gift;
    @FXML
    private TextField answer;

    private String operatorSymbol;
    @FXML
    private Button xButton;

    private LandingPageController landingPageController;
    private Scene firstScene;

    public void setMainApp(LandingPageController landingPageController) {
        this.landingPageController = landingPageController;
    }

    public void setFirstScene(Scene firstScene) {
        this.firstScene = firstScene;
    }

    @Override
    public void setText(String text) {
        intLabel.setText(text);
    }
    @Override
    public Scene getScene() {
        return intLabel.getScene();
    }

    private final GiftGlooController controller;

    public GiftGlooModel getGift() {
        return gift;
    }

    public void setGift(GiftGlooModel gift) {
        this.gift = gift;
    }

    public Label getIntLabel() {
        return intLabel;
    }

    public void setIntLabel(Label intLabel) {
        this.intLabel = intLabel;
    }
    public void passLabel() {
        controller.setLabel(intLabel);
    }

    public String getOperatorSymbol() {
        return operatorSymbol;
    }

    public void setOperatorSymbol(String operatorSymbol) {
        this.operatorSymbol = operatorSymbol;
    }

    public GeoPracController() {
        this.model = new GeoModel();
        this.gift = new GiftGlooModel();
        this.controller = new GiftGlooController();

    }

    //    private PracticeModel model; //= new PracticeModel();

    // Updates question label text for practice multiple choice questions
    public void updateLabelText(String text) {
        questionText.setText(text);
    }


    // method that generates a string to display the mulitple choice question we are asking
    public String toString(){

        String questionText = "What is " + model.getNum1() + " + " + model.getNum2() + "?";
        return questionText;
    }

    public String toStringTF(){

        String questionText = "Is " + model.getNum1() + " + " + model.getNum2() + " = " + model.getCorrectAnswer() + "?";
        return questionText;
    }

    public String toStringFIB(String string) {
        String questionText = "What is " + model.getNum1() + string + model.getNum2() + "?";
        return questionText;
    }

//    Handle Button Methods

    //Method to handle the return button which sends the user to the operationsLandingPage
    @FXML
    private void returnToGeometryPageButton(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("geometryLandingPage.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void returntoQuestionType(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("gyQuestionType.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void handleNextButtonToTF(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("TF.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void handleNextButtonToFIB(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("FIB.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void randomImageViewGenerator() {
        // Make all ImageView instances invisible initially
        circle.setVisible(false);
        heptagon.setVisible(false);
        hexagon.setVisible(false);
        nonagon.setVisible(false);
        octagon.setVisible(false);
        pentagon.setVisible(false);
        square.setVisible(false);
        triangle.setVisible(false);

        Random random = new Random();
        int randomNumber = random.nextInt(8) + 1; // Generates a random number between 1 and 8

        switch (randomNumber) {
            case 1:
                circle.setVisible(true);
                System.out.println("circle is the chosen shape.");
                break;
            case 2:
                heptagon.setVisible(true);
                System.out.println("heptagon is the chosen shape.");
                break;
            case 3:
                hexagon.setVisible(true);
                System.out.println("hexagon is the chosen shape.");
                break;
            case 4:
                nonagon.setVisible(true);
                System.out.println("nonagon is the chosen shape.");
                break;
            case 5:
                octagon.setVisible(true);
                System.out.println("octagon is the chosen shape.");
                break;
            case 6:
                pentagon.setVisible(true);
                System.out.println("pentagon is the chosen shape.");
                break;
            case 7:
                square.setVisible(true);
                System.out.println("square is the chosen shape.");
                break;
            case 8:
                triangle.setVisible(true);
                System.out.println("triangle is the chosen shape.");
                break;
            default:
                break;
        }
    }

    public void FillInBlankQuestionGenerator() {
        randomImageViewGenerator();
    }

    public void handleFIBsubmitButton() {
        System.out.println("This is the correct answer that was generated by the program: " + model.getCorrectAnswer());

        String answerStr = answer.getText().trim();

        System.out.println("This is the answer that the user entered : " + answerStr);

        if (answer!= null && answerStr.equals(model.getCorrectAnswer())) {
            correctAnswerImage.setVisible(true);
            System.out.println("Correct Answer");
            int count = model.getCorrectAnswerCount();
            count++;
            model.setCorrectAnswerCount(count);
            String countString = Integer.toString(model.getCorrectAnswerCount());
            intLabel.setText("Correct Answer Count: " + countString);
            submitButtonFIB.setDisable(true);
            intLabel.setVisible(true);
            nextQuestionButton.setVisible(true);
        } else {
            incorrectAnswerImage1.setVisible(true);
            System.out.println("Incorrect Answer");
            submitButtonFIB.setDisable(true);
            intLabel.setVisible(true);
            nextQuestionButton.setVisible(true);
        }

    }

    @FXML
    public void handleNextFIBQuestionButton() throws Exception{
        gift.setSnowflakes(model.getCorrectAnswerCount());
        //TODO Print out gift snowflakes and model snowflakes and make sure they the same!
        System.out.println("Gift model Snowflakes count: " + gift.getSnowflakes());
        System.out.println("Practice model Snowflakes count: " + model.getCorrectAnswerCount());
        if (model.getCorrectAnswerCount() == 2) {
            giftAlert.setVisible(true);
            xButton.setVisible(true);
            gift.setSnowflakes(2);
//            System.out.println("2 questions answered correctly...  " + controller.getGlooModel().getSnowflakes());
//            System.out.println("gift object in handleNextFIBQuestionButton(): " + controller.getGlooModel().toString());
        }

        answer.clear();
        submitButtonFIB.setDisable(false);
        nextQuestionButton.setVisible(false);
        correctAnswerImage.setVisible(false);
        incorrectAnswerImage1.setVisible(false);

        //generates a new fill in the blank question when next question button is clicked
        FillInBlankQuestionGenerator();

        // Call the setLabelText() method on the controller object
        updateLabelText(toStringFIB(model.getOperationSymbol()));

    }
    @FXML
    public void handleXButton() {
        giftAlert.setVisible(false);
        xButton.setVisible(false);
    }

    @FXML
    private void handleGiftGloo(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GiftGloo.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Get the controller object
        GiftGlooController controller = loader.getController();

        // Call the setLabelText() method on the controller object
        controller.updateLabelText(controller.toString());


        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setTitle("Snow It All");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void returntolandingpageButton(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ret-page.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
