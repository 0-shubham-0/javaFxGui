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
    protected void onAddButtonClick() {
        welcomeText.setText("You clicked Addition");
        double first = Double.parseDouble(number1.getText());
        double second = Double.parseDouble(number2.getText());
        double result = first + second;
        ans.setText(String.valueOf(result));
    }
    @FXML
    protected void onSubButtonClick() {
        welcomeText.setText("You clicked Subtraction");
        double first = Double.parseDouble(number1.getText());
        double second = Double.parseDouble(number2.getText());
        double result = first - second;
        ans.setText(String.valueOf(result));
    }
    @FXML
    protected void onMulButtonClick() {
        welcomeText.setText("You click Multiplication");
        double first = Double.parseDouble(number1.getText());
        double second = Double.parseDouble(number2.getText());
        double result = first * second;
        ans.setText(String.valueOf(result));
    }
    @FXML
    protected void onDivButtonClick() {
        welcomeText.setText("You clicked Division");
        double first = Double.parseDouble(number1.getText());
        double second = Double.parseDouble(number2.getText());
        double result = first / second;
        ans.setText(String.valueOf(result));
    }
}