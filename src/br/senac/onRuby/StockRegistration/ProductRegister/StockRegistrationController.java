
package br.senac.onRuby.StockRegistration.ProductRegister;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StockRegistrationController {
    
    private Stage stockRegistration;
    @FXML
    private Button btnBackHome;
    
    @FXML
    private void btnBackHome() throws Exception {
        if (stockRegistration == null || !stockRegistration.isShowing()) {
            Parent stockClothes = FXMLLoader.load(
                    getClass().getResource(
                            "/br/senac/onRuby/Home/Home.fxml"
                    )
            );

            stockRegistration = new Stage();
            Scene scene = new Scene(stockClothes);

            stockRegistration.setScene(scene);
            stockRegistration.setTitle("Home");
            stockRegistration.show();
        }

        Stage stage = (Stage) btnBackHome.getScene().getWindow();
        stage.close();
    }
    
}
