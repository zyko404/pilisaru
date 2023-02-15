package lk.ijse.homewindow.controller;

import javafx.scene.control.Button;

import java.io.IOException;
import java.util.Random;

public class PileInterfaceController {
    public Button btnSu01;
    public Button Su08;
    public Button Su07;
    public Button Su06;
    public Button Su05;
    public Button Su04;
    public Button btnSu03;
    public Button btnSu02;

    private  boolean run=true;
    private final Random random=new Random();
    int r;
    private int count=0;

    public void btnsu01OnAction() throws IOException {

        ++count;

        if (count>2){
            run=false;
        }

        new Thread(() -> {
            while(run) {
                try {
                    Thread.sleep(2000);
                }catch(Exception e){}

                Random ran;
                r=random.nextInt(100);
                System.out.println(r);
                checkValue();
            }
        }).start();

        //getValueController.setValue();
//        Stage satge=new Stage();
//        satge.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../sensors/sensorsPopUp.fxml")))));
//        satge.getIcons().add(new Image("lk/ijse/homewindow/assepts/20230130_225918.png"));
//        satge.setTitle("pile id : su01");
//        satge.show();
    }
    public void checkValue(){
        if (r>37){
              btnSu01.setStyle("-fx-background-color: #e38178");
              btnSu02.setStyle("-fx-background-color: #e38178");
              btnSu03.setStyle("-fx-background-color: #e38178");
              Su04.setStyle("-fx-background-color: #e38178");
              Su05.setStyle("-fx-background-color: #e38178");
              Su07.setStyle("-fx-background-color: #e38178");
              Su08.setStyle("-fx-background-color: #e38178");
              Su06.setStyle("-fx-background-color: #e38178");
        }else {
            btnSu01.setStyle("-fx-background-color: #33bb33");
            btnSu02.setStyle("-fx-background-color: #33bb33");
            btnSu03.setStyle("-fx-background-color: #33bb33");
            Su04.setStyle("-fx-background-color: #33bb33");
            Su05.setStyle("-fx-background-color: #33bb33");
            Su07.setStyle("-fx-background-color: #33bb33");
            Su08.setStyle("-fx-background-color: #33bb33");
            Su06.setStyle("-fx-background-color: #33bb33");
        }
    }
}
