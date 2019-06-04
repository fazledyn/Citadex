package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UnderConstructionController implements Initializable {

    private Stage primaryStage;

    @FXML
    Button backButton;

    @FXML
    private void backButtonAction(ActionEvent event) throws IOException {

        Parent Start = FXMLLoader.load(getClass().getResource("Homepage.fxml"));
        Scene scene = new Scene(Start);
        primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        primaryStage.setTitle("Citadex - Beta");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
