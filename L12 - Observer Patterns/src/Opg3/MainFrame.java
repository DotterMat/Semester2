package Opg3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ArrayList;
import java.util.List;

public class MainFrame extends Application {
    private final GridPane pane = new GridPane();
    private final List<ColorObserver> colorObservers = new ArrayList<>();

    @Override
    public void start(Stage stage) {
        stage.setTitle("ObserverPattern");
        this.initContent();
        stage.initStyle(StageStyle.UTILITY);
        Scene scene = new Scene(this.pane);
        stage.setScene(scene);
        stage.show();
    }

    // ------------------------------------------------------------------------
    private final Button btnShowFrame1 = new Button("Open SubFrame 1");
    private final Button btnShowFrame2 = new Button("Open SubFrame 2");

    private void initContent() {
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblNumber = new Label("Number");
        pane.add(lblNumber, 0, 0);

        ToggleGroup group = new ToggleGroup();

        RadioButton rbnRed = new RadioButton("Red");
        pane.add(rbnRed, 0, 1);
        rbnRed.setToggleGroup(group);
        rbnRed.setOnAction(event -> this.redAction());

        RadioButton rbnGreen = new RadioButton("Green");
        pane.add(rbnGreen, 0, 2);
        rbnGreen.setToggleGroup(group);
        rbnGreen.setOnAction(event -> this.greenAction());

        RadioButton rbnBlue = new RadioButton("Blue");
        pane.add(rbnBlue, 0, 3);
        rbnBlue.setToggleGroup(group);
        rbnBlue.setOnAction(event -> this.blueAction());

        RadioButton rbnYellow = new RadioButton("Yellow");
        pane.add(rbnYellow, 0, 4);
        rbnYellow.setToggleGroup(group);
        rbnYellow.setOnAction(event -> this.yellowAction());

        RadioButton rbnOrange = new RadioButton("Orange");
        pane.add(rbnOrange, 0, 5);
        rbnOrange.setToggleGroup(group);
        rbnOrange.setOnAction(event -> this.orangeAction());

        pane.add(btnShowFrame1, 0, 6);
        btnShowFrame1.setOnAction(event -> this.openSubFrame1());


        pane.add(btnShowFrame2, 0, 7);
        btnShowFrame2.setOnAction(event -> this.openSubFrame2());
    }

    // ------------------------------------------------------------------------

    private String color;

    private void openSubFrame1() {
        SubFrame subFrame = new SubFrame();
        subFrame.setMainFrame(this);
        subFrame.show();
        colorObservers.add(subFrame);
        btnShowFrame1.setDisable(true);

    }

    private void openSubFrame2() {
        SubFrame2 subFrame2 = new SubFrame2();
        subFrame2.setMainFrame(this);
        subFrame2.show();
        colorObservers.add(subFrame2);
        btnShowFrame2.setDisable(true);
    }

    private void redAction() {
        color = "red";
        pane.setStyle("-fx-background-color: " + color);
        notifyObservers(color);
    }

    private void greenAction() {
        color = "lightgreen";
        pane.setStyle("-fx-background-color: " + color);
        notifyObservers(color);
    }

    private void blueAction() {
        color = "lightskyblue";
        pane.setStyle("-fx-background-color: " + color);
        notifyObservers(color);
    }

    private void yellowAction() {
        color = "yellow";
        pane.setStyle("-fx-background-color: " + color);
        notifyObservers(color);
    }
    private void orangeAction() {
        color = "orange";
        pane.setStyle("-fx-background-color: " + color);
        notifyObservers(color);
    }

    private void notifyObservers(String color) {
        for (ColorObserver obs : colorObservers) {
            obs.updateColor(color);
        }
    }
    public String getColor() {
        return color;
    }
}

