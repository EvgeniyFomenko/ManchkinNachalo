package ru.evgenyfomenko;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import ru.evgenyfomenko.Player.Character;
import ru.evgenyfomenko.Player.Theif;
import ru.evgenyfomenko.controllers.Menu;
import ru.evgenyfomenko.controllers.SetPlayerController;

import java.io.IOException;

public class Main extends Application {
    private ObservableList<Character> charters =  FXCollections.<Character>observableArrayList();
    private Stage primaryStage;
    public static void main(String[] args) {
        Application.launch();

    }
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Menu.fxml"));
        AnchorPane root = loader.load();
        Menu menu = loader.getController();
        menu.setMain(this);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    public void showSetPlayer()throws IOException {
        charters.add(new Theif());
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/SetPlayers.fxml"));
        AnchorPane content =loader.load();

        Stage stage = new Stage();
        stage.initOwner(primaryStage);
        Scene scene = new Scene(content);
        stage.setScene(scene);

        SetPlayerController setPlayerController = loader.getController();
        setPlayerController.setMain(this);

        stage.show();
    }

    public void showDialogNewPlayer()throws IOException {

    }
    public Stage getPrimaryStage(){
        return primaryStage;
    }
    public void addObservable(){

    }
    public ObservableList<Character> getObservableList(){return charters;}
}
