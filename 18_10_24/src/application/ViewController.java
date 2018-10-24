package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {

    @FXML
    private TableView<?> tabla;

    @FXML
    private TextField idMezo;

    @FXML
    private TextField vezeteknevMezo;

    @FXML
    private TextField keresztnevMezo;

    @FXML
    private TextField szuletesidatumMezo;
   

    @FXML
    private TableColumn<?, ?> tablaID;

    @FXML
    private TableColumn<?, ?> tablaVezeteknev;

    @FXML
    private TableColumn<?, ?> tablaKeresztnev;

    @FXML
    private TableColumn<?, ?> tablaSzuletesiDatum;

    @FXML
    void hozzaadGomb(ActionEvent event) {
    	//System.out.println("Működik");
    	System.out.println(idMezo.getText());
    	System.out.println(vezeteknevMezo.getText());
    	System.out.println(keresztnevMezo.getText());
    	System.out.println(szuletesidatumMezo.getText());
    	

    }
    

    @FXML
    void menuItemKilepes(ActionEvent event) {
    	Platform.exit();

    }

    @FXML
    void menuItemNevjegy(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
