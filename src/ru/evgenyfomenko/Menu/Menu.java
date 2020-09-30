package ru.evgenyfomenko.Menu;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import ru.evgenyfomenko.Player.Player1;
import ru.evgenyfomenko.Player.Warrior;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class Menu {
    public   Menu()  {

    }

    public void buttonClicked() throws IOException {
        System.out.println("Button Clicked!");
        System.out.println(new Player1("Trian","Red"));

        FXMLLoader loader = new FXMLLoader(getClass().getResource("SetPlayers.fxml"));
        Parent content = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(content));
        BorderPane root = new BorderPane();
        root.setCenter(content);

        stage.show();
    }

}
