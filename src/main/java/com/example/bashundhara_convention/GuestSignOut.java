package com.example.bashundhara_convention;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class GuestSignOut {

    // FXML injected components
    @FXML
    private TextField messagetextfield;

    @FXML
    private TextField redirectinfotextfield;

    @FXML
    private Button signoutbtn;

    @FXML
    private Label confirmationMessageLabel;

    @FXML
    private Label redirectInfoLabel;

    // Handler method for the "Click for sign out" button
    @FXML
    private void signoutbtn() {
        // Get values from text fields
        String signOutMessage = messagetextfield.getText();
        String redirectInfo = redirectinfotextfield.getText();

        // Validate inputs
        if (signOutMessage.isEmpty() || redirectInfo.isEmpty()) {
            // If any field is empty, show an alert or update labels
            confirmationMessageLabel.setText("Please provide both message and redirect info.");
            redirectInfoLabel.setText("");
        } else {
            // Simulate sign-out operation
            confirmationMessageLabel.setText("Sign-out successful. " + signOutMessage);
            redirectInfoLabel.setText("Redirecting to: " + redirectInfo);

            // Optionally, show a confirmation alert
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Sign Out");
            alert.setHeaderText(null);
            alert.setContentText("You have successfully signed out. You will be redirected to " + redirectInfo);
            alert.showAndWait();
        }
    }
}
