package br.senac.application.applicationOnRuby;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OnRuby_Sale extends Application {
    public void start(Stage stage) throws Exception {
        Parent ViewSale = FXMLLoader.load(
            getClass().getResource(
                "/br/senac/application/applicationOnRuby/viewOnRuby/ViewSale.fxml"
            )
        );
        
        Scene scene = new Scene(ViewSale);
        
        stage.setScene(scene);
        stage.show();
    }
}
