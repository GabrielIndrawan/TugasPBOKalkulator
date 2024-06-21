module com.example.tugaspbokalkulatorgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tugaspbokalkulatorgui to javafx.fxml;
    exports com.example.tugaspbokalkulatorgui;
}