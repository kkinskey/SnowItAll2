package com.example.snowitall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Random;

public class MasteryControllerOPGrd23 {

    @FXML
    private Label questionText;
    @FXML
    public Button submitButtonFIBM;
    @FXML
    public Button nextQuestionButtonM;

    @FXML
    private ImageView giftAlert;
    @FXML
    private Label intLabel;
    private MasteryTestModelOp model;
    private GiftGlooModel gift;
    @FXML
    private TextField answer;

    private String operatorSymbol;
    @FXML
    private Button xButton;


    private LandingPageController landingPageController;
    public void setMainApp(LandingPageController landingPageController) {
        this.landingPageController = landingPageController;
    }


    public void setText(String text) {
        intLabel.setText(text);
    }

    public Scene getScene() {
        return intLabel.getScene();
    }

    private GiftGlooController controller;

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

    public MasteryControllerOPGrd23() {
        this.model = new MasteryTestModelOp();
        this.gift = new GiftGlooModel();
        this.controller = new GiftGlooController();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MasteryTestOPGrd23.fxml"));
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void updateLabelText(String text) {
        questionText.setText(text);
    }

    public String toStringFIB(String string) {
        String questionText = "What is " + model.getNum1() + string + model.getNum2() + "?";
        return questionText;
    }
    //Method to handle the return button which sends the user to the operationsLandingPage
    @FXML
    private void returntooperationspageButton(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("operationsLandingPage.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Method that handles the next button on the mastery page
    public void FillInBlankQuestionGenerator() throws IOException {
        randomQuestionGenerator();
    }

    public void handleFIBMsubmitButton(){
        System.out.println("This is the correct answer that was generated by the program: " + model.getCorrectAnswer());

        String answerStr = answer.getText().trim();

        System.out.println("This is the answer that the user entered : " + answerStr);


        if (answer != null && answerStr.equals(model.getCorrectAnswer())) {
            submitButtonFIBM.setDisable(true);
            intLabel.setVisible(true);
            nextQuestionButtonM.setVisible(true);
        } else {
            submitButtonFIBM.setDisable(true);
            intLabel.setVisible(true);
            nextQuestionButtonM.setVisible(true);
        }
    }

    @FXML
    public void handleNextFIBMQuestionButton() throws Exception {
        gift.setSnowflakes(model.getCorrectAnswerCount());
        //TODO Print out gift snowflakes and model snowflakes and make sure they the same!
        System.out.println("Gift model Snowflakes count: " + gift.getSnowflakes());
        System.out.println("Master model Snowflakes count: " + model.getCorrectAnswerCount());
        if (model.getCorrectAnswerCount() == 2) {
            giftAlert.setVisible(true);
            xButton.setVisible(true);
            gift.setSnowflakes(2);
        }
        answer.clear();
        submitButtonFIBM.setDisable(false);
        nextQuestionButtonM.setVisible(false);

        FillInBlankQuestionGenerator();

        updateLabelText(toStringFIB(model.getOperationSymbol()));
    }

    @FXML
    public void handleXButton() {
        giftAlert.setVisible(false);
        xButton.setVisible(false);
    }

    public void additionQuestionGenerator() {
        // create a new Random object
        Random random = new Random();

        // generate a random integer between 0 (inclusive) and 10 (exclusive)
        model.setNumber1(random.nextInt(20));
        model.setNumber2(random.nextInt(10));

        model.setAnswer(model.getNumber1() + model.getNumber2());

        model.setCorrectAnswer(Integer.toString(model.getAnswer()));

        model.setNum1(Integer.toString(model.getNumber1()));

        model.setNum2(Integer.toString(model.getNumber2()));
    }

    public void subtractionQuestionGenerator() {
        // create a new Random object
        Random random = new Random();

        // generate a random integer between 0 (inclusive) and 10 (exclusive)
        model.setNumber1(random.nextInt(20));
        model.setNumber2(random.nextInt(10));

        model.setAnswer(model.getNumber1() - model.getNumber2());

        model.setCorrectAnswer(Integer.toString(model.getAnswer()));

        model.setNum1(Integer.toString(model.getNumber1()));

        model.setNum2(Integer.toString(model.getNumber2()));
    }
    public void randomQuestionGenerator() throws IOException {

        Random random = new Random();
        int randomNumber = random.nextInt(4) + 1; // Generates a random number between 1 and 4
        switch (randomNumber) {
            case 1:
                additionQuestionGenerator();
                setOperatorSymbol(" + ");
                model.setOperationSymbol(" + ");
                toStringFIB(model.getOperationSymbol());
                System.out.println("Addition " + model.getOperationSymbol());
                break;
            case 2:
                subtractionQuestionGenerator();
                setOperatorSymbol(" - ");
                model.setOperationSymbol(" - ");
                toStringFIB(model.getOperationSymbol());
                System.out.println("Subtraction " + model.getOperationSymbol());
                break;
            case 3:
                break;
            default:
                System.out.println("default");
                break;

        }
    }


    @FXML
    private void handleGiftGloo (ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GiftGloo.fxml"));
        Parent root = loader.load();
        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Get the controller object
        GiftGlooController controller = loader.getController();
        ;
        // Call the setLabelText() method on the controller object
        controller.updateLabelText(controller.toString());
        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setTitle("Snow It All");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void returntolandingpageButton (ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("landing-page.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}