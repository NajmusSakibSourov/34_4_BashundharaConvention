package com.example.bashundhara_convention;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class GuestViewEventDetails {

    // FXML injected components
    @FXML
    private TextField searchbar;

    @FXML
    private Button clickbtn;

    @FXML
    private TextField eventdetails;

    @FXML
    private Label searchbarLabel;

    // Handler method for the "Click Search" button
    @FXML
    private void clickbtn() {
        // Get the search term entered by the user
        String searchTerm = searchbar.getText();

        // Simulate searching for event details
        if (searchTerm == null || searchTerm.isEmpty()) {
            // If no search term is entered, show an alert
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Search Error");
            alert.setHeaderText(null);
            alert.setContentText("Please enter an event name to search.");
            alert.showAndWait();
        } else {
            // Simulate retrieving event details based on the search term
            String eventInfo = searchForEventDetails(searchTerm);
            if (eventInfo != null) {
                // Display the event details
                eventdetails.setText(eventInfo);
            } else {
                // If no event is found, show a message
                eventdetails.setText("Event not found.");
            }
        }
    }

    // Handler method for event details field (optional action on pressing Enter)
    @FXML
    private void eventdetails() {
        // Logic for handling actions when the user presses Enter in the event details field
        String details = eventdetails.getText();
        if (details != null && !details.isEmpty()) {
            // Show a confirmation or perform further actions based on the details
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Event Details");
            alert.setHeaderText(null);
            alert.setContentText("You have viewed the details for the event.");
            alert.showAndWait();
        }
    }

    // Simulated method for searching event details
    private String searchForEventDetails(String searchTerm) {
        // Simulate looking for event details (can be replaced with actual database logic)
        if ("Sample Event".equalsIgnoreCase(searchTerm)) {
            return "Sample Event Details: \nDate: 12th Dec 2025\nVenue: Bashundhara Convention Center\nDescription: A great event!";
        } else {
            return null;
        }
    }
}
