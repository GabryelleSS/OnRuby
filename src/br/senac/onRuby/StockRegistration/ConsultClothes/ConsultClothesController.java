package br.senac.onRuby.StockRegistration.ConsultClothes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ConsultClothesController {
    
    private Stage consultClothes;
    @FXML
    private Button btnBackChooseStock;
    @FXML
    private TextField fieldSearchClothes;

    @FXML
    private void btnBackChooseStock(ActionEvent event) {
        try {
            if(consultClothes == null || !consultClothes.isShowing()) {
                Parent chooseClient = FXMLLoader.load(
                    getClass().getResource(
                        "/br/senac/onRuby/StockRegistration/ChooseProductRegister.fxml"
                    )
                );

                consultClothes = new Stage();
                Scene scene = new Scene(chooseClient);

                consultClothes.setScene(scene);
                consultClothes.setTitle("Estoque");
                consultClothes.show();

                Stage stage = (Stage) btnBackChooseStock.getScene().getWindow();
                stage.close();
            }
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
    private void btnClearFields(ActionEvent event) {
        fieldSearchClothes.setText("");
    }
    
}
