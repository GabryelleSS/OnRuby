package br.senac.onRuby.ChooseClientView.ConsultClient;

import br.senac.onRuby.ChooseClientView.Client;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ConsultClientController {
    
    private Stage consultClientStage;
    @FXML
    private TextField fielSearchClient;
    @FXML
    private Button btnBackChooseClient;

    private List<Client> listClient = new ArrayList<Client>();
    
    @FXML
    private TableView<Client> tabletClient;
    @FXML
    private TableColumn<Client, String> columCPF;
    @FXML
    private TableColumn<Client, String> columName;
    @FXML
    private TableColumn<Client, String> columPhone;
    
    public void initialize() {
        //Configura as colunas da tabela
        columCPF.setCellValueFactory(
            new PropertyValueFactory("CPF")
        );        
        columName.setCellValueFactory(
            new PropertyValueFactory("firstName")
        );
        
        //Configura os elementos do combo
        columPhone.setCellValueFactory(
            new PropertyValueFactory("phone")
        );
    }
    
    @FXML
    private void btnSearchClient(ActionEvent event) throws Exception {
        tabletClient.getItems().clear(); 
        
        List result = listSearchClient();
        
        tabletClient.setItems(FXCollections.observableArrayList(listClient));       
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
    
    private List listSearchClient() {
        List result;
        
        try {
            if(txtPesquisa.getText().equals("")) {
                result = DaoCliente.listar();
            }
            else {
                result = DaoCliente.procurar(txtPesquisa.getText());                
            }
        }
        catch(Exception e) {
            e.printStackTrace();
            result = null;
        }
        return result;
    }
    
}
