package br.senac.onRuby.ChooseClientView.ClientRegistration;

import br.senac.onRuby.ChooseClientView.Client;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ClientRegistrationController {

    private Stage ClientRegistrationStage;
    @FXML
    private TextField fieldFirstName;
    @FXML
    private TextField fieldLastName;
    @FXML
    private DatePicker fieldDateBirth;
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
    @FXML
    private ComboBox<String> fieldGender;

    private Client client = new Client();
    
    public void initialize() {
        fieldGender.getItems().addAll(
            "Feminino",
            "Masculino"
        );
    }

    @FXML
    private void registerCustomer(ActionEvent event) throws Exception {
        client.setFirstName(fieldFirstName.getText());
        client.setLastName(fieldLastName.getText());
        
        boolean checkFirstNameEmpty = client.getFirstName().trim().isEmpty();
        boolean checkLastNameEmpty = client.getLastName().trim().isEmpty();
        
        if(client.getFirstName() == null || checkFirstNameEmpty) {
            titleNotificationWarning.setText("Cuidado!");
            contentNotificationWarning.setText("O campo \"Nome\" é obrigatório, por gentileza preencha!");
            paneNotificationWarning.setVisible(true);
        }
        else if(client.getLastName() == null || checkLastNameEmpty) {
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
    private void btnBackChooseClientView() throws Exception {
        if(ClientRegistrationStage == null || !ClientRegistrationStage.isShowing()) {
            Parent clientRegistration = FXMLLoader.load(
                getClass().getResource(
                    "/br/senac/onRuby/ChooseClientView/ChooseClientView.fxml"
                )
            );
            
            ClientRegistrationStage = new Stage();
            Scene scene = new Scene(clientRegistration);

            ClientRegistrationStage.setScene(scene);
            ClientRegistrationStage.setTitle("Player");
            ClientRegistrationStage.show();
        
            Stage stage = (Stage) btnBackChooseClient.getScene().getWindow();
            stage.close();
        }
    }

    @FXML
    private void btnConfirmNotificationWarning(ActionEvent event) {
        paneNotificationWarning.setVisible(false);
    }
    
}
