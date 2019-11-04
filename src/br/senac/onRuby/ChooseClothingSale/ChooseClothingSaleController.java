package br.senac.onRuby.ChooseClothingSale;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ChooseClothingSaleController {
    
    private Stage ChooseClothingSale;
    @FXML
    private Button btnBackHome;

    @FXML
    private void btnConsultSale() throws Exception {
        if(ChooseClothingSale == null || !ChooseClothingSale.isShowing()) {
            Parent consultClothingSale = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/ChooseClothingSale/ConsultClothingSale/ConsultClothingSale.fxml"
                )
            );
            
            ChooseClothingSale = new Stage();
            Scene scene = new Scene(consultClothingSale);

            ChooseClothingSale.setScene(scene);
            ChooseClothingSale.setTitle("Consultar Venda");
            ChooseClothingSale.show();
        }
        
        Stage stage = (Stage) btnBackHome.getScene().getWindow();
        stage.close();
    }
    

    @FXML
    private void btnRegisterSale() throws Exception {
        if(ChooseClothingSale == null || !ChooseClothingSale.isShowing()) {
            Parent registerClothesSale = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/ChooseClothingSale/RegisterSaleClothes/RegisterSaleClothes.fxml"
                )
            );
            
            ChooseClothingSale = new Stage();
            Scene scene = new Scene(registerClothesSale);

            ChooseClothingSale.setScene(scene);
            ChooseClothingSale.setTitle("Cadastrar Roupas");
            ChooseClothingSale.show();
        }
        
        Stage stage = (Stage) btnBackHome.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void btnBackHome() throws Exception {
        if(ChooseClothingSale == null || !ChooseClothingSale.isShowing()) {
            Parent chooseClient = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/Home/Home.fxml"
                )
            );
            
            ChooseClothingSale = new Stage();
            Scene scene = new Scene(chooseClient);

            ChooseClothingSale.setScene(scene);
            ChooseClothingSale.setTitle("Home");
            ChooseClothingSale.show();
        }
        
        Stage stage = (Stage) btnBackHome.getScene().getWindow();
        stage.close();
    }
}
