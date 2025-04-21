package com.example.bashundhara_convention;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class GuestDownloadPass {

    // FXML injected components
    @FXML
    private TextField emaillab;

    @FXML
    private TextField loginlab;

    @FXML
    private ComboBox<String> registeredcbox;

    @FXML
    private Label statuslab;

    // Handler method for the "Click for Download Pass" button
    @FXML
    private void clickpassbtn() {
        // Get input values
        String email = emaillab.getText();
        String login = loginlab.getText();
        String selectedEvent = registeredcbox.getValue();

        // Validate the inputs
        if (email.isEmpty() || login.isEmpty() || selectedEvent == null) {
            // If any field is empty, show an alert or update the status label
            statuslab.setText("Please fill in all fields.");
        } else {
            // Simulate a successful pass download
            statuslab.setText("Pass successfully downloaded for " + selectedEvent);

            // Optionally, show a success alert
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Download Successful");
            alert.setHeaderText(null);
            alert.setContentText("You have successfully downloaded the pass for " + selectedEvent + ".");
            alert.showAndWait();
        }
    }
}
