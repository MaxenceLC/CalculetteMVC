module org.example.calculatorfxml {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example.calculatorfxml.model to javafx.base;
    opens org.example.calculatorfxml.controller to javafx.fxml;
    opens org.example.calculatorfxml.view to javafx.graphics;
}
