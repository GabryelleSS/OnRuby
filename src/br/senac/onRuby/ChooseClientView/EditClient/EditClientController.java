package br.senac.onRuby.ChooseClientView.EditClient;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditClientController {
    
    private Stage editClient;

    @FXML
    private TextField fieldFirstName;
    @FXML
    private TextField fieldLastName;
    @FXML
    private DatePicker fieldDateBirth;
    @FXML
    private TextField filedCEP;
    @FXML
    private ComboBox<String> fieldGender;
    @FXML
    private ComboBox<String> fieldCivilStatus;
    @FXML
    private TextField fieldCPF;
    @FXML
    private TextField fieldRG;
    @FXML
    private TextField fieldPhone;
    @FXML
    private TextField fieldStreet;
    @FXML
    private TextField fieldNeighborhood;
    @FXML
    private TextField fieldComplement;
    @FXML
    private Button btnBackChooseClient;
    @FXML
    private TextField fieldNumber;
    @FXML
    private TextField fieldCity;
    @FXML
    private ComboBox<String> fieldState;

    public void initialize() {
        fieldGender.getItems().addAll(
            "Feminino",
            "Masculino"
        );
        
        fieldCivilStatus.getItems().addAll(
            "Solteiro(a)",
            "Casado(a)",
            "Separado(a)",
            "Divorciado(a)",
            "Viúvo(a)"
        );
        
        fieldState.getItems().addAll(
            "AC",
            "AL",
            "AM",
            "AP",
            "BA",
            "CE",
            "DF",
            "ES",
            "GO",
            "MA",
            "MG",
            "MS",
            "MT",
            "PA",
            "PB",
            "PE",
            "PI",
            "PR",
            "RJ",
            "RN",
            "RO",
            "RR",
            "RS",
            "SC",
            "SE",
            "SP",
            "TO"
        );
    }

    @FXML
    private void btnBackChooseClientView(ActionEvent event) {
        try {
            if(editClient == null || !editClient.isShowing()) {
                Parent chooseConsultClient = FXMLLoader.load(
                    getClass().getResource(
                        "/br/senac/onRuby/ChooseClientView/ConsultClient/ConsultClient.fxml"
                    )
                );

                editClient = new Stage();
                Scene scene = new Scene(chooseConsultClient);

                editClient.setScene(scene);
                editClient.setTitle("Player");
                editClient.show();

                Stage stage = (Stage) btnBackChooseClient.getScene().getWindow();
                stage.close();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setContentText("Ocorreu um erro ao voltar a tela");
            alert.showAndWait();
        }
    }

    @FXML
    private void editClient(ActionEvent event) {
        
    }
    
}
