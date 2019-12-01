package br.senac.onRuby.ChooseClientView.EditClient;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class EditClientController {

    @FXML
    private TextField fieldFirstName;
    @FXML
    private TextField fieldLastName;
    @FXML
    private DatePicker fieldDateBirth;
    @FXML
    private TextField filedCEP;
    @FXML
    private ComboBox<?> fieldGender;
    @FXML
    private ComboBox<?> fieldCivilStatus;
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
    private ComboBox<?> fieldState;

    @FXML
    private void registerCustomer(ActionEvent event) {
    }

    @FXML
    private void btnBackChooseClientView(ActionEvent event) {
    }
    
}
