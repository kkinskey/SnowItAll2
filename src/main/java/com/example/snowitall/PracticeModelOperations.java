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

public class PracticeModelOperations {
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
    private PracticeModel model;
    private GiftGlooModel gift;
    @FXML
    private TextField answer;

    private String operatorSymbol;
    @FXML
    private Button xButton;


    private LandingPageController landingPageController;
    private Scene firstScene;


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


    public void TrueFalseQuestionGenerator() {
        // create a new Random object
        Random random = new Random();

        // generate a random integer between 0 (inclusive) and 10 (exclusive)
        model.setNumber1(random.nextInt(100));
        model.setNumber2(random.nextInt(10));

        model.setAnswer(model.getNumber1() + model.getNumber2());

        model.setCorrectAnswer(Integer.toString(model.getAnswer()));

        model.setNum1(Integer.toString(model.getNumber1()));

        model.setNum2(Integer.toString(model.getNumber2()));

        //generates random number between 0 and 1
        model.setCorrectAnswerIndex(random.nextInt(2));

        String[] array1 = model.getTfAnswers();

        array1[model.getCorrectAnswerIndex()] = model.getCorrectAnswer();

        model.setTfAnswers(array1);

        String[] array = model.getTfAnswers();


        for (int i = 0; i < array.length; i++) {
            // if the index is null or its value is already in the array, replace with a new random integer value
            while (array[i] == null || containsDuplicate(array, i)) {
                int choice = random.nextInt(120);
                array[i] = Integer.toString(choice);
            }
        }

        model.setTfAnswers(array);

        if (model.getNumber1() + model.getNumber2() == model.getAnswer()) {
            model.setCorrectAnswerTF(true);
        } else{
            model.setCorrectAnswerTF(false);
        }

        choiceButtonFive.setText("True");
        choiceButtonSix.setText("False");

    }

    public void handleRadioSelectionTF() {
        RadioButton selectedRadioButton = (RadioButton) radioGroup2.getSelectedToggle();

        boolean b = model.getCorrectAnswerTF();
        String strb = String.valueOf(b);
        String capitalizedStr = Character.toUpperCase(strb.charAt(0)) + strb.substring(1);
        System.out.println(capitalizedStr);
        System.out.println("selected button text" + selectedRadioButton.getText());


        if (selectedRadioButton != null && selectedRadioButton.getText().equals(capitalizedStr)) {
            // Show the correct answer image
//            correctAnswerImage.setImage(new Image("Screen Shot 2023-04-13 at 11.39.46 PM.png"));
            correctAnswerImage.setVisible(true);
            System.out.println("Correct Answer");
            int count = model.getCorrectAnswerCount();
            count++;
            model.setCorrectAnswerCount(count);
            String countString = Integer.toString(model.getCorrectAnswerCount());
            intLabel.setText("Correct Answer Count: " + countString);
            choiceButtonFive.setDisable(true);
            choiceButtonSix.setDisable(true);
            submitButtonTF.setDisable(true);
            intLabel.setVisible(true);
            nextQuestionButton.setVisible(true);




        }
        else {
            incorrectAnswerImage1.setVisible(true);
            System.out.println("Incorrect Answer");
            choiceButtonFive.setDisable(true);
            choiceButtonSix.setDisable(true);
            submitButtonTF.setDisable(true);
            intLabel.setVisible(true);
            nextQuestionButton.setVisible(true);

        }

    }

    //generates random multiple choice questions for adding two numbers
    public void MultipleChoiceQuestionGenerator() {

        // create a new Random object
        Random random = new Random();

        // generate a random integer between 0 (inclusive) and 10 (exclusive)
        model.setNumber1(random.nextInt(100));
        model.setNumber2(random.nextInt(10));

        model.setAnswer(model.getNumber1() + model.getNumber2());

        model.setCorrectAnswer(Integer.toString(model.getAnswer()));

        model.setNum1(Integer.toString(model.getNumber1()));

        model.setNum2(Integer.toString(model.getNumber2()));

        //generates random number between 0 and 3
        model.setCorrectAnswerIndex(random.nextInt(4));

        String[] array1 = model.getChoices();

        array1[model.getCorrectAnswerIndex()] = model.getCorrectAnswer();

        model.setChoices(array1);

        String[] array = model.getChoices();

        for (int i = 0; i < array.length; i++) {
            // if the index is null or its value is already in the array, replace with a new random integer value
            while (array[i] == null || containsDuplicate(array, i)) {
                int choice = random.nextInt(120);
                array[i] = Integer.toString(choice);
            }
        }

        model.setChoices(array);

        choiceButtonOne.setText(array[0]);
        choiceButtonTwo.setText(array[1]);
        choiceButtonThree.setText(array[2]);
        choiceButtonFour.setText(array[3]);

    }

