package lk.ijse.homewindow.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginController {
    public Button signbit;
    public PasswordField passText;
    public TextField textName;
    public AnchorPane mainframethisWindow;
    public Label lblWarning;
    public Label lblIncorrectPassword;
    public Hyperlink hyperFogetPass;
    int chance=0;
    Pane registerPane;
    String passValue;

    public void btnSingInOnAction() throws IOException {

        ++chance;

        String check=passText.getText();
        String name=textName.getText();
        int number = Integer.parseInt(check);
        passText.setText("");
        //char passCount1='z';
        int password=404;
        if(password == number && name.equals("zyko")){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/mainWindow/menuWindow.fxml"));
                registerPane = fxmlLoader.load();
                mainframethisWindow.getChildren().clear();
                mainframethisWindow.getChildren().setAll(registerPane);
                System.gc();
            } catch (Exception e) {
                System.out.println("incorrect Password");
                e.printStackTrace();
            }
        }else{
            textName.setText("");
            System.out.println("dose not Exits");
            lblIncorrectPassword.setVisible(true);
            //lblWarning.setVisible(true);
        }
        if(4<=chance){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/login/errorForm.fxml"));
            registerPane=fxmlLoader.load();
            mainframethisWindow.getChildren().clear();
            mainframethisWindow.getChildren().setAll(registerPane);
        }
    }
    public void passOnActionKeyTyped() {
        lblIncorrectPassword.setVisible(false);
        String pass1=passText.getText();
        try{
            int number = Integer.parseInt(pass1);
            System.out.println(number);
            lblWarning.setVisible(false);
        }catch (Exception e){
            lblWarning.setVisible(true);
        }
        if(passText.getText().equals("")){
            lblWarning.setVisible(false);
        }
    }
    public void forgetsOnAction() throws IOException {
        passValue=textName.getText();
        Stage satge=new Stage();
        satge.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../interface/login/passwordForgetwindow.fxml")))));
        satge.getIcons().add(new Image("lk/ijse/homewindow/assepts/20230130_225918.png"));
        satge.setTitle("Hello "+passValue);
        satge.show();
    }
}
