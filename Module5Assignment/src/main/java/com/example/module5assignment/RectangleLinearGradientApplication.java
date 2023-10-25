package com.example.module5assignment;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.paint.LinearGradient;

public class RectangleLinearGradientApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {

        VBox root = new VBox();
        final Scene scene = new Scene(root,300, 250);
        Stop[] stops = new Stop[] { new Stop(0, Color.GREEN), new Stop(1,
                Color.BLUE)};
        LinearGradient linear = new LinearGradient(0, 0, 1, 0, true,
                CycleMethod.NO_CYCLE, stops);
        Rectangle rect = new Rectangle(0, 0, 100, 100);
        rect.setFill(linear);
        root.getChildren().add(rect);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Animation Example");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}