package lk.ijse.homewindow.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MaininventoryController {
    public Button btninventoryMachine;
    public Pane inventoryPane;
    public Button btnInventoryDelete;
    public Button btnInventoryMachineUpdate;
    public Button btnSitevehicalAdd;
    public Button btnSiteVehicalDelete;
    public Button btnSiteVehicalUpdate;

    public void setBtnInventoryMachineUpdateOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/inventory/machines/machinUpdate.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnInventoryMachineDeleteOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/inventory/machines/machineDelete.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnInventoryMachinUpdateOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/inventory/machines/machinUpdate.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnSitevehicalAddOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/inventory/siteVehicle/siteaddVehicle.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnSiteVehicalDeleteOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/inventory/siteVehicle/siteVehicleDelete.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnSiteVehicalUpdateOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/inventory/siteVehicle/siteVehicleDetailUpdate.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
