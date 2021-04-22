package ru.evgenyfomenko.controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Window;
import ru.evgenyfomenko.Main;

import java.io.IOException;

public class Menu {
    @FXML
    private Button bStart;


    public Main main;
    public   Menu()  {

    }
    public void initial(){

    }
    public void setMain(Main main){
        this.main = main;
    }
    @FXML
    protected void buttonClicked(ActionEvent event) throws IOException {
        main.showSetPlayer();
        closeWindow(event);

    }
    public void closeWindow(ActionEvent event){
        Scene scene = ((Node)event.getSource()).getScene();
        Window window = scene.getWindow();
        window.hide();

    }
}
