package br.senac.onRuby.ChooseClientView.ConsultClient;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ConsultClientController {
    
    private Stage consultClientStage;
    @FXML
    private TextField fielSearchClient;
    @FXML
    private Button btnBackChooseClient;

    @FXML
    private void btnSearchClient(ActionEvent event) {
        String dataClient = fielSearchClient.getText();
        boolean checkDataClientEmpty = dataClient.trim().isEmpty();
        
        if(dataClient == null || checkDataClientEmpty) {
            System.out.println("Hey");
        }
    }

    @FXML
    private void btnClearFieldSearch(ActionEvent event) {
        fielSearchClient.setText("");
    }

    @FXML
    private void btnBackChooseClient() throws Exception {
        if(consultClientStage == null || !consultClientStage.isShowing()) {
            Parent chooseClient = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/ChooseClientView/ChooseClientView.fxml"
                )
            );
            
            consultClientStage = new Stage();
            Scene scene = new Scene(chooseClient);

            consultClientStage.setScene(scene);
            consultClientStage.setTitle("Player");
            consultClientStage.show();
            
            Stage stage = (Stage) btnBackChooseClient.getScene().getWindow();
            stage.close();
        }
    }
    
}
