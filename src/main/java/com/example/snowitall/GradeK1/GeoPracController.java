package com.example.snowitall.GradeK1;

import com.example.snowitall.*;
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
import java.sql.*;
import java.util.Random;

public class GeoPracController{
    int reward;


    @FXML
    private ImageView square, triangle, heptagon, hexagon, nonagon, pentagon, octagon, circle;
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

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public void setFirstScene(Scene firstScene) {
        this.firstScene = firstScene;
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

//    public String toStringFIB(String string) {
//        String questionText = "What is " + model.getNum1() + string + model.getNum2() + "?";
//        return questionText;
//    }

    public static class Question {
        private String questionText;
        private String imagePath;

        public Question(String questionText, String imagePath) {
            this.questionText = questionText;
            this.imagePath = imagePath;
        }

        public String getQuestionText() {
            return questionText;
        }

        public String getImagePath() {
            return imagePath;
        }
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
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/gyQuestionType.fxml"));

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
        Parent root = FXMLLoader.load(getClass().getResource("opGrade4FIB.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    int num = 0;
    public void handleFIBsubmitButton() {
        System.out.println("This is the correct answer that was generated by the program: " + model.getCorrectAnswer());

        String answerStr = answer.getText().trim();

        System.out.println("This is the answer that the user entered : " + answerStr);

        answerCheck();


        if (answer!= null && answerStr.equals(model.getCorrectAnswer())) {
            setShapeVisibility();
            correctAnswerImage.setVisible(true);
            System.out.println("Correct Answer");
            int count = model.getCorrectAnswerCount();
            count++;
            model.setCorrectAnswerCount(count);

            if(count % 2 == 0){

                num++;
                setReward(num);
            }
            String countString = Integer.toString(model.getCorrectAnswerCount());
            intLabel.setText("Correct Answer Count: " + countString);
            submitButtonFIB.setDisable(true);
            intLabel.setVisible(true);
            nextQuestionButton.setVisible(true);
        } else {
            setShapeVisibility();
            incorrectAnswerImage1.setVisible(true);
            System.out.println("Incorrect Answer");
            submitButtonFIB.setDisable(true);
            intLabel.setVisible(true);
            nextQuestionButton.setVisible(true);
        }

    }

    LoginController obj = new LoginController();

    public void updateRewardCount(int rewardCount) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://snowitall-db.cyvluizuepzk.us-east-1.rds.amazonaws.com:3306/SnowItAll?user=admin&password=password&useSSL=false"))
        {
            String sql = "UPDATE User SET SnowflakeCounter = ? WHERE UserId = ?";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, rewardCount);  // Assuming the rewardCount is within the range of TINYINT
            statement.setInt(2, 8596);

            statement.executeUpdate();
            System.out.println("Reward count updated successfully in the database.");
        } catch (SQLException e) {
            System.out.println("Error updating reward count in the database: " + e.getMessage());
        }
    }



    @FXML
    public void handleNextFIBQuestionButton() throws Exception{
        gift.setSnowflakes(model.getCorrectAnswerCount());
        //TODO Print out gift snowflakes and model snowflakes and make sure they the same!
        System.out.println("Gift model Snowflakes count: " + gift.getSnowflakes());
        System.out.println("Practice model Snowflakes count: " + model.getCorrectAnswerCount());
        if (model.getCorrectAnswerCount() == 2) {
            setShapeVisibility();

            //insert database reward method here
            updateRewardCount(getReward());

            giftAlert.setVisible(true);
            xButton.setVisible(true);
            gift.setSnowflakes(1);
//            System.out.println("2 questions answered correctly...  " + controller.getGlooModel().getSnowflakes());
//            System.out.println("gift object in handleNextFIBQuestionButton(): " + controller.getGlooModel().toString());
        } else {
            randomShapeGenerator();
        }


        answer.clear();
        submitButtonFIB.setDisable(false);
        nextQuestionButton.setVisible(false);
        correctAnswerImage.setVisible(false);
        incorrectAnswerImage1.setVisible(false);


        //generates a new fill in the blank question when next question button is clicked
        //generateQuestionBasedOnGrade();

        // Call the setLabelText() method on the controller object
        updateLabelText(model.toStringFIB());

//        generateGeometryQuestion();
    }
    @FXML
    public void handleXButton() {
        giftAlert.setVisible(false);
        xButton.setVisible(false);
        randomShapeGenerator();
    }

    @FXML
    private void handleGiftGloo(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/snowitall/GiftGloo.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Get the controller object
        GiftGlooController controller = loader.getController();

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
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/landing-page.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

//    //TODO ADD QUESTION TYPE PARAMETER TO generateGeometryQuestion
//    public void generateGeometryQuestion() {
//        // Set the GeoModel instance for the GEOMETRY standard
//        Standard.GEOMETRY.setModel(model);
//
//        // Generate a random question for the GEOMETRY standard
//        String question = Standard.GEOMETRY.generateRandomFillInTheBlankQuestion(Standard.GEOMETRY);
//
//        // Call the setLabelText() method on the controller object
//        updateLabelText(question);
//
//        // You can add more UI update code here if needed
//    }


    public void randomShapeGenerator() {
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
            case 1 -> {
                circle.setVisible(true);
                System.out.println("circle is the chosen shape.");
            }
            case 2 -> {
                heptagon.setVisible(true);
                System.out.println("heptagon is the chosen shape.");
            }
            case 3 -> {
                hexagon.setVisible(true);
                System.out.println("hexagon is the chosen shape.");
            }
            case 4 -> {
                nonagon.setVisible(true);
                System.out.println("nonagon is the chosen shape.");
            }
            case 5 -> {
                octagon.setVisible(true);
                System.out.println("octagon is the chosen shape.");
            }
            case 6 -> {
                pentagon.setVisible(true);
                System.out.println("pentagon is the chosen shape.");
            }
            case 7 -> {
                square.setVisible(true);
                System.out.println("square is the chosen shape.");
            }
            case 8 -> {
                triangle.setVisible(true);
                System.out.println("triangle is the chosen shape.");
            }
            default -> {
            }
        }
    }

    public void setShapeVisibility() {
        circle.setVisible(false);
        heptagon.setVisible(false);
        hexagon.setVisible(false);
        nonagon.setVisible(false);
        octagon.setVisible(false);
        pentagon.setVisible(false);
        square.setVisible(false);
        triangle.setVisible(false);
    }

    public void answerCheck() {
        if (square.isVisible()) {

            // Perform the desired action
            System.out.println(" Square is currently displayed.");
            model.setCorrectAnswer("4");
        } else if (circle.isVisible()) {

            // Perform the desired action
            System.out.println("circle is currently displayed");
            model.setCorrectAnswer("1");
        } else if (triangle.isVisible()) {

            // Perform the desired action
            System.out.println("triangle is currently displayed");
            model.setCorrectAnswer("3");
        } else if (pentagon.isVisible()) {

            // Perform the desired action
            System.out.println("pentagon is currently displayed");
            model.setCorrectAnswer("5");
        } else if (hexagon.isVisible()) {

            // Perform the desired action
            System.out.println("hexagon is currently displayed");
            model.setCorrectAnswer("6");
        } else if (heptagon.isVisible()) {

            // Perform the desired action
            System.out.println("heptagon is currently displayed");
            model.setCorrectAnswer("7");
        } else if (octagon.isVisible()) {

            // Perform the desired action
            System.out.println("octagon is currently displayed");
            model.setCorrectAnswer("8");
        } else if (nonagon.isVisible()) {

            // Perform the desired action
            System.out.println("nonagon is currently displayed");
            model.setCorrectAnswer("9");
        }else {

            // Perform the desired action
            System.out.println("No ImageView is currently displayed.");
        }
    }
}