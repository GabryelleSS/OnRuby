package br.senac.onRuby.Home;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class HomeController {
    
    private Stage clientStage;
    private Stage saleStage;
    private Stage stockStage;
    private Stage reportStage;

    @FXML
    private Button btnClient;

    @FXML
    private void btnOpenClientView() throws Exception {
        if(clientStage == null || !clientStage.isShowing()) {
            Parent viewClient = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/Question/Question.fxml"
                )
            );
            
            clientStage = new Stage();
            Scene scene = new Scene(viewClient);

            clientStage.setScene(scene);
            clientStage.setTitle("Cliente");
            clientStage.show();
        }
    }

    @FXML
    private void btnOpenSaleView() throws Exception {
        if(saleStage == null || !saleStage.isShowing()) {
            Parent viewSale = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/SaleRegistration/SaleRegistration.fxml"
                )
            );

            saleStage = new Stage();
            Scene scene = new Scene(viewSale);

            saleStage.setScene(scene);
            saleStage.setTitle("Cadastro de Produtos");
            saleStage.show();
        }
    }

    @FXML
    private void btnOpenStockView() throws Exception {
        if(stockStage == null || !stockStage.isShowing()) {
            Parent viewStock = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/StockRegistration/StockRegistration.fxml"
                )
            );

            stockStage = new Stage();
            Scene scene = new Scene(viewStock);

            stockStage.setScene(scene);
            stockStage.setTitle("Cadastro de Estoque");
            stockStage.show();
        }
    }

    @FXML
    private void btnOpenReportView() throws Exception {
        if(reportStage == null || !reportStage.isShowing()) {
            Parent viewReport = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/ReportRegistration/ReportRegistration.fxml"
                )
            );

            reportStage = new Stage();
            Scene scene = new Scene(viewReport);

            reportStage.setScene(scene);
            reportStage.setTitle("Cadastro de Relatórios");
            reportStage.show();
        }
        
    }

    @FXML
    private void btnCloseHome(ActionEvent event) {
        System.exit(0);
    }
    
}
