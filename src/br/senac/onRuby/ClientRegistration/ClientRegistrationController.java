package br.senac.onRuby.ClientRegistration;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ClientRegistrationController implements Initializable {

    @FXML
    private TextField fieldFirstName;
    @FXML
    private TextField fieldLastName;
    @FXML
    private TextField fieldRG;
    @FXML
    private TextField fieldCPF;
    @FXML
    private TextField fieldPhone;
    @FXML
    private TextField filedCEP;
    @FXML
    private TextField fieldStreet;
    @FXML
    private TextField fieldNeighborhood;
    @FXML
    private TextField fieldNumber;
    @FXML
    private TextField fieldCity;
    @FXML
    private TextField fieldStates;
    @FXML
    private TextField fieldComplement;
    @FXML
    private Button btnBackChooseClient;
    @FXML
    private Pane paneNotificationWarning;
    @FXML
    private Text contentNotificationWarning;
    @FXML
    private Label titleNotificationWarning;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void registerCustomer(ActionEvent event) {
        String firstNameClient = fieldFirstName.getText();
        String lastNameClient = fieldLastName.getText();
        
        boolean checkFirstNameEmpty = firstNameClient.trim().isEmpty();
        boolean checkLastNameEmpty = lastNameClient.trim().isEmpty();
        
        if(firstNameClient == null || checkFirstNameEmpty) {
            titleNotificationWarning.setText("Cuidado!");
            contentNotificationWarning.setText("O campo \"Nome\" é obrigatório, por gentileza preencha!");
            paneNotificationWarning.setVisible(true);
        }
        else if(lastNameClient == null || checkLastNameEmpty) {
            titleNotificationWarning.setText("Cuidado!");
            contentNotificationWarning.setText("O campo \"Sobrenome\" é obrigatório, por gentileza preencha!");
            paneNotificationWarning.setVisible(true);
        }
        else {
            titleNotificationWarning.setText("Concluído!");
            contentNotificationWarning.setText("Player criado!");
            paneNotificationWarning.setVisible(true);
            
            fieldFirstName.setText("");
            fieldLastName.setText("");
        }
    }

    @FXML
    private void btnBackChooseClientView(ActionEvent event) {
        Stage stage = (Stage) btnBackChooseClient.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void btnConfirmNotificationWarning(ActionEvent event) {
        paneNotificationWarning.setVisible(false);
    }
    
}
