package br.senac.onRuby.ConsultClient;

import br.senac.onRuby.ChooseClientView.Client;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author gabryelle.ssantos
 */
public class ConsultClientController implements Initializable {

    private Stage consultClientStage;
    @FXML
    private TableView<Client> tabletClient;
    @FXML
    private TableColumn<Client, String> columCPF;
    @FXML
    private TableColumn<Client, String> columName;
    @FXML
    private TableColumn<Client, String> columPhone;
    @FXML
    private TextField fielSearchClient;
    @FXML
    private Button btnBackChooseClient;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnSearchClient(ActionEvent event) {      
        
    }

    @FXML
    private void btnClearFieldSearch(ActionEvent event) {
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
    
    private List listSearch() {
        List result;
        
        try {
            //Se há dados para pesquisa, faz uma busca pelo valor no mock
            //Caso contrário, faz a listagem
            if (fielSearchClient.getText().equals("")) {
                result = Client.list();
            }
            else {
                result = Client.search(fielSearchClient.getText());                
            }
        }
        catch(Exception e) {
            e.printStackTrace();
            result = null;
        }
        return result;
    }
    
}
