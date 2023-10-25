package com.example.module5assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.layout.*;

import java.io.IOException;

import javafx.scene.control.Label;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;

public class HelloWorldApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloWorldApplication.class.getResource("hello-view.fxml"));
        Label label1 = new Label();
        Label label2 = new Label();
        label1.setText("Hello");
        label2.setText(" World");
        HBox root = new HBox();
        root.getChildren().add(label1);
        root.getChildren().add(label2);
        Scene scene = new Scene(root, 300, 50);
        primaryStage.setTitle("JavaFX Example");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}