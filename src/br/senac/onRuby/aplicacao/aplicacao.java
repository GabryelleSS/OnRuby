package br.senac.onRuby.aplicacao;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class aplicacao extends Application {
    public void start(Stage stage) throws Exception {
        stage.setTitle("Home");
        
        Parent home = FXMLLoader.load(
            getClass().getResource(
                "/br/senac/onRuby/Home/Home.fxml"
            )
        );
        
        Scene scene = new Scene(home);
        
        stage.setScene(scene);
        stage.show();
    }
}
