package com.example.snowitall.GradeK1;

import com.example.snowitall.GiftGlooController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.ResourceBundle;

public class MeasurementsController implements Initializable
{
    @FXML
    private ImageView redcow, bluecow, yellowcow, four;

    @FXML
    public Button returnButton;
    @FXML
    public Button nextButton;

    @FXML
    public Button nextQuestionButton;

    @FXML
    public Button submitButtonFIB;

    @FXML
    private ImageView correctAnswerImage;
    @FXML
    private ImageView incorrectAnswerImage1;

    @FXML
    private ImageView giftAlert;
    @FXML
    private Label intLabel;
    @FXML
    private WebView videoTutorial1 = new WebView();

    @FXML
    private WebView videoTutorial2 = new WebView();

    @FXML
    private TextField answer;

    private final PracticeModelK1 model;

    @FXML
    private Button xButton;

    public int reward;

    public void setReward(int reward) {
        this.reward = reward;
    }

    // Updates question label text for practice multiple choice questions
    public void updateLabelText(String text) {
        questionText.setText(text);
    }
    @FXML
    private Label questionText;



    public MeasurementsController() {
        this.model = new PracticeModelK1();
    }

    @FXML
    private Label resultLabel;

    //Method to handle the return button which sends the user to the landing page
    @FXML
    private void returnToLandingPageButton(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/landing-page.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    //Method to handle the return button which sends the user to the operationsLandingPage
    @FXML
    private void returnToMeasurementsButton(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/msGradeK1.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    //Method to get the practice fxml file to display when button is clicked on the operations page
    @FXML
    private void handlePracticeButton(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/snowitall/msGradeK1FIB.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();



        System.out.println("handlePracticeButton has been called - GOING TO Measurements FIB PAGE");

        //generates fill in the blank question
        //controller.generateQuestionBasedOnGrade();
        randomQuestionGenerator();

        // Call the setLabelText() method on the controller object
        updateLabelText(toStringFIB());

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public String toStringFIB (){
        String questionText = "How many salamanders tall is the cow's hat?";
        return questionText;
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

    @FXML
    private void returntomsGradeK1(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/msGradeK1.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    //Method to get the Mastery fxml file to display when button is clicked on the operations page
    @FXML
    private void handleMasteryTestButton(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/msMastery.fxml"));

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    //Method to get the video-tutorial fxml file to display when button is clicked on the operations page
    @FXML
    private void handleVideoTutorial(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/snowitall/msVideoTutorial.fxml"));


        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    //method to pass youtube video paths to fxml file webview elements
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Load the YouTube video
        videoTutorial1.getEngine().load("https://www.youtube.com/embed/2wUsdsae0ro");
        videoTutorial2.getEngine().load("https://www.youtube.com/embed/MbtmucV-U2c");

    }


    int num = 0;
    public void handleFIBsubmitButton() {
        System.out.println("This is the correct answer that was generated by the program: " + model.getCorrectAnswer());

        String answerStr = answer.getText().trim();

        System.out.println("This is the answer that the user entered : " + answerStr);

        answerCheck();


        if (answer!= null && answerStr.equals(model.getCorrectAnswer())) {
            setImageVisibility();
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
            setImageVisibility();
            incorrectAnswerImage1.setVisible(true);
            System.out.println("Incorrect Answer");
            submitButtonFIB.setDisable(true);
            intLabel.setVisible(true);
            nextQuestionButton.setVisible(true);
        }

    }


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

        //TODO Print out gift snowflakes and model snowflakes and make sure they the same!
        System.out.println("Practice model Snowflakes count: " + model.getCorrectAnswerCount());
        if (model.getCorrectAnswerCount() == 2) {
            setImageVisibility();

            //insert database reward method here

            giftAlert.setVisible(true);
            xButton.setVisible(true);

        } else {
            randomQuestionGenerator();
        }


        answer.clear();
        submitButtonFIB.setDisable(false);
        nextQuestionButton.setVisible(false);
        correctAnswerImage.setVisible(false);
        incorrectAnswerImage1.setVisible(false);



        // Call the setLabelText() method on the controller object
        updateLabelText(model.toStringFIB());


    }
    @FXML
    public void handleXButton() {
        giftAlert.setVisible(false);
        xButton.setVisible(false);
        randomQuestionGenerator();
    }

    public void randomQuestionGenerator() {
        // Make all ImageView instances invisible initially
        redcow.setVisible(false);
        bluecow.setVisible(false);
        yellowcow.setVisible(false);
        four.setVisible(false);

        Random random = new Random();
        int randomNumber = random.nextInt(4) + 1; // Generates a random number between 1 and 4

        switch (randomNumber) {

            case 1 -> {
                redcow.setVisible(true);
                System.out.println("bells image displayed");
            }
            case 2 -> {
                bluecow.setVisible(true);
                System.out.println("strawberries image displayed");
            }
            case 3 -> {
                yellowcow.setVisible(true);
                System.out.println("bowlingpins image displayed");
            }
            case 4 -> {
                four.setVisible(true);
                System.out.println("butterflies image displayed");
            }
            default -> {
            }
        }
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

    public void setImageVisibility() {
        redcow.setVisible(false);
        bluecow.setVisible(false);
        yellowcow.setVisible(false);
        four.setVisible(false);
    }

    public void answerCheck() {
        if (redcow.isVisible()) {

            // Perform the desired action
            System.out.println("redcow is currently displayed");
            model.setCorrectAnswer("4");
        } else if (bluecow.isVisible()) {

            // Perform the desired action
            System.out.println("bluecow is currently displayed");
            model.setCorrectAnswer("8");
        } else if (yellowcow.isVisible()) {

            // Perform the desired action
            System.out.println("yellowcow is currently displayed");
            model.setCorrectAnswer("5");
        } else if (four.isVisible()) {

            // Perform the desired action
            System.out.println("butterflies is currently displayed");
            model.setCorrectAnswer("7");
        }else {

            // Perform the desired action
            System.out.println("No ImageView is currently displayed.");
        }
    }

}
