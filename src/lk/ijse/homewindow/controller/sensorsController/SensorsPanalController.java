package lk.ijse.homewindow.controller.sensorsController;

import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

public class SensorsPanalController {
    public Slider sliderWaterLevel;

    public void sliderWaterLevelOnAction(MouseEvent mouseEvent) {
        SensorsPopUpContriller sensorsPopUpContriller=new SensorsPopUpContriller();
        int sliderValue = (int) sliderWaterLevel.getValue();
        //System.out.println(sliderValue);
        sensorsPopUpContriller.setWaterLevel(sliderValue);

    }
}
