package at.ac.fhcampuswien;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;


public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("NewsApp.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1213, 460);
        stage.setTitle("NewsApp from NetSquad!");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);/*
        Menu menu = new Menu();
        menu.start();
        */
    }
}
