package com.example.bashundhara_convention;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class OrganizerManageVenue {

    // FXML components linked to the UI elements
    @FXML
    private ComboBox<String> eventcbox;

    @FXML
    private ListView<String> seatinglistview;

    @FXML
    private Button confirmbtn;

    @FXML
    private Label messagebtn;

    // Handler method for the "Click for confirm" button
    @FXML
    private void confirmbtn() {
        // Get selected event and seating setup
        String selectedEvent = eventcbox.getSelectionModel().getSelectedItem();
        String selectedSeating = seatinglistview.getSelectionModel().getSelectedItem();

        // Check if event or seating setup is not selected
        if (selectedEvent == null || selectedSeating == null) {
            messagebtn.setText("Please select both event and seating setup.");
            showAlert("Input Error", "Please select both event and seating setup.");
        } else {
            // Simulate venue confirmation
            boolean isVenueConfirmed = confirmVenue(selectedEvent, selectedSeating);

            if (isVenueConfirmed) {
                messagebtn.setText("Venue confirmed successfully!");
                showAlert("Success", "The venue has been confirmed successfully.");
            } else {
                messagebtn.setText("Venue confirmation failed.");
                showAlert("Failure", "Unable to confirm the venue. Please try again.");
            }
        }
    }

    // Simulate venue confirmation
    private boolean confirmVenue(String event, String seating) {
        // In a real scenario, this method could involve saving the venue details to a database
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
