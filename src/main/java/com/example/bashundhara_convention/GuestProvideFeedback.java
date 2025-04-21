package com.example.bashundhara_convention;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class GuestProvideFeedback {

    // FXML injected components
    @FXML
    private ComboBox<String> eventnamecbox;

    @FXML
    private TextArea feedbacktextarea;

    @FXML
    private Label confirmationlab;

    // Handler method for the "Click for submit" button
    @FXML
    private void submitbtn() {
        // Get the selected event name and entered feedback
        String selectedEvent = eventnamecbox.getValue();
        String feedback = feedbacktextarea.getText();

        // Validate inputs
        if (selectedEvent == null || selectedEvent.isEmpty() || feedback.isEmpty()) {
            // If any field is empty, update confirmation label or show an alert
            confirmationlab.setText("Please fill in both the event name and feedback.");
        } else {
            // Simulate feedback submission
            confirmationlab.setText("Feedback for " + selectedEvent + " submitted successfully.");

            // Optionally, show a success alert
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Feedback Submitted");
            alert.setHeaderText(null);
            alert.setContentText("Thank you for your feedback on the " + selectedEvent + " event.");
            alert.showAndWait();
        }
    }
}