    // method to check if the array contains a duplicate of the element at the given index
    public static boolean containsDuplicate(Object[] array, int index) {
        for (int i = 0; i < array.length; i++) {
            if (i != index && array[i] != null && array[i].equals(array[index])) {
                return true;
            }
        }
        return false;
    }

    @FXML
    public void mcInitialize() {
        System.out.println("Initialize has been called");
        radioGroup = new ToggleGroup();
        if (choiceButtonOne != null) {
            System.out.println("Choice button 1 ok");
        }
        choiceButtonOne.setToggleGroup(radioGroup);
        choiceButtonTwo.setToggleGroup(radioGroup);
        choiceButtonThree.setToggleGroup(radioGroup);
        choiceButtonFour.setToggleGroup(radioGroup);


        submitButton.setDisable(true);
        radioGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (radioGroup.getSelectedToggle() != null) {
                System.out.println("Enable submit button");
                submitButton.setDisable(false);
            }
//            radioGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
//
//                submitButton.setDisable(false); // enable the button when a toggle is selected
//            });
        });

    }

    public void tfInitialize() {
        System.out.println("initialize 2 has been called");
        radioGroup2 = new ToggleGroup();
        choiceButtonFive.setToggleGroup(radioGroup2);
        choiceButtonSix.setToggleGroup(radioGroup2);

        radioGroup2.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (radioGroup2.getSelectedToggle() != null) {
                submitButtonTF.setDisable(false);
            }
        });
    }


    //after radio button is selected and submit button is pressed this method will display an image to tell the user if their answer is correct or not
    public void handleRadioSelection() {
        RadioButton selectedRadioButton = (RadioButton) radioGroup.getSelectedToggle();


        radioGroup = new ToggleGroup();
        choiceButtonOne.setToggleGroup(radioGroup);
        choiceButtonTwo.setToggleGroup(radioGroup);
        choiceButtonThree.setToggleGroup(radioGroup);
        choiceButtonFour.setToggleGroup(radioGroup);


        System.out.println("In handle radio selection");
        submitButton.setDisable(true); // disable the button by default




        if (selectedRadioButton != null && selectedRadioButton.getText().equals(model.getCorrectAnswer())) {
            // Show the correct answer image
//            correctAnswerImage.setImage(new Image("Screen Shot 2023-04-13 at 11.39.46 PM.png"));
            correctAnswerImage.setVisible(true);
            System.out.println("Correct Answer");
            int count = model.getCorrectAnswerCount();
            count++;
            model.setCorrectAnswerCount(count);
            String countString = Integer.toString(model.getCorrectAnswerCount());
            intLabel.setText("Correct Answer Count: " + countString);
            choiceButtonOne.setDisable(true);
            choiceButtonTwo.setDisable(true);
            choiceButtonThree.setDisable(true);
            choiceButtonFour.setDisable(true);
//            submitButton.setDisable(true);
            intLabel.setVisible(true);
            nextQuestionButton.setVisible(true);




        }
        else {
            incorrectAnswerImage1.setVisible(true);
            System.out.println("Incorrect Answer");
            choiceButtonOne.setDisable(true);
            choiceButtonTwo.setDisable(true);
            choiceButtonThree.setDisable(true);
            choiceButtonFour.setDisable(true);
//            submitButton.setDisable(true);
            intLabel.setVisible(true);
            nextQuestionButton.setVisible(true);


        }

    }
    @FXML
    public void handleNextQuestionButton() throws Exception{

        nextQuestionButton.setVisible(false);
        correctAnswerImage.setVisible(false);
        incorrectAnswerImage1.setVisible(false);
        radioGroup.selectToggle(null);
        choiceButtonOne.setDisable(false);
        choiceButtonTwo.setDisable(false);
        choiceButtonThree.setDisable(false);
        choiceButtonFour.setDisable(false);
//        submitButton.setDisable(true);



        //sets submit button disable attribute to false if radio button is selected
        mcInitialize();

        //generates multiple choice question for practice page when practice button is click on operations landing page
        MultipleChoiceQuestionGenerator();


        // Call the setLabelText() method on the controller object
        updateLabelText(toString());



    }

    @FXML
    public void handleNextQuestionButtonTF() throws Exception{

        nextQuestionButton.setVisible(false);
        correctAnswerImage.setVisible(false);
        incorrectAnswerImage1.setVisible(false);
        radioGroup2.selectToggle(null);
        choiceButtonFive.setDisable(false);
        choiceButtonSix.setDisable(false);
        submitButtonTF.setDisable(true);



        //sets submit button disable attribute to false if radio button is selected
        tfInitialize();

        //generates True False question for practice page when practice button is click on operations landing page
        TrueFalseQuestionGenerator();


        // Call the setLabelText() method on the controller object
        updateLabelText(toStringTF());



    }

