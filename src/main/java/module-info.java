module com.example.snowitall {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.media;
    requires java.sql;
    requires mysql.connector.java;

    opens com.example.snowitall to javafx.fxml;
    exports com.example.snowitall;
    exports com.example.snowitall.GradeK1;
    opens com.example.snowitall.GradeK1 to javafx.fxml;
    exports com.example.snowitall.Grade23;
    opens com.example.snowitall.Grade23 to javafx.fxml;
}