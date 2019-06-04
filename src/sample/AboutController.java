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

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class AboutController implements Initializable {

    private static final String githubLink = "";

    private Stage primaryStage;

    @FXML
    Button githubButton, backButton;

    @FXML
    private void backButtonAction(ActionEvent event) throws Exception {
        Parent Start = FXMLLoader.load(getClass().getResource("Homepage.fxml"));
        Scene scene = new Scene(Start);
        primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        primaryStage.setTitle(" Citadex : L2T1 ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void githubButtonAction(ActionEvent event) throws Exception {

        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URL(githubLink).toURI());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