//    Handle Button Methods

    //Method to handle the return button which sends the user to the operationsLandingPage
    @FXML
    private void returntooperationspageButton(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("operationsLandingPage.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void returntoQuestionType(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("QuestionType.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    //Method that handles the next button on the mastery page
    @FXML
    private void handleNextButtonToMasteryTest(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mastery.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    public void FillInBlankQuestionGenerator() {
        randomQuestionGenerator();

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
    public void additionQuestionGenerator()
    {


        // create a new Random object
        Random random = new Random();

        // generate a random integer between 0 (inclusive) and 10 (exclusive)
        model.setNumber1(random.nextInt(100));
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
        model.setNumber1(random.nextInt(100));
        model.setNumber2(random.nextInt(10));

        model.setAnswer(model.getNumber1() - model.getNumber2());

        model.setCorrectAnswer(Integer.toString(model.getAnswer()));


        model.setNum1(Integer.toString(model.getNumber1()));

        model.setNum2(Integer.toString(model.getNumber2()));

    }

    public void multiplicationQuestionGenerator() {


        // create a new Random object
        Random random = new Random();

        // generate a random integer between 0 (inclusive) and 10 (exclusive)
        model.setNumber1(random.nextInt(100));
        model.setNumber2(random.nextInt(10));

        model.setAnswer(model.getNumber1() * model.getNumber2());

        model.setCorrectAnswer(Integer.toString(model.getAnswer()));


        model.setNum1(Integer.toString(model.getNumber1()));

        model.setNum2(Integer.toString(model.getNumber2()));

    }

    public void divisionQuestionGenerator() {


//        // create a new Random object
//        Random random = new Random();
//
//        // generate a random integer between that  is always between 10 and 100 (inclusive).
//        model.setNumber1(random.nextInt(91) + 10);
//        // 1 to 10 (inclusive)
//        model.setNumber2(random.nextInt(10) + 1);
//
//        model.setAnswer(model.getNumber1() / model.getNumber2());

        Random random = new Random();
        int number1 = random.nextInt(91) + 10;
        int number2 = random.nextInt(9) + 2;
        while (number1 % number2 != 0) {
            number1 = random.nextInt(91) + 10;
            number2 = random.nextInt(9) + 2;
        }
        model.setNumber1(number1);
        model.setNumber2(number2);
        model.setAnswer(number1 / number2);

        model.setCorrectAnswer(Integer.toString(model.getAnswer()));

        model.setNum1(Integer.toString(model.getNumber1()));

        model.setNum2(Integer.toString(model.getNumber2()));

    }



    public void randomQuestionGenerator() {
        Random random = new Random();
        int randomNumber = random.nextInt(4) + 1; // Generates a random number between 1 and 4
        switch (randomNumber)
        {
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
                multiplicationQuestionGenerator();
                setOperatorSymbol(" x ");
                model.setOperationSymbol(" x ");
                toStringFIB(model.getOperationSymbol());
                System.out.println("Multiplication " + model.getOperationSymbol());
                break;
            case 4:
                divisionQuestionGenerator();
                setOperatorSymbol(" / ");
                model.setOperationSymbol(" / ");
                toStringFIB(model.getOperationSymbol());
                System.out.println("Division " + model.getOperationSymbol());
                break;
            default:
                System.out.println("default");
                break;
        }
    }

    @FXML
    private void handleGiftGloo(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GiftGloo.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Get the controller object
        GiftGlooController controller = loader.getController();;

        // Call the setLabelText() method on the controller object
//        controller.updateLabelText(controller.toString());


        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setTitle("Snow It All");
        stage.setScene(scene);
        stage.show();
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
