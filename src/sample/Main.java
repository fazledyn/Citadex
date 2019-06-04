package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class Main extends Application {


    private Stage primaryStage;

    @FXML
    Button button11, button21, button31, button41;
    @FXML
    Button button12, button22, button32, button42;
    @FXML
    Button seniorButton, aboutButton, studentDocButton;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Homepage.fxml"));
        primaryStage.setTitle(" Citadex - Beta ");
        primaryStage.setScene(new Scene(root, 550, 350));
        primaryStage.show();
    }

    @FXML
    private void button21Action(ActionEvent event) throws IOException {

        Parent Start = FXMLLoader.load(getClass().getResource("L2T1.fxml"));
        Scene scene = new Scene(Start);
        primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        primaryStage.setTitle(" Citadex : L2T1 ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void absentButtonAction(ActionEvent event) throws IOException {

        Parent Start = FXMLLoader.load(getClass().getResource("UnderConstruction.fxml"));
        Scene scene = new Scene(Start);
        primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        primaryStage.setTitle("Page under construction");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void seniorButtonAction(ActionEvent event) throws Exception {

        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URL(L2T1.seniorLink).toURI());
    }

    @FXML
    private void studentDocAction(ActionEvent event) throws Exception {

        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URL(L2T1.studentDocLink).toURI());
    }

    @FXML
    private void aboutButtonAction(ActionEvent event) throws Exception {

        Parent Start = FXMLLoader.load(getClass().getResource("About.fxml"));
        Scene scene = new Scene(Start);
        primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        primaryStage.setTitle(" Citadex : L2T1 ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
