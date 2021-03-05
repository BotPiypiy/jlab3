package sample;
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
    void bttnPr(ActionEvent event) {
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
        int dl = Math.abs(Integer.parseInt(txtFieldDl.getText()));
        int sh = Math.abs(Integer.parseInt(txtFieldSh.getText()));
        pr.setText(Integer.toString((dl+sh)*2));
    }

    @FXML
    void bttnSq(ActionEvent event) {
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
        int dl=Integer.parseInt(txtFieldDl.getText());
        int sh=Integer.parseInt(txtFieldSh.getText());
        sq.setText(Integer.toString((Math.abs(dl*sh))));
    }

    @FXML
    void initialize() {
    }
}
