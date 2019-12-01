package br.senac.onRuby.ChooseClothingSale.ConsultClothingSale;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class ConsultClothingSaleController {
    
    private Stage ConsultClothingSale;

    @FXML
    private Button btnBackToChooseClothingSale;
    @FXML
    private ComboBox<String> clothingCategory;
    
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
     }

    @FXML
    private void btnBackToChooseClothingSale() throws Exception {
        if(ConsultClothingSale == null || !ConsultClothingSale.isShowing()) {
            Parent chooseClothingSale = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/ChooseClothingSale/ChooseClothingSale.fxml"
                )
            );
            
            ConsultClothingSale = new Stage();
            Scene scene = new Scene(chooseClothingSale);

            ConsultClothingSale.setScene(scene);
            ConsultClothingSale.setTitle("Escolha o que deseja fazer!");
            ConsultClothingSale.show();
        }
        
        Stage stage = (Stage) btnBackToChooseClothingSale.getScene().getWindow();
        stage.close();
    }
    
}