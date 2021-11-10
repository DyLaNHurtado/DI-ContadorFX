package com.dylanhurtado.contadorfx;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class View extends VBox {
    private int cont;
    private Button btnMas;
    private Button btnMenos;
    private Label label;
    private HBox keyboard;
    public View(){
        cont=0;
        label = new Label("0");
        btnMas = new Button("Incrementar");
        btnMenos = new Button("Decrementar");
        keyboard =new HBox();
        initView();
    }

    private void initView(){
        btnMas.setOnAction((ActionEvent e)-> {
            cont+=1;
            label.setText(""+cont);
        });
        btnMenos.setOnAction((ActionEvent e)->{
            cont-=1;
            label.setText(""+cont);
        });
        this.getChildren().add(label);
        label.setMaxWidth(Double.MAX_VALUE);
        label.setAlignment(Pos.CENTER);
        keyboard.getChildren().addAll(btnMenos,btnMas);
        this.getChildren().add(keyboard);

    }






}
