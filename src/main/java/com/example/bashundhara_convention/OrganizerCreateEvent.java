package com.example.bashundhara_convention;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class OrganizerCreateEvent {

    // FXML components linked to the UI elements
    @FXML
    private TextField nametextfield;

    @FXML
    private TextField pricetextfield;

    @FXML
    private TextField Capacitytextfield;

    @FXML
    private DatePicker Datepicker;

    @FXML
    private Button savebtn;

    @FXML
    private Label confirmationlab;

    // Handler method for the "Click for Save" button
    @FXML
    private void savebtn() {
        // Retrieving input values
        String eventName = nametextfield.getText();
        String price = pricetextfield.getText();
        String capacity = Capacitytextfield.getText();
        String eventDate = Datepicker.getValue() != null ? Datepicker.getValue().toString() : null;

        // Validate input fields
        if (eventName.isEmpty() || price.isEmpty() || capacity.isEmpty() || eventDate == null) {
            showAlert("Input Error", "Please fill in all fields.");
        } else {
            // Simulate event creation
            boolean isEventCreated = createEvent(eventName, price, capacity, eventDate);

            if (isEventCreated) {
                confirmationlab.setText("Event created successfully!");
                showAlert("Success", "The event has been created successfully.");
            } else {
                confirmationlab.setText("Creation failed.");
                showAlert("Failure", "Unable to create the event. Please try again.");
            }
        }
    }

    // Simulate event creation
    private boolean createEvent(String eventName, String price, String capacity, String eventDate) {
        // In a real scenario, this method could involve saving the event data to a database or a file
        // For now, we simulate success
        return true;
    }

    // Show an alert dialog with a custom title and message
    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
