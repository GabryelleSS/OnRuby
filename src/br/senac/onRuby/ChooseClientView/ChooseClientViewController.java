package br.senac.onRuby.ChooseClientView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ChooseClientViewController {
    
    private Stage clientStage;
    @FXML
    private Button btnBackHome;

    @FXML
    private void btnRegisterClient() throws Exception {
        if(clientStage == null || !clientStage.isShowing()) {
            Parent ClientRegistration = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/ClientRegistration/ClientRegistration.fxml"
                )
            );
            
            clientStage = new Stage();
            Scene scene = new Scene(ClientRegistration);

            clientStage.setScene(scene);
            clientStage.setTitle("Cadastro de Cliente");
            clientStage.show();
        }
    }

    @FXML
    private void btnConsultClient() throws Exception {
        if(clientStage == null || !clientStage.isShowing()) {
            Parent ClientRegistration = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/ClientRegistration/ClientRegistration.fxml"
                )
            );
            
            clientStage = new Stage();
            Scene scene = new Scene(ClientRegistration);

            clientStage.setScene(scene);
            clientStage.setTitle("Registro de Cliente");
            clientStage.show();
        }
        
    }

    @FXML
    private void btnBackHome() throws Exception {
        Stage stage = (Stage) btnBackHome.getScene().getWindow();
        stage.close();
    }
    
}
