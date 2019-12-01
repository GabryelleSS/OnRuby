package br.senac.onRuby.ChooseProductView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ChooseProductController {
    
    private Stage chooseProduct;
    @FXML
    private Button btnBackHome;
    
    private void btnRegister() {
        try {
            if(chooseProduct == null || !chooseProduct.isShowing()) {
                Parent registerClothes = FXMLLoader.load(
                    getClass().getResource(
                        "/br/senac/onRuby/Home/Home.fxml"
                    )
                );

                chooseProduct = new Stage();
                Scene scene = new Scene(registerClothes);

                chooseProduct.setScene(scene);
                chooseProduct.setTitle("Cadastrar Venda");
                chooseProduct.show();
            }
            Stage stage = (Stage) btnBackHome.getScene().getWindow();
            stage.close();
        }
        catch(Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setContentText("Ocorreu um erro ao voltar entrar na tela");
            alert.showAndWait();
        }
    }

    @FXML
    private void btnBackHome() throws Exception {
        if(chooseProduct == null || !chooseProduct.isShowing()) {
            Parent chooseClient = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/Home/Home.fxml"
                )
            );
            
            chooseProduct = new Stage();
            Scene scene = new Scene(chooseClient);

            chooseProduct.setScene(scene);
            chooseProduct.setTitle("Home");
            chooseProduct.show();
        }
        
        Stage stage = (Stage) btnBackHome.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void btnConsultSale(ActionEvent event) {
    }
}
