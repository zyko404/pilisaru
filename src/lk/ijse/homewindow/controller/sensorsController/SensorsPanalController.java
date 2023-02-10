package lk.ijse.homewindow.controller.sensorsController;

import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

public class SensorsPanalController {

    public Slider sliderWaterLevel;
    public void sliderWaterLevelOnAction(MouseEvent mouseEvent) {
        System.out.println(sliderWaterLevel.getValue());
    }
}
