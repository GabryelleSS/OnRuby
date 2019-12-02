package br.senac.onRuby.ChooseClientView.ConsultClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ConsultClientController {
    
    private Stage consultClientStage;
    private Stage editClientStage;
    
//    private List<Client> listClient = new ArrayList<Client>();
    
    private boolean editMode = false;
    
//    private Client clientEdit;
    
    @FXML
    private TextField fielSearchClient;
    private Button btnBackChooseClient;    
//    @FXML
//    private TableView<Client> tabletClient;
//    @FXML
//    private TableColumn<Client, String> columCPF;
//    @FXML
//    private TableColumn<Client, String> columName;
//    @FXML
//    private TableColumn<Client, String> columPhone;    
    @FXML
    private TableView<?> tabletClient;
    @FXML
    private TableColumn<?, ?> columCPF;
    @FXML
    private TableColumn<?, ?> columName;
    @FXML
    private TableColumn<?, ?> columPhone;
    
//    public void initialize() {
//        
//        columCPF.setCellValueFactory(
//            new PropertyValueFactory("CPF")
//        );        
//        columName.setCellValueFactory(
//            new PropertyValueFactory("firstName")
//        );
//        columPhone.setCellValueFactory(
//            new PropertyValueFactory("phone")
//        );
//    }
    
//    @FXML
//    private void btnSearchClient(ActionEvent event) {
//        try {
//            tabletClient.getItems().clear(); 
//
//            List result = listSearchClient();
//
//            if(result != null) {
//                tabletClient.setItems(
//                    FXCollections.observableArrayList(result)
//                );
//            } 
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("Erro");
//            alert.setContentText("Dados não encontrados!");
//            alert.showAndWait();
//        }
//    }
    
//    @FXML
//    private void btnEditClient(ActionEvent event) {
//        try {
//            if(editClientStage == null || !editClientStage.isShowing()) {
//
//                Parent editClient = FXMLLoader.load(
//                    getClass().getResource(
//                        "/br/senac/onRuby/ChooseClientView/EditClient/EditClient.fxml"
//                    )
//                );
//
//                editClientStage = new Stage();
//                Scene scene = new Scene(editClient);
//
//                editClientStage.setScene(scene);
//                editClientStage.setTitle("Cliente");
//                editClientStage.show();
//                Stage stage = (Stage) btnBackChooseClient.getScene().getWindow();
//                stage.close();  
//            }
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("Erro");
//            alert.setContentText("É necessário selecionar um cliente");
//            alert.showAndWait();
//        }
//    }
    
//    private void delete(ActionEvent event) {
//        Client client = tabletClient.getSelectionModel().getSelectedItem();
//        
//        if(client != null) {
//            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//            alert.setTitle("Excluir Cliente");
//            alert.setContentText("Excluir o cliente " + client.getFirstName());
//            
//            Optional<ButtonType> result = alert.showAndWait();
//            
//            if(result.get() == ButtonType.OK){
//                try {
//                    btnDeleteClient(client);
//                    btnSearchClient(event);
//                }
//                catch(Exception e) {
//                    e.printStackTrace();
//                    Alert alertErro = new Alert(Alert.AlertType.ERROR);
//                    alertErro.setTitle("Erro");
//                    alertErro.setContentText("Ocorreu um erro ao excluir"
//                            + " o cliente");
//                    alertErro.showAndWait();
//                }
//            }
//        }
//        else {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("Erro");
//            alert.setContentText("É necessário selecionar um cliente");
//            alert.showAndWait();
//        }
//    }
    
//    private void btnDeleteClient(Client client) throws Exception {
//        DaoClient.excluir(client.getIdClient());
//    }

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
    
//    private List listSearchClient() {
//        List result;
//      
//        try {
//            if(fielSearchClient.getText().equals("")) {
//                result = DaoClient.listar();
//            }
//            else {
//                result = DaoClient.procurar(fielSearchClient.getText());                
//            }
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//            result = null;
//        }
//        return result;
//    }

//    @FXML
//    private void btnDeleteClient(ActionEvent event) {
//        try {
//            deletar cliente
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("Erro");
//            alert.setContentText("Ocorreu um erro ao deletar um cliente");
//            alert.showAndWait();
//        }
//    }
}
