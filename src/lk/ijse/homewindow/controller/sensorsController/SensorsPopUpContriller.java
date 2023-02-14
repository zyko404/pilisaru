package lk.ijse.homewindow.controller.sensorsController;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import lk.ijse.homewindow.controller.SensorCalss;

import java.io.IOException;
import java.util.Objects;

public class SensorsPopUpContriller {
    public Button btnsensorPanel;
    public Label lbltest;


    public void btnsensorPanelOnAction() throws IOException {

        Stage satge=new Stage();
        satge.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../../sensors/sensorPanal2.fxml")))));
        satge.getIcons().add(new Image("lk/ijse/homewindow/assepts/20230130_225918.png"));
        satge.show();
        btnsensorPanel.setDisable(true);
    }
    public void setLblTemp(String value){
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                // me = me + "eee";
//                //...Your code....
//               // System.out.println(value);
//            }
//        }).start();


    }
}
