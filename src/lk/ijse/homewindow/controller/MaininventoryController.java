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
    public Button btnEmployeeEquipment;
    public Button btnEmployeeEquipmentDelete;
    public Button btnEmployeeEquipmentUpdate;
    public Button btnInventoryChemicalAdd;
    public Button btnInventoryChemicalDelete;
    public Button btnInventoryCemicalUpdate;
    public Button btnInventoryCemicalIncormation;
    public Button btnInventoryCompostUpdate;

    public void setBtnInventoryMachineUpdateOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/inventory/machine/machineAdd.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/inventory/machine/machineDelete.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/inventory/machine/machineUdate.fxml"));
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

    public void btnEmployeeEquipmentOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/inventory/employeeEquipment/equipmentAdd.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnEmployeeEquipmentDeleteOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/inventory/employeeEquipment/equipentDelete.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnEmployeeEquipmentUpdateOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/inventory/employeeEquipment/employeeEqupmentUpdate.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnInventoryCemicalAddOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/inventory/chemcal/cemicalAdd.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnInventoryCemicalDelete(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/inventory/chemcal/cemicalDelete.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnInventoryCemicalUpdateOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/inventory/chemcal/cemicalUpdate.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnInventoryCompostInformationOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/inventory/compost/compostGetInfo.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            inventoryPane.getChildren().clear();
            inventoryPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnInventoryCompostUpdateOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/inventory/compost/compostUpdate.fxml"));
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
