
package br.senac.onRuby.Trade;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;

public class TradeController implements Initializable {

    @FXML
    private TextField imputQuant;
    @FXML
    private TitledPane listProdSelecionado;
    @FXML
    private ComboBox<String> listCostumer;
    @FXML
    private ComboBox<String> listCategory;
    @FXML
    private DatePicker Date;
    @FXML
    private TextField imputName;
    @FXML
    private TitledPane listItem;
           
    @Override
    public void initialize(URL location, ResourceBundle resources){
        ObservableList<String> list = FXCollections.observableArrayList("Lucas", "João", "Jorge");
        listCostumer.setItems(list);
        
        ObservableList<String> list2 = FXCollections.observableArrayList("Mini Saia", "Oculos", "Tenis");
        listCategory.setItems(list2);
    }
    
    @FXML
    private void BuySelectedItem(ActionEvent event) {
        
    }

    @FXML
    private void BackPreviousScreen(ActionEvent event) {
        
    }

    @FXML
    private void Filter(ActionEvent event) {
        Label label = new Label(listCategory.getValue());
        listItem.setContent(label);
    }

    @FXML
    private void Select(ActionEvent event) {
        
    }
    
}
