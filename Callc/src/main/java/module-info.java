module com.example.callc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.callc to javafx.fxml;
    exports com.example.callc;
}