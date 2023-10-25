package Opg3;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SubFrame extends Stage implements ColorObserver {
    private final GridPane pane = new GridPane();
    private MainFrame mainFrame;
    private boolean isSubscribed = false;

    public SubFrame() {
        this.initStyle(StageStyle.UTILITY);
        this.setMinHeight(110);
        this.setMinWidth(200);
        this.setResizable(false);
        this.setTitle("SubFrame 1");
        this.initContent();

        Scene scene = new Scene(pane);
        this.setScene(scene);

    }


    // -------------------------------------------------------------------------

    private final Label lblInfo = new Label("State: Unsubscribed");
    private final Label lblInfoSub = new Label("State: Subscribed");
    private final Button btnSubscribe = new Button("Subscribe");
    private final Button btnUnsubscribe = new Button("Unsubscribe");
    private void initContent() {
        pane.setPadding(new Insets(25));
        pane.setHgap(5);
        pane.setVgap(5);


        Label lblHeader = new Label("Computer Science is colorful");
        pane.add(lblHeader, 0, 0);


        pane.add(btnSubscribe, 0, 1);
        btnSubscribe.setOnAction(event -> subscribeAction());


        pane.add(btnUnsubscribe, 0, 2);
        btnUnsubscribe.setOnAction(event -> unSubscribeAction());

    }

    public void setMainFrame(MainFrame mainFrame) {
          this.mainFrame = mainFrame;

    }
    private void subscribeAction() {
            if (!pane.getChildren().contains(lblInfoSub)) {
                pane.add(this.lblInfoSub, 0, 3);
            }
            pane.setStyle("-fx-background-color: " + mainFrame.getColor() + ";");
            lblInfo.setVisible(false);
            lblInfoSub.setVisible(true);
            isSubscribed = true;
            btnSubscribe.setDisable(true);
            btnUnsubscribe.setDisable(false);
        }


    private void unSubscribeAction() {
        if (!pane.getChildren().contains(lblInfo)) {
            pane.add(lblInfo, 0, 3);
        }
        lblInfoSub.setVisible(false);
        lblInfo.setVisible(true);
        isSubscribed = false;
        btnUnsubscribe.setDisable(true);
        btnSubscribe.setDisable(false);
    }

    @Override
    public void updateColor(String color) {
        if(isSubscribed) {
            pane.setStyle("-fx-background-color: " + color + ";");
        }
    }
}

