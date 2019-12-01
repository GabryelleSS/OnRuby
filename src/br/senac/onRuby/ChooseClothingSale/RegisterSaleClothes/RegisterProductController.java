/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.onRuby.ChooseClothingSale.RegisterSaleClothes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author gabry
 */
public class RegisterProductController implements Initializable {

    @FXML
    private ComboBox<String> productCategory;
    @FXML
    private ComboBox<String> sizeProduct;
    @FXML
    private Button btnBackChooseClothes;
    @FXML
    private ComboBox<String> productDiscount;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnBackChooseProduct(ActionEvent event) {
    }

    @FXML
    private void btnSaveClothes(ActionEvent event) {
    }
    
}
