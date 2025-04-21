package com.example.bashundhara_convention;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class OrganizerCancelEvent {

    // FXML injected components
    @FXML
    private TextField emailtextfield;

    @FXML
    private TextField logintextfield;

    @FXML
    private ComboBox<String> eventtypecbox;

    @FXML
    private Button cancelbtn;

    @FXML
    private Label notificationlab;

    // Handler method for the "Click for cancel" button
    @FXML
    private void cancelbtn() {
        // Retrieve entered values
        String email = emailtextfield.getText();
        String loginInfo = logintextfield.getText();
        String eventType = eventtypecbox.getValue();

        // Validate the input fields
        if (email.isEmpty() || loginInfo.isEmpty() || eventType == null) {
            showAlert("Input Error", "Please fill in all fields.");
        } else {
            // Simulate canceling the event
            boolean isCancelled = cancelEvent(email, loginInfo, eventType);

            if (isCancelled) {
                notificationlab.setText("Event cancellation successful!");
                showAlert("Success", "The event has been canceled successfully.");
            } else {
                notificationlab.setText("Cancellation failed.");
                showAlert("Failure", "Unable to cancel the event. Please try again.");
            }
        }
    }

    // Simulate canceling an event
    private boolean cancelEvent(String email, String loginInfo, String eventType) {
        // Simulate logic to cancel an event based on the provided data
        // In a real scenario, this would connect to a database or API to process the cancellation
        return true; // Simulating successful cancellation
    }

    // Show an alert with a custom title and message
    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
