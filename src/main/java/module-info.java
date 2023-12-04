module com.example.f23comp1011s2w2challenge {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;

    opens com.example.f23comp1011s2w2challenge to javafx.fxml, com.google.gson;
    exports com.example.f23comp1011s2w2challenge;
}