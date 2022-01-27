package com.example.frocs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class Froccs extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Froccs.class.getResource("menu-view.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setTitle("Fröccs");
        Image icon = new Image(getClass().getResource("ikon.png").toExternalForm());
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Froccs.class.getResource(fxml));
        scene.setRoot(fxmlLoader.load());
    }

    public static void main(String[] args) {
        launch();
    }
}