package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelo.Directorio;

public class DirectorioControlador {

	Directorio dir = new Directorio();
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblMensaje;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNombreFinal;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtTelefonoFinal;

    @FXML
    void guardar(ActionEvent event) {
    	String telefono = txtTelefono.getText();
    	String nombre = txtNombre.getText();
    	
    	String msj = dir.guardar(nombre, telefono);
    	lblMensaje.setText(msj);
    	
    	txtTelefono.clear();
    	txtNombre.clear();
    }

    @FXML
    void mostrar(ActionEvent event) {
    	String telefono = txtTelefonoFinal.getText();
    	String msj = dir.mostrar(telefono);
    	txtNombreFinal.setText(msj);
    }

    @FXML
    void initialize() {
        assert lblMensaje != null : "fx:id=\"lblMensaje\" was not injected: check your FXML file 'DirectorioView.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'DirectorioView.fxml'.";
        assert txtNombreFinal != null : "fx:id=\"txtNombreFinal\" was not injected: check your FXML file 'DirectorioView.fxml'.";
        assert txtTelefono != null : "fx:id=\"txtTelefono\" was not injected: check your FXML file 'DirectorioView.fxml'.";
        assert txtTelefonoFinal != null : "fx:id=\"txtTelefonoFinal\" was not injected: check your FXML file 'DirectorioView.fxml'.";

    }

}
