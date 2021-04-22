package ru.evgenyfomenko.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Window;
import ru.evgenyfomenko.Main;
import ru.evgenyfomenko.Player.Character;
import ru.evgenyfomenko.Player.Theif;

import java.net.URL;
import java.util.ResourceBundle;

import static javafx.collections.FXCollections.observableArrayList;

public class SetPlayerController implements Initializable {
    ObservableList<Character> characters = FXCollections.observableArrayList();

    @FXML
    private ListView<Character> lView;

    Main main ;

    public SetPlayerController() {

    }

    public void setOnPlayer(){

    }
    public void createNewPlayer(){


    }
    @FXML
    public void exitOnGame(ActionEvent event){
        Scene scene = ((Node)event.getSource()).getScene();
        Window window = scene.getWindow();
        window.hide();
    }
    public void setMain( Main main){
       this.main = main;

    }
    private void loadData(){
        Character one = new Theif();
        one.setName("WaterMan");
        characters.addAll(one, new Theif());
        lView.getItems().addAll(characters);
        lView.setOrientation(Orientation.VERTICAL);
        lView.getSelectionModel().selectFirst();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
    }
}
