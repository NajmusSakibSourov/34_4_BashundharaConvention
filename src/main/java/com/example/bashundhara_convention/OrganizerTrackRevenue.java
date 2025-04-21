package com.example.bashundhara_convention;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class OrganizerTrackRevenue {

    @FXML
    private ComboBox<String> eventcbox;

    @FXML
    private TextArea revenuetextarea;

    // Sample data for demo purposes — you can replace this with actual logic from a database or file
    @FXML
    private void initialize() {
        eventcbox.getItems().addAll("Wedding Expo", "Tech Summit", "Book Fair", "Music Festival");
    }

    @FXML
    private void clickgeneratebtn() {
        String selectedEvent = eventcbox.getValue();

        if (selectedEvent == null || selectedEvent.isEmpty()) {
            revenuetextarea.setText("Please select an event to generate the report.");
            return;
        }

        // Simulated revenue data — replace with actual calculation or database retrieval
        String report = "Revenue Report for: " + selectedEvent + "\n";
        report += "--------------------------------\n";
        report += "Total Tickets Sold: 350\n";
        report += "Price per Ticket: 500 BDT\n";
        report += "Total Revenue: 175,000 BDT\n";
        report += "Additional Services: 25,000 BDT\n";
        report += "Grand Total: 200,000 BDT\n";

        revenuetextarea.setText(report);
    }
}
