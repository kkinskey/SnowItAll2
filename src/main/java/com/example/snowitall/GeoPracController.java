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
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;


public class GeoPracController {

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
    private ImageView randomImageView;
    @FXML
    private Label intLabel;
    private GeoModel model;
    private GiftGlooModel gift;
    @FXML
    private TextField answer;

    private String operatorSymbol;
    @FXML
    private Button xButton;

    private GiftGlooController controller;

    public GeoModel getModel() {
        return model;
    }

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

    public GeoPracController() {
        this.model = new GeoModel();
        this.gift = new GiftGlooModel();
        this.controller = new GiftGlooController();

    }


    // Updates question label text for practice multiple choice questions
    public void updateLabelText(String text) {
        questionText.setText(text);
    }


    public void TrueFalseQuestionGenerator() {
        model.TrueFalseQuestion();

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

        model.MultipleChoiceQuestion();
        String[] array = model.getChoices();

        choiceButtonOne.setText(array[0]);
        choiceButtonTwo.setText(array[1]);
        choiceButtonThree.setText(array[2]);
        choiceButtonFour.setText(array[3]);

    }

//    @FXML
//    public void mcInitialize() {
//        System.out.println("Initialize has been called");
//        radioGroup = new ToggleGroup();
//        if (choiceButtonOne != null) {
//            System.out.println("Choice button 1 ok");
//        }
//        choiceButtonOne.setToggleGroup(radioGroup);
//        choiceButtonTwo.setToggleGroup(radioGroup);
//        choiceButtonThree.setToggleGroup(radioGroup);
//        choiceButtonFour.setToggleGroup(radioGroup);
//
//
//        submitButton.setDisable(true);
//        radioGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
//            if (radioGroup.getSelectedToggle() != null) {
//                System.out.println("Enable submit button");
//                submitButton.setDisable(false);
//            }
//
//        });
//
//    }

//    public void tfInitialize() {
//        System.out.println("initialize 2 has been called");
//        radioGroup2 = new ToggleGroup();
//        choiceButtonFive.setToggleGroup(radioGroup2);
//        choiceButtonSix.setToggleGroup(radioGroup2);
//
//        radioGroup2.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
//            if (radioGroup2.getSelectedToggle() != null) {
//                submitButtonTF.setDisable(false);
//            }
//        });
//    }


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
//        mcInitialize();

        //generates multiple choice question for practice page when practice button is click on operations landing page
        MultipleChoiceQuestionGenerator();


        // Call the setLabelText() method on the controller object
        updateLabelText(model.toStringFIB(model.getOperationSymbol()));



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
//        tfInitialize();

        //generates True False question for practice page when practice button is click on operations landing page
        TrueFalseQuestionGenerator();


        // Call the setLabelText() method on the controller object
        updateLabelText(model.toStringTF(model.getOperationSymbol()));



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


//    public void FillInBlankQuestionGenerator() {

    @FXML
    private StackPane imageContainer;

//    public void displayRandomImage() {
//        // Generate a random index to select an image file
//        Random random = new Random();
//        int randomIndex = random.nextInt(IMAGE_FILES.length);
//
//        // Get the selected image file
//        String imageFileName = IMAGE_FILES[randomIndex];
//        String imagePath = IMAGES_DIRECTORY + File.separator + imageFileName;
//
//        // Load the image and set it in the ImageView
//        Image image = new Image(new File(imagePath).toURI().toString());
//        randomImageView.setImage(image);
//    }
//    }
//private static final String IMAGES_DIRECTORY = "com/example/snowitall/shapes";
//    private static final String[] IMAGE_FILES = {
//            "circle.png",
//            "triangle.png",
//            "square.png",
//            "octagon.png",
//            "nonagon.png",
//            "heptagon.png",
//            "hexagon.png",
//            "pentagon.png"
//            // Add more image filenames as needed
//    };
//
//    public String generateRandomImageUrl() {
//        // Generate a random index to select a random image filename
//        int randomIndex = (int) (Math.random() * IMAGE_FILES.length);
//
//        // Create the complete URL by combining the directory and the random image filename
//        String imageUrl = getClass().getClassLoader().getResource(IMAGES_DIRECTORY + "/" + IMAGE_FILES[randomIndex]).toExternalForm();
//
//        // Return the randomly selected image URL
//        return imageUrl;
//    }

    private static final String IMAGES_DIRECTORY = "src/main/resources/com/example/snowitall";
    private static final String[] IMAGE_FILES = {
            "circle.png",
            "triangle.png",
            "square.png",
            "octagon.png",
            "nonagon.png",
            "heptagon.png",
            "hexagon.png",
            "pentagon.png"
            // Add more image filenames as needed
    };

    public String generateRandomImageUrl() {
        int randomIndex = (int) (Math.random() * IMAGE_FILES.length);
        String imagePath = IMAGES_DIRECTORY + "/" + IMAGE_FILES[randomIndex];

        // Get the URL of the image file
        URL imageUrl = getClass().getResource("src/main/resources/com/example/snowitall/circle.png");
        if (imageUrl == null) {
            throw new IllegalArgumentException("Invalid image file: " + imagePath);
        }

        // Return the URL as a string
        return imageUrl.toExternalForm();
    }

    public void setRandomImage() {
        // Generate a random image URL or path
        String randomImageUrl = generateRandomImageUrl();

        // Set the image source
        Image image = new Image(randomImageUrl);
        randomImageView.setImage(image);
    }

    @FXML
    public void initialize() {
        setRandomImage();
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
//        displayRandomImage();

        // Call the setLabelText() method on the controller object
        updateLabelText(model.toStringFIB(model.getOperationSymbol()));

    }
    @FXML
    public void handleXButton() {
        giftAlert.setVisible(false);
        xButton.setVisible(false);
    }

    public void randomQuestionGenerator() {

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
        controller.updateLabelText(controller.toString());


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

