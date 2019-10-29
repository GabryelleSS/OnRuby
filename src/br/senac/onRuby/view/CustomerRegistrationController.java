/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.onRuby.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author gabry
 */
public class CustomerRegistrationController implements Initializable {

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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void registerCustomer(ActionEvent event) {
        String clientFirstName = fieldFirstName.getText();
        String clientLastName = fieldLastName.getText();
        String clientRG = fieldRG.getText();
        String clientCPF = fieldCPF.getText();
        String clientPhone = fieldPhone.getText();
        String clientCEP = filedCEP.getText();
        String clientStreet = fieldStreet.getText();;
        String clientNeighborhood = fieldNeighborhood.getText();
        String clientNumber = fieldNumber.getText();
        String clientCity = fieldCity.getText();
        String clientStates = fieldStates.getText();
//        String clientComplement = fieldComplement.getText();
        
        
        
        fieldFirstName.setStyle("-fx-border-color: red;");
    }
}
