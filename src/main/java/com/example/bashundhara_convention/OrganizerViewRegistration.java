package com.example.bashundhara_convention;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class OrganizerViewRegistration {

    @FXML
    private ComboBox<String> eventtype;

    @FXML
    private TextArea textarea;

    @FXML
    private void initialize() {
        // Add sample events to the ComboBox (you can replace with real event data)
        eventtype.getItems().addAll("Wedding Expo", "Tech Summit", "Book Fair", "Music Festival");
    }

    @FXML
    private void viewbtn() {
        String selectedEvent = eventtype.getValue();

        if (selectedEvent == null || selectedEvent.isEmpty()) {
            textarea.setText("Please select an event to view attendees.");
            return;
        }

        // Simulate guest list for the selected event — this should be replaced with real data
        String guestList = "Guest List for: " + selectedEvent + "\n";
        guestList += "-------------------------\n";
        guestList += "1. Tanvir Ahmed\n";
        guestList += "2. Nusrat Jahan\n";
        guestList += "3. Ayman Hossain\n";
        guestList += "4. Farhana Rahman\n";
        guestList += "5. Sadman Sakib\n";

        textarea.setText(guestList);
    }
}
