package br.senac.onRuby.StockRegistration.RegisterClothes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterClothesController {
    
    private Stage registerClothes;
    
    @FXML
    private ComboBox<String> clothingCategory;
    @FXML
    private ComboBox<String> sizeClothing;
    @FXML
    private Button btnBackChooseClothes;
    @FXML
    private TextField clothesQuantClothes;
    @FXML
    private TextField clothesPrice;
    @FXML
    private TextField clothesName;
    @FXML
    private TextArea clothesDescription;
    
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

    @FXML
    private void btnBackChooseClothes(ActionEvent event) {
        try {
            if(registerClothes == null || !registerClothes.isShowing()) {
                Parent chooseClient = FXMLLoader.load(
                    getClass().getResource(
                        "/br/senac/onRuby/StockRegistration/ChooseProductRegister.fxml"
                    )
                );

                registerClothes = new Stage();
                Scene scene = new Scene(chooseClient);

                registerClothes.setScene(scene);
                registerClothes.setTitle("Estoque");
                registerClothes.show();
            }
            Stage stage = (Stage) btnBackChooseClothes.getScene().getWindow();
            stage.close();
        }
        catch(Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setContentText("É necessário selecionar um cliente");
            alert.showAndWait();
        }
    }

    @FXML
    private void btnSaveClothes(ActionEvent event) {
    }

    @FXML
    private void clearFields(ActionEvent event) {
        clothingCategory.valueProperty().set("Selecione a categoria");
        sizeClothing.valueProperty().set("Selecione o tamanho");
        clothesQuantClothes.setText("");
        clothesPrice.setText("");
        clothesName.setText("");
        clothesDescription.setText("");
    }
}
