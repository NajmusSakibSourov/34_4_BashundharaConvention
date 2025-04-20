module com.example.bashundhara_convention {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bashundhara_convention to javafx.fxml;
    exports com.example.bashundhara_convention;
}