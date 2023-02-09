package lk.ijse.homewindow.controller.sensorsController;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SensorsPopUpContriller {
    public Button btnsensorPanel;

    public void btnsensorPanelOnAction(ActionEvent actionEvent) throws IOException {
        Stage satge=new Stage();
        satge.setScene(new Scene(FXMLLoader.load(getClass().getResource("../../sensors/sensorsPanal.fxml"))));
        satge.getIcons().add(new Image("lk/ijse/homewindow/assepts/20230130_225918.png"));
        satge.setTitle("pile id : su01");
        satge.show();
    }
}
