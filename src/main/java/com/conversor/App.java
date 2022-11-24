package com.conversor;

import javafx.application.Application;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.conversor.conversorMonedas.OpcionDeConversion;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        
        OpcionDeConversion conversor = new OpcionDeConversion();

        List <String> options = new ArrayList<>();
        options.add("Moneda");
        options.add("Temperatura");

        ChoiceDialog<String> choiceDialog = new ChoiceDialog<>(options.get(0), options);
        
        choiceDialog.setHeaderText("Elija una opcion de conversion");


        Optional<String> choice = choiceDialog.showAndWait(); 

        switch (choice.get()) {
            case "Moneda":
                System.out.println("LLEGUE AQUI");
                TextInputDialog input = new TextInputDialog();
                input.showAndWait();
                System.out.println(input.getResult());
                conversor.ConvertirMonedas(Double.parseDouble(input.getResult()));
                break;
            default:
                break;
        }

        /* String s = choice.map(c -> "Otro".equals(c) ?
            "Desafortunadamente no esta disponible" : "Bien!")
            .orElse("Que quieres hacer");
        
            System.out.println(s); */
    }


    public static void main(String[] args) {
        while (true) {
            launch(); 
        }
    }

}