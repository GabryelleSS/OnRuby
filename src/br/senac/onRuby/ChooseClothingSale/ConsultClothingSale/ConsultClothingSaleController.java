package br.senac.onRuby.ChooseClothingSale.ConsultClothingSale;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class ConsultClothingSaleController implements Initializable {

    @FXML
    private Button btnBackToChooseClothingSale;
    @FXML
    private ComboBox<?> clothingCategory;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnBackToChooseClothingSale(ActionEvent event) {
    }
    
}
