module com.example.snowitall {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.media;


    opens com.example.snowitall to javafx.fxml;
    exports com.example.snowitall;
    exports UI.LandingPage;
    opens UI.LandingPage to javafx.fxml;
    exports UI;
    opens UI to javafx.fxml;
    exports UI.Standard.Operations;
    opens UI.Standard.Operations to javafx.fxml;
}