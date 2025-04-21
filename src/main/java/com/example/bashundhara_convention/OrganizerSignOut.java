package com.example.bashundhara_convention;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class OrganizerSignOut {

    @FXML
    private Label confirmationlab;

    // This method is triggered when the "Click for sign out" button is pressed
    @FXML
    private void signoutbtn() {
        // Update confirmation label
        confirmationlab.setText("You have successfully signed out.");

        // Optionally, show a popup
        showAlert("Signed Out", "You have been signed out successfully.");

        // You can also redirect to login screen or close the window here if needed
        // For example:
        // Stage stage = (Stage) confirmationlab.getScene().getWindow();
        // stage.close(); // This will close the current window
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
