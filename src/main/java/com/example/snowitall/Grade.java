package com.example.snowitall;

import com.example.snowitall.GradeK1.GeoModel;
import com.example.snowitall.GradeK1.GeoPracController;
import com.example.snowitall.GradeK1.GeometryController;

public enum Grade {
    GRADE_1("Grade 1", "/com/example/snowitall/geometryLandingPage.fxml", new Object[]{new GeometryController(), new GeoPracController()}, new GeoModel());

   // I will add other grades later

//    GRADE_2("Grade 2", "grade2.Grade2.fxml", new Grade2Controller(), new Grade2Model()),
//    GRADE_3("Grade 3", "grade3.Grade3.fxml", new Grade3Controller(), new Grade3Model());

    private final String name;
    private final String fxmlPath;
    private final Object[] controllers;
    private final Object model;

    Grade(String name, String fxmlPath, Object[] controllers, Object model) {
        this.name = name;
        this.fxmlPath = fxmlPath;
        this.controllers = controllers;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getFxmlPath() {
        return fxmlPath;
    }

    public Object[] getControllers() {
        return controllers;
    }

    public Object getModel() {
        return model;
    }
}