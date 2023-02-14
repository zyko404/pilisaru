package lk.ijse.homewindow.controller.sensorsController;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class SensorPanal2Controller extends Thread {

    SensorsPopUpContriller sensorsPopUpContriller;

    @FXML
    public Label lblTemp;

    @FXML
    private Slider tempSlider;

    @FXML
    void initialize() {

        tempSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                int result = (int) tempSlider.getValue();
                sensorsPopUpContriller = new SensorsPopUpContriller();
                lblTemp.setText(result + "C");
                sensorsPopUpContriller.setLblTemp(result + "");
            }
        });
    }
}
