package br.senac.onRuby.ChooseClientView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChooseClientViewController {
    
    private Stage clientStage;

    @FXML
    private void btnRegisterClient() throws Exception {
        if(clientStage == null || !clientStage.isShowing()) {
            Parent viewClient = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/CustomerRegistration/CustomerRegistration.fxml"
                )
            );
            
            clientStage = new Stage();
            Scene scene = new Scene(viewClient);

            clientStage.setScene(scene);
            clientStage.setTitle("Cadastro de Cliente");
            clientStage.show();
        }
    }

    @FXML
    private void btnConsultClient() throws Exception {
        if(clientStage == null || !clientStage.isShowing()) {
            Parent viewClient = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/CustomerRegistration/CustomerRegistration.fxml"
                )
            );
            
            clientStage = new Stage();
            Scene scene = new Scene(viewClient);

            clientStage.setScene(scene);
            clientStage.setTitle("Consulta de Cliente");
            clientStage.show();
        }
        
    }
    
}
