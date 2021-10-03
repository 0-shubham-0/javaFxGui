module intro.javafxgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens intro.javafxgui to javafx.fxml;
    exports intro.javafxgui;
}