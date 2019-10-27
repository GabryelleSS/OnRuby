package br.senac.onRuby.aplicacao;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class aplicacao extends Application {
    public void start(Stage stage) throws Exception {
        Parent customerRegistration = FXMLLoader.load(
            getClass().getResource(
                "/br/senac/onRuby/ProductRegistration/ProductRegistration.fxml"
            )
        );
        
        Scene scene = new Scene(customerRegistration);
        scene.getStylesheets().add("ProductRegistration.css");
        
        stage.setScene(scene);
        stage.show();
    }
}
