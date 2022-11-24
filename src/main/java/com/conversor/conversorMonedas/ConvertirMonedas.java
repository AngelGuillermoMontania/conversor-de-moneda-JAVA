package com.conversor.conversorMonedas;

import javafx.scene.control.Dialog;
/* import javafx.scene.control.DialogPane; */

public class ConvertirMonedas {
    
    public void ConvertirPesosArgentinosADolares(double valor) {
        double monedaDolar = valor / 306.00;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        Dialog<String> view = new Dialog<>();
        view.setTitle("tienes " + monedaDolar + "dolares");
        view.showAndWait();
    }

}
