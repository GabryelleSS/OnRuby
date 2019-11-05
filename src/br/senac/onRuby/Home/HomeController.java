package br.senac.onRuby.Home;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomeController {
    
    private Stage homeStage;

    @FXML
    private Button btnClient;
    @FXML
    private Button btnCloseHome;

    @FXML
    private void btnCloseHome(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void btnOpenClientView() throws Exception {
        if(homeStage == null || !homeStage.isShowing()) {
            Parent consult = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/ChooseClientView/ChooseClientView.fxml"
                )
            );
            
            homeStage = new Stage();
            Scene scene = new Scene(consult);
            
            homeStage.setScene(scene);
            homeStage.setTitle("Player");
            homeStage.show();
        }
       
        Stage stage = (Stage) btnCloseHome.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void btnOpenClothingSale() throws Exception {
        if(homeStage == null || !homeStage.isShowing()) {
            Parent choosenClothingSale = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/ChooseClothingSale/ChooseClothingSale.fxml"
                )
            );
            
            homeStage = new Stage();
            Scene scene = new Scene(choosenClothingSale);
            
            homeStage.setScene(scene);
            homeStage.setTitle("Baú de Tesouro");
            homeStage.show();
        }
       
        Stage stage = (Stage) btnCloseHome.getScene().getWindow();
        stage.close();
        
    }

    @FXML
    private void btnOpenStockView() throws Exception {
        if(homeStage == null || !homeStage.isShowing()) {
            Parent stockRegistration = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/StockRegistration/StockRegistration.fxml"
                )
            );
            
            homeStage = new Stage();
            Scene scene = new Scene(stockRegistration);
            
            homeStage.setScene(scene);
            homeStage.setTitle("Estoque");
            homeStage.show();
        }
       
        Stage stage = (Stage) btnCloseHome.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void btnOpenReportView(ActionEvent event) {
    }
   
}
