module com.example.snowitall {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.media;
    requires java.sql;
    requires com.google.gson;


    opens com.example.snowitall to javafx.fxml;
    exports com.example.snowitall;
}