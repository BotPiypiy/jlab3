package org.example;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtFieldDl;

    @FXML
    private TextField txtFieldSh;

    @FXML
    private Label sq;

    @FXML
    private Label pr;

    @FXML
    void buttonPerimeter(ActionEvent event) {
        try {
            Integer.parseInt(txtFieldDl.getText());
            Integer.parseInt(txtFieldSh.getText());
        }
        catch (Exception exception) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ошибка");
            alert.setHeaderText("Ты чо дурак бля?!");
            alert.showAndWait();
            return;
        }
        int lenght = Math.abs(Integer.parseInt(txtFieldDl.getText()));
        int width = Math.abs(Integer.parseInt(txtFieldSh.getText()));
        pr.setText(Integer.toString((lenght+width)*2));
    }

    @FXML
    void buttonSquare(ActionEvent event) {
        try {
            Integer.parseInt(txtFieldDl.getText());
            Integer.parseInt(txtFieldSh.getText());
        }
        catch (Exception exception)
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ошибка");
            alert.setHeaderText("Ты чо дурак бля?!");
            alert.showAndWait();
            return;
        }
        int lenght=Integer.parseInt(txtFieldDl.getText());
        int width=Integer.parseInt(txtFieldSh.getText());
        sq.setText(Integer.toString((Math.abs(lenght*width))));
    }

    @FXML
    void initialize() {
    }
}
