package com.example.snowitall;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class PracticeQuestionView {
    private VBox questionBox;
    private Label questionLabel;
    private ToggleGroup choiceGroup;
    private List<RadioButton> choiceButtons;

    // Constructor
    public PracticeQuestionView(MultipleChoiceQuestion question) {
        questionLabel = new Label(question.getQuestion());

        choiceGroup = new ToggleGroup();
        choiceButtons = new ArrayList<>();
        for (String choice : question.getChoices()) {
            RadioButton button = new RadioButton(choice);
            button.setToggleGroup(choiceGroup);
            choiceButtons.add(button);
        }

        questionBox = new VBox();
        questionBox.getChildren().addAll((Node) questionLabel, (Node) choiceButtons);
    }

    // Getters
    public VBox getQuestionBox() {
        return questionBox;
    }

    public int getSelectedChoiceIndex() {
        int selectedButtonIndex = choiceButtons.indexOf(choiceGroup.getSelectedToggle());
        return selectedButtonIndex;
    }
}
