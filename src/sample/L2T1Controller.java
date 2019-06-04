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

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class L2T1Controller implements Initializable {

    @FXML
    Button cse203, cse205, cse218;
    @FXML
    Button cse204, cse206, eee264;
    @FXML
    Button eee263, math245, chotha;
    @FXML
    Button backButton;

    private Stage primaryStage;

    @FXML
    public void cse203Action(ActionEvent event) throws Exception {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URL(L2T1.cse203Link).toURI());
    }

    @FXML
    public void cse205Action(ActionEvent event) throws Exception {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URL(L2T1.cse205Link).toURI());
    }

    @FXML
    public void cse218Action(ActionEvent event) throws Exception {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URL(L2T1.cse218Link).toURI());
    }

    @FXML
    public void cse204Action(ActionEvent event) throws Exception {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URL(L2T1.cse204Link).toURI());
    }

    @FXML
    public void cse206Action(ActionEvent event) throws Exception {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URL(L2T1.cse206Link).toURI());
    }

    @FXML
    public void eee264Action(ActionEvent event) throws Exception {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URL(L2T1.eee264Link).toURI());
    }

    @FXML
    public void eee263Action(ActionEvent event) throws Exception {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URL(L2T1.eee263Link).toURI());
    }

    @FXML
    public void math245Action(ActionEvent event) throws Exception {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URL(L2T1.math245Link).toURI());
    }

    @FXML
    public void chothaAction(ActionEvent event) throws Exception {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URL(L2T1.chothaLink).toURI());
    }

    @FXML
    private void backButtonAction(ActionEvent event) throws Exception {
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
