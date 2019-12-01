package br.senac.onRuby.ChooseClientView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ChooseClientViewController {

    private Stage ChooseClientViewStage;
    private Stage clientStage;
    @FXML
    private Button btnBackHome;
    @FXML
    private Button btnCloseRegisterClient;
    @FXML
    private Button btnCloseConsultClient;

    @FXML
    private void btnRegisterClient() throws Exception {
        if (clientStage == null || !clientStage.isShowing()) {
            Parent ClientRegistration = FXMLLoader.load(
                    getClass().getResource(
                            "/br/senac/onRuby/ChooseClientView/ClientRegistration/ClientRegistration.fxml"
                    )
            );

            clientStage = new Stage();
            Scene scene = new Scene(ClientRegistration);

            clientStage.setScene(scene);
            clientStage.setTitle("Cadastro de Cliente");
            clientStage.show();
        }

        Stage stage = (Stage) btnCloseRegisterClient.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void btnConsultClient() throws Exception {
        if(clientStage == null || !clientStage.isShowing()) {
            Parent consultClient = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/ChooseClientView/ConsultClient/ConsultClient.fxml"
                )
            );

            clientStage = new Stage();
            Scene scene = new Scene(consultClient);

            clientStage.setScene(scene);
            clientStage.setTitle("Registro de Cliente");
            clientStage.show();
        }

        Stage stage = (Stage) btnCloseConsultClient.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void btnBackHome() throws Exception {
        if (ChooseClientViewStage == null || !ChooseClientViewStage.isShowing()) {
            Parent chooseClient = FXMLLoader.load(
                    getClass().getResource(
                            "/br/senac/onRuby/Home/Home.fxml"
                    )
            );

            ChooseClientViewStage = new Stage();
            Scene scene = new Scene(chooseClient);

            ChooseClientViewStage.setScene(scene);
            ChooseClientViewStage.setTitle("Home");
            ChooseClientViewStage.show();
        }

        Stage stage = (Stage) btnBackHome.getScene().getWindow();
        stage.close();
    }

}
