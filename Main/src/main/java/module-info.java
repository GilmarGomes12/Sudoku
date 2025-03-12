module com.example.main {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ghg.main to javafx.fxml;
    exports com.ghg.main;
}