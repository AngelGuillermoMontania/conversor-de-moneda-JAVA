package com.conversor.conversorMonedas;

import java.util.Optional;

import javafx.scene.control.Alert;
/* import javafx.scene.control.DialogPane; */
import javafx.scene.control.ButtonType;

public class ConvertirMonedas {
    
    public void ConvertirPesosArgentinosADolares(double valor) {
        double monedaDolar = valor / 306.00;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        /* Dialog<String> view = new Dialog<>();
        view.setTitle("tienes " + monedaDolar + "dolares");
        ButtonType btn = new ButtonType("dnsa");
        DialogPane nuevo = new DialogPane();
        view.setDialogPane(nuevo); */
        Alert msj = new Alert(Alert.AlertType.CONFIRMATION);
        msj.setContentText("tienes " + monedaDolar + "dolares");
        Optional<ButtonType> resultado = msj.showAndWait();
        if (resultado.isPresent())
        {
            if (resultado.get() == ButtonType.OK) {
                msj.close();
            } else {
                System.out.println("hdsja");
            }
        }
        
    }

}
