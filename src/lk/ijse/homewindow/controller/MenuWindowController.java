package lk.ijse.homewindow.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MenuWindowController {
    public AnchorPane mainAncorPane;
    public Button btnHome;
    public Button btnPile;
    public Button btnHealth;
    public Button btnSalary;
    public Button btnVehicle;
    public Button btnSales;
    public Button btnEmployee;
    public Button btnCompost;
    public Button btnInventory;
    public AnchorPane employeeAncorPane;
    public AnchorPane salseAncorPane;
    public AnchorPane vehicleAncorPane;
    public AnchorPane salaryAncorPane;
    public AnchorPane helthAncorPane;
    public ImageView btnGetInfo;
    public Button btnUpdate;
    public Button btnSingOut;

    public void btnHomeOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/homePage/homeForm.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            mainAncorPane.getChildren().clear();
            mainAncorPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnPileOnAction(ActionEvent actionEvent) {
    }

    public void btnHelthOnAction(ActionEvent actionEvent) {
        helthAncorPane.setVisible(true);
    }

    public void btnSalaryOnAction(ActionEvent actionEvent) {
    }

    public void btnVehicleOnAction(ActionEvent actionEvent) {
    }

    public void btnSalesOnAction(ActionEvent actionEvent) {
    }

    public void btnEmployeeOnAction(ActionEvent actionEvent) {
    }

    public void btnCompostOnAction(ActionEvent actionEvent) {
    }

    public void btnInventoruOnAction(ActionEvent actionEvent) {
    }

    public void btnupdateOnAction(ActionEvent actionEvent) throws IOException {//helth
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/employeeInterface/addEmployee.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            mainAncorPane.getChildren().clear();
            mainAncorPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
        helthAncorPane.setVisible(false);
    }
    public void btnGetinfiOnAction(ActionEvent actionEvent) {//helth
        helthAncorPane.setVisible(false);
    }

    public void btnUpdateOnAction(MouseEvent mouseEvent) {

    }
    public void btnSingOutOnAction(ActionEvent actionEvent) throws IOException {
        Stage satge1=new Stage();
        satge1.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../interface/login/LoginForm.fxml")))));
        satge1.getIcons().add(new Image("lk/ijse/homewindow/assepts/20230130_225918.png"));
        satge1.setTitle("Pilisaru Management System");
        satge1.show();
        Stage stage2 = (Stage) btnSingOut.getScene().getWindow();
        stage2.close();
    }
}
