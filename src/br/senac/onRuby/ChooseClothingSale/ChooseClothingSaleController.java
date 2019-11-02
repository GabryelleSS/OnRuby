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
    private void btnConsultSale(ActionEvent event) {
    }

    @FXML
    private void btnRegisterSale(ActionEvent event) {
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
