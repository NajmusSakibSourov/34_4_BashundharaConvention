package com.example.bashundhara_convention;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class OrganizerModifyEvent {

    // FXML components linked to the UI elements
    @FXML
    private TextField emailtxtfld;

    @FXML
    private TextField logintxtfld;

    @FXML
    private ComboBox<String> eventxcbox;

    @FXML
    private TextField updatetxtfld;

    @FXML
    private Button savechangesbtn;

    @FXML
    private Label notificationLabel;

    // Handler method for the "Click for save changes" button
    @FXML
    private void savechangesbtn() {
        // Get entered values for email, login, event, and update info
        String email = emailtxtfld.getText();
        String login = logintxtfld.getText();
        String event = eventxcbox.getSelectionModel().getSelectedItem();
        String updateInfo = updatetxtfld.getText();

        // Check if all required fields are filled
        if (email.isEmpty() || login.isEmpty() || event == null || updateInfo.isEmpty()) {
            notificationLabel.setText("Please fill all the fields.");
            showAlert("Input Error", "Please fill all the fields.");
        } else {
            // Simulate updating the event with the provided info
            boolean isUpdateSuccessful = updateEvent(email, login, event, updateInfo);

            if (isUpdateSuccessful) {
                notificationLabel.setText("Event updated successfully!");
                showAlert("Success", "The event has been updated successfully.");
            } else {
                notificationLabel.setText("Event update failed.");
                showAlert("Failure", "Unable to update the event. Please try again.");
            }
        }
    }

    // Simulate updating the event details
    private boolean updateEvent(String email, String login, String event, String updateInfo) {
        // In a real scenario, this method could involve saving the updated event details to a database
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
