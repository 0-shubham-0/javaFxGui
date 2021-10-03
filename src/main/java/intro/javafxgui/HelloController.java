package intro.javafxgui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField number1,number2,ans;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void onAddButtonClick() {
        welcomeText.setText("You click add");
        double first = Double.parseDouble(number1.getText());
        double second = Double.parseDouble(number2.getText());
        double result = first + second;
        ans.setText(String.valueOf(result));
    }
    @FXML
    protected void onSubButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}