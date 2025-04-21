package com.example.bashundhara_convention;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class GuestSpecialRequest {

    // FXML injected components
    @FXML
    private ComboBox<String> eventtypecbox;

    @FXML
    private ComboBox<String> requesttypecbox;

    @FXML
    private Label confirmationlab;

    @FXML
    private Button submitbtn;

    // Handler method for the "Click for submit" button
    @FXML
    private void submitbtn() {
        // Get the selected event type and request type
        String selectedEvent = eventtypecbox.getValue();
        String selectedRequest = requesttypecbox.getValue();

        // Validate inputs
        if (selectedEvent == null || selectedRequest == null) {
            // If either field is empty, update confirmation label or show an alert
            confirmationlab.setText("Please select both event and request type.");
        } else {
            // Simulate submission of special request
            confirmationlab.setText("Special request for event " + selectedEvent + " has been submitted.");

            // Optionally, show a success alert
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Special Request Submitted");
            alert.setHeaderText(null);
            alert.setContentText("Your special request for event " + selectedEvent + " has been submitted successfully.");
            alert.showAndWait();
        }
    }
}
