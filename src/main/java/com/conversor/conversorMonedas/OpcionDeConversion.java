package com.conversor.conversorMonedas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.scene.control.ChoiceDialog;

public class OpcionDeConversion {

    ConvertirMonedas monedas = new ConvertirMonedas();
    
    public void ConvertirMonedas(double valor) {
        List <String> options = new ArrayList<>();
        options.add("De peso a Dolar");
    
        ChoiceDialog<String> dialog = new ChoiceDialog<>(options.get(0), options);
        
        dialog.setHeaderText("Elija una opcion de conversion");
    
    
        Optional<String> choice = dialog.showAndWait(); 


        switch (choice.get()) {
            case "De peso a Dolar":
                monedas.ConvertirPesosArgentinosADolares(valor);;
                break;
        
            default:
                break;
        }
    }

}
