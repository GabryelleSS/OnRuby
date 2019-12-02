package br.senac.onRuby.ChooseClothingSale.RegisterSaleClothes;

import br.senac.onRuby.ChooseClothingSale.RegisterSaleClothes.DataRegisterClothes;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterSaleClothesController {
    
    private Stage RegisterClothingSale;
    @FXML
    private Button btnBackChooseClothes;
    @FXML
    private TextField fieldCodClient;
    @FXML
    private TextField fieldCodClothes;
    @FXML
    private TextField fieldQuanClothes;
    @FXML
    private TableView<String> tableSaleClothes;
    
    @FXML
    private void btnBackChooseClothes() throws Exception {
        if(RegisterClothingSale == null || !RegisterClothingSale.isShowing()) {
            Parent chooseClient = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/ChooseClothingSale/ChooseClothingSale.fxml"
                )
            );
            
            RegisterClothingSale = new Stage();
            Scene scene = new Scene(chooseClient);

            RegisterClothingSale.setScene(scene);
            RegisterClothingSale.setTitle("Player");
            RegisterClothingSale.show();
        }
        Stage stage = (Stage) btnBackChooseClothes.getScene().getWindow();
        stage.close();
    }
    
    @FXML
    private void btnClearFields(ActionEvent event) {
        fieldCodClient.setText("");
        fieldCodClothes.setText("");
        fieldQuanClothes.setText("");
    }

    @FXML
    private void btnFinishSale(ActionEvent event) {
    }

    @FXML
    private void btnSearch(ActionEvent event) {
    }
}