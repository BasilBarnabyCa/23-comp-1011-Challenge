module com.example.f23comp1011s2w2challenge {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.f23comp1011s2w2challenge to javafx.fxml;
    exports com.example.f23comp1011s2w2challenge;
}