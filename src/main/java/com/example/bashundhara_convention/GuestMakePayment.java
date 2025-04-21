package com.example.bashundhara_convention;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class GuestMakePayment {

    // FXML injected components
    @FXML
    private ComboBox<String> eventcbox;

    @FXML
    private TextField details;

    @FXML
    private ComboBox<String> methodcbox;

    @FXML
    private Label receipt;

    // Handler method for the "Click for payment" button
    @FXML
    private void paymentbtn() {
        // Get selected values and entered details
        String selectedEvent = eventcbox.getValue();
        String feeDetails = details.getText();
        String paymentMethod = methodcbox.getValue();

        // Validate that all fields are filled in
        if (selectedEvent == null || feeDetails.isEmpty() || paymentMethod == null) {
            // If any field is empty, show an alert or update the receipt label
            receipt.setText("Please fill in all fields.");
        } else {
            // Simulate a successful payment and receipt generation
            String receiptMessage = "Receipt for " + selectedEvent + "\nFee Details: " + feeDetails + "\nPayment Method: " + paymentMethod;

            // Update the receipt label with the message
            receipt.setText(receiptMessage);

            // Optionally, show a success alert
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Payment Successful");
            alert.setHeaderText(null);
            alert.setContentText("Your payment for " + selectedEvent + " was successful.\n" + receiptMessage);
            alert.showAndWait();
        }
    }
}
