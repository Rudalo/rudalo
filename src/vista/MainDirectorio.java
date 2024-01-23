package vista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainDirectorio extends Application {
	
	public static void main(String[] args) {
        Application.launch(MainDirectorio.class, args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("DirectorioView.fxml"));
    	
        stage.setTitle("Directorio");
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }
}
