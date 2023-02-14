package lk.ijse.homewindow.controller.sensorsController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SensorsPopUpContriller {
    public Button btnsensorPanel;
    public Label lbltest;

    public void btnsensorPanelOnAction() throws IOException {
        //lblWater.setText("worked");
        Stage satge=new Stage();
        satge.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../../sensors/sensorPanal2.fxml")))));
        satge.getIcons().add(new Image("lk/ijse/homewindow/assepts/20230130_225918.png"));
        satge.show();
        btnsensorPanel.setDisable(true);
    }

    @FXML
    void initialize(String temp) {
        System.out.println("called initialize");
        System.out.println(temp);
    }
    public void setLblTemp(String value){
        initialize(value);
    }
}
