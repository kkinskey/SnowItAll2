module com.example.snowitall {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.media;
    requires java.sql;


    opens com.example.snowitall to javafx.fxml;
    exports com.example.snowitall;
}