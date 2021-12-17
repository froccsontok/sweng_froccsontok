package com.example.frocs;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.io.IOException;

public class MenuController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void switchProfil()throws IOException
    {
        Froccs.setRoot("profil-view.fxml");
    }
}