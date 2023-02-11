package lk.ijse.homewindow.controller.sensorsController;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class SensorPanal2Controller {

    SensorsPopUpContriller sensorsPopUpContriller=new SensorsPopUpContriller();

    private int result2;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblTemp;

    @FXML
    private Slider tempSlider;

    @FXML
    void initialize() {
        assert lblTemp != null : "fx:id=\"lblTemp\" was not injected: check your FXML file 'sensorPanal2.fxml'.";
        assert tempSlider != null : "fx:id=\"tempSlider\" was not injected: check your FXML file 'sensorPanal2.fxml'.";

        tempSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                int result= (int) tempSlider.getValue();
                result2=result;
                lblTemp.setText(result+"");
                sensorsPopUpContriller.setLblWater(result);
            }
        });
    }
}
