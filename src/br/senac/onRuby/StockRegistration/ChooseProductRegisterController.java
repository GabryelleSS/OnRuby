/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.onRuby.StockRegistration;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ChooseProductRegisterController {
    
    private Stage ChooseProductRegister;

    @FXML
    private Button btnBackHome;

    @FXML
    private void btnRegisterProduct(ActionEvent event) {
        try {
            if (ChooseProductRegister == null || !ChooseProductRegister.isShowing()) {
                Parent chooseProductRegister = FXMLLoader.load(
                        getClass().getResource(
                                "/br/senac/onRuby/StockRegistration/RegisterClothes/RegisterClothes.fxml"
                        )
                );

                ChooseProductRegister = new Stage();
                Scene scene = new Scene(chooseProductRegister);

                ChooseProductRegister.setScene(scene);
                ChooseProductRegister.setTitle("Home");
                ChooseProductRegister.show();
            }

            Stage stage = (Stage) btnBackHome.getScene().getWindow();
            stage.close();
        }
        catch(Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setContentText("Ocorreu um erro ao voltar a tela");
            alert.showAndWait();
        }
    }

    @FXML
    private void btnConsultProduct(ActionEvent event) {
        try {
            if (ChooseProductRegister == null || !ChooseProductRegister.isShowing()) {
                Parent chooseProductRegister = FXMLLoader.load(
                        getClass().getResource(
                                "/br/senac/onRuby/StockRegistration/ConsultClothes/ConsultClothes.fxml"
                        )
                );

                ChooseProductRegister = new Stage();
                Scene scene = new Scene(chooseProductRegister);

                ChooseProductRegister.setScene(scene);
                ChooseProductRegister.setTitle("Consultar Produto");
                ChooseProductRegister.show();
            }

            Stage stage = (Stage) btnBackHome.getScene().getWindow();
            stage.close();
        }
        catch(Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setContentText("Ocorreu um erro ao voltar a tela");
            alert.showAndWait();
        }
    }

    @FXML
    private void btnBackHome(ActionEvent event) {
        try {
            if (ChooseProductRegister == null || !ChooseProductRegister.isShowing()) {
                Parent chooseProductRegister = FXMLLoader.load(
                        getClass().getResource(
                                "/br/senac/onRuby/Home/Home.fxml"
                        )
                );

                ChooseProductRegister = new Stage();
                Scene scene = new Scene(chooseProductRegister);

                ChooseProductRegister.setScene(scene);
                ChooseProductRegister.setTitle("Home");
                ChooseProductRegister.show();
            }

            Stage stage = (Stage) btnBackHome.getScene().getWindow();
            stage.close();
        }
        catch(Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setContentText("Ocorreu um erro ao voltar a tela");
            alert.showAndWait();
        }
    }
    
}
