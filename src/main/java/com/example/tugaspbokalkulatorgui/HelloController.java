package com.example.tugaspbokalkulatorgui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    TextField angka1 = new TextField();
    @FXML
    TextField angka2 = new TextField();
    @FXML
    Label hasil = new Label();
    @FXML
    Button tambah = new Button();
    @FXML
    Button kurang = new Button();
    @FXML
    Button kali = new Button();
    @FXML
    Button bagi = new Button();
    @FXML
    Button modulus = new Button();

    @FXML
    protected void tambahAction(){
        try{
            double angkasatu, angkadua;
            angkasatu = Double.valueOf(angka1.getText());
            angkadua = Double.valueOf(angka2.getText());
            if((angkasatu+angkadua)%1==0.0){
                hasil.setText("Hasil : "+(int)(angkasatu+angkadua));
            }
            else{
                hasil.setText("Hasil : "+(angkasatu+angkadua));
            }
        }catch (NumberFormatException e){
            hasil.setText("anda memasukan data yang salah");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @FXML
    protected void kurangAction(){
        try{
            double angkasatu, angkadua;
            angkasatu = Double.valueOf(angka1.getText());
            angkadua = Double.valueOf(angka2.getText());
            if((angkasatu+angkadua)%1==0.0){
                hasil.setText("Hasil : "+(int)(angkasatu-angkadua));
            }
            else{
                hasil.setText("Hasil : "+(angkasatu-angkadua));
            }
        }catch (NumberFormatException e){
            hasil.setText("anda memasukan data yang salah");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @FXML
    protected void kaliAction(){
        try{
            double angkasatu, angkadua;
            angkasatu = Double.valueOf(angka1.getText());
            angkadua = Double.valueOf(angka2.getText());
            if((angkasatu+angkadua)%1==0.0){
                hasil.setText("Hasil : "+(int)(angkasatu*angkadua));
            }
            else{
                hasil.setText("Hasil : "+(angkasatu*angkadua));
            }
        }catch (NumberFormatException e){
            hasil.setText("anda memasukan data yang salah");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @FXML
    protected void bagiAction(){
        try{
            double angkasatu, angkadua;
            angkasatu = Double.valueOf(angka1.getText());
            angkadua = Double.valueOf(angka2.getText());
            if((angkasatu+angkadua)%1==0.0){
                hasil.setText("Hasil : "+(int)(angkasatu/angkadua));
            }
            else{
                hasil.setText("Hasil : "+(angkasatu/angkadua));
            }
        }catch (NumberFormatException e){
            hasil.setText("anda memasukan data yang salah");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @FXML
    protected void modulusAction(){
        try{
            double angkasatu, angkadua;
            angkasatu = Double.valueOf(angka1.getText());
            angkadua = Double.valueOf(angka2.getText());
            if((angkasatu+angkadua)%1==0.0){
                hasil.setText("Hasil : "+(int)(angkasatu%angkadua));
            }
            else{
                hasil.setText("Hasil : "+(angkasatu%angkadua));
            }
        }catch (NumberFormatException e){
            hasil.setText("anda memasukan data yang salah");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}