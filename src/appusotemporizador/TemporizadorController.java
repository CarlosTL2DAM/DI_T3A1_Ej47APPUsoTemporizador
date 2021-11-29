/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusotemporizador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import temporizador.Temporizador;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class TemporizadorController implements Initializable {

    @FXML
    private Temporizador temporizador;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        temporizador.setTiempo(5);
        temporizador.disminuyeTiempo();
    }    

    @FXML
    private void finalizaTemporizador(ActionEvent event) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION, "Cuenta atrás finalizada.");
        alerta.show();
        alerta.setHeaderText("FINALIZACIÓN");
    }
    
}
