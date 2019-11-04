package br.senac.onRuby.ChooseClothingSale.RegisterSaleClothes;

import br.senac.onRuby.Mock.MockClothing;
import br.senac.onRuby.ChooseClothingSale.RegisterSaleClothes.DataRegisterClothes;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class RegisterSaleClothesController {
    
    private Stage RegisterClothingSale;
    
    @FXML
    private Button btnBackChooseClothes;
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

    @FXML
    private void btnBackChooseClothes() throws Exception {
        if(RegisterClothingSale == null || !RegisterClothingSale.isShowing()) {
            Parent chooseClothingSale = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/ChooseClothingSale/ChooseClothingSale.fxml"
                )
            );
            
            RegisterClothingSale = new Stage();
            Scene scene = new Scene(chooseClothingSale);

            RegisterClothingSale.setScene(scene);
            RegisterClothingSale.setTitle("Escolha o que deseja fazer!");
            RegisterClothingSale.show();
        }
        
        Stage stage = (Stage) btnBackChooseClothes.getScene().getWindow();
        stage.close();
    }

    private void insertClothes(DataRegisterClothes dataRegisterClothes) {
        try {
            MockClothing.clothesInsert(dataRegisterClothes);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Produto inserido");
            alert.setContentText("o produto foi inserida com sucesso!");
            alert.showAndWait();
        }
        catch(Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setContentText("Ocorreu um erro ao inserir o produto");
            alert.showAndWait();
        }
    }

    @FXML
    private void btnInsertClothes(ActionEvent event) {
        DataRegisterClothes dataRegisterClothes = new DataRegisterClothes(); 
        
        insertClothes(dataRegisterClothes);
    }
}
