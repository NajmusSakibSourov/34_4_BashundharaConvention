package com.example.bashundhara_convention;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class OrganizerSendNotification {

    @FXML
    private ComboBox<String> eventcbox;

    @FXML
    private TextArea textareacontent;

    @FXML
    private Label statuslab;

    // This method is triggered when the "Click for send" button is pressed
    @FXML
    private void sendbtn() {
        String selectedEvent = eventcbox.getSelectionModel().getSelectedItem();
        String message = textareacontent.getText();

        // Validation check
        if (selectedEvent == null || selectedEvent.isEmpty()) {
            statuslab.setText("Please select an event.");
            showAlert("Validation Error", "Event not selected.");
        } else if (message == null || message.isBlank()) {
            statuslab.setText("Please write a message.");
            showAlert("Validation Error", "Message content is empty.");
        } else {
            // Simulate sending notification
            boolean success = sendNotificationToEvent(selectedEvent, message);

            if (success) {
                statuslab.setText("Notification sent successfully!");
                showAlert("Success", "Notification sent to " + selectedEvent + ".");
                textareacontent.clear(); // Clear message box after sending
            } else {
                statuslab.setText("Failed to send notification.");
                showAlert("Error", "Something went wrong while sending the message.");
            }
        }
    }

    // Simulate notification logic
    private boolean sendNotificationToEvent(String event, String message) {
        // Add actual logic here (e.g., saving to database or sending to a server)
        System.out.println("Notification sent to event: " + event);
        System.out.println("Message: " + message);
        return true;
    }

    // Alert box
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
