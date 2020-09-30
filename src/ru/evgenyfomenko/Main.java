package ru.evgenyfomenko;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import ru.evgenyfomenko.Menu.Menu;
import ru.evgenyfomenko.Player.Player;
import ru.evgenyfomenko.Player.Player1;

import java.net.URL;


public class Main extends Application   {

    public static void main(String[] args) {
        Application.launch(args);


    }
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setController(new Menu());
            Group group = new Group();
            Scene scene = new Scene(group, 600, 400);
            Parent content = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            BorderPane root = new BorderPane();
            root.setCenter(content);
            group.getChildren().add(root);
            //stage.setTitle("Manchkin Start");
            stage.setScene(scene);
            stage.show();
        }catch(Exception ex){ex.printStackTrace();}

    }



}
