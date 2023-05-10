package com.example.snowitall;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;
import java.util.Random;

public class RandomImageDisplay extends Application {

    private static final String IMAGES_DIRECTORY = "src/main/resources/com/example/snowitall/shapes";
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

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        ImageView imageView = new ImageView();
        root.getChildren().add(imageView);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Load and display a random image
        displayRandomImage(imageView);
    }

    private void displayRandomImage(ImageView imageView) {
        // Generate a random index to select an image file
        Random random = new Random();
        int randomIndex = random.nextInt(IMAGE_FILES.length);

        // Get the selected image file
        String imageFileName = IMAGE_FILES[randomIndex];
        String imagePath = IMAGES_DIRECTORY + File.separator + imageFileName;

        // Load the image and set it in the ImageView
        Image image = new Image(new File(imagePath).toURI().toString());
        imageView.setImage(image);
    }




    public static void main(String[] args) {
        String relativePath = "src/main/resources/com/example/snowitall/otherImages/GiftAlert.png"; // Relative path to the image directory

        // Get the absolute path of the current working directory
        String currentPath = new File("").getAbsolutePath();

        // Construct the absolute image path by combining the current path and the relative path
        String imagePath = currentPath + File.separator + relativePath;

        System.out.println("Image directory path: " + imagePath);
//        launch(args);

    }
}