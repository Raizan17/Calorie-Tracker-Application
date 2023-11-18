/**
 * Name: Raizan Ahmed
 * UCID: 30134334
 * Name: Rezwan Ahmed
 * UCID: 30134609
 * Course: CPSC 233
 * Professor: Jonathan Hudson
 * Tutorial: T10
 * Name of Program: Calorie tracker
 * Program details: It is  an object-oriented program with event-driven GUI layer on top that allows the user
 * to track his calorie and food data accordingly.
 */


package com.example.gui_ooct;

import com.Classes.Reader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Calorie Tracker v1.0");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
   File file = new File(args[0]);
   Reader.ReadFile(file);
        launch();

    }
}