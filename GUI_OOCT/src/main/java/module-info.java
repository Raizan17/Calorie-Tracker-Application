module com.example.gui_ooct {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gui_ooct to javafx.fxml;
    exports com.example.gui_ooct;
}