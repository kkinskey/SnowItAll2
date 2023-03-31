package UI.LandingPage;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class LandingPage {

    public LandingPage() {

    }

    public void goToStandard(ActionEvent event, Button button) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("operationsLandingPage.fxml"));
            Parent parent = loader.load();
            Scene scene = new Scene(parent); //Make scene with that path
            Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow()); //Assign nodes to the window
            window.setScene(scene); //Set the scene
            window.show(); //Make it visible

        } catch (Exception e) {
            e.printStackTrace();
        }





//
//        try {
//            FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
//            Parent parent = loader.load();
//            Scene scene = new Scene(parent);
//            StandardControllerParent controller = loader.getController();
//            Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());
//            window.setScene(scene);
//            window.show();
//            //controller.setGrade(grade);
//            controller.initialize();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }



}


