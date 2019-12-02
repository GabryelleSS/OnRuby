package br.senac.onRuby.StockRegistration.RegisterClothes;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class RegisterClothesController {
    
    @FXML
    private ComboBox<String> clothingCategory;
    @FXML
    private ComboBox<String> sizeClothing;
    
    public void initialize() {
         
        clothingCategory.getItems().addAll(
            "Acessório",
            "Bermudas e Shorts",
            "Bijuterias",
            "Blusas e Camisetas",
            "Blusões e Suéteres",
            "Bolsas",
            "Calçados",
            "Calça",
            "Camisas",
            "Casacos e Jaquetas",
            "Coletes",
            "Macacões e Jardineiras",
            "Óculos de Sol",
            "Pijamas",
            "Relógios",
            "Saias",
            "Vestidos"
        );
        
        sizeClothing.getItems().addAll(
            "PP",
            "P",
            "M",
            "G",
            "GG"
        );
     }
}
