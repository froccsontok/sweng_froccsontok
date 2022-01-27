module com.example.frocs {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.frocs to javafx.fxml;
    exports com.example.frocs;
}