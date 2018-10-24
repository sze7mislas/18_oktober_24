package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {

	@FXML
	private TableView<Szemely> tabla;

	@FXML
	private TextField idMezo;
	@FXML
	private TextField vezeteknevMezo;

	@FXML
	private TextField keresztnevMezo;

	@FXML
	private TextField szuletesidatumMezo;

	@FXML
	private TableColumn<Szemely, String> tablaID;

	@FXML
	private TableColumn<Szemely, String> tablaVezeteknev;

	@FXML
	private TableColumn<Szemely, String> tablaKeresztnev;

	@FXML
	private TableColumn<Szemely, String> tablaSzuletesiDatum;

	private ObservableList<Szemely> tablaAdatok = FXCollections.observableArrayList();

	@FXML
	void hozzaadGomb(ActionEvent event) {
		/*
		 * System.out.println("Működik"); //System.out.println(idMezo.getText());
		 * //System.out.println(vezeteknevMezo.getText());
		 * //System.out.println(keresztnevMezo.getText());
		 * //System.out.println(szuletesidatumMezo.getText());
		 */
		Szemely szemelyAdd = new Szemely(idMezo.getText(), vezeteknevMezo.getText(), keresztnevMezo.getText(),
				szuletesidatumMezo.getText());
		tablaAdatok.add(szemelyAdd);

	}

	@FXML
	void menuItemKilepes(ActionEvent event) {
		Platform.exit();

	}

	@FXML
	void menuItemNevjegy(ActionEvent event)
	{
		
	}

	private void kezdoAdatok() {
		Szemely szemely1 = new Szemely("1", "Pusztai", "Bence", "1990-02-13");
		Szemely szemely2 = new Szemely("2", "Juhász", "Bence", "1994-03-27");
		Szemely szemely3 = new Szemely("3", "Kiss", "Balázs", "1983-02-04");
		tablaAdatok.add(szemely1);
		tablaAdatok.add(szemely2);
		tablaAdatok.add(szemely3);
	}

	private void tablaAdatokBeallitasa() {
		tablaID.setCellValueFactory(cellData -> cellData.getValue().idProperty());
		tablaVezeteknev.setCellValueFactory(cellData -> cellData.getValue().vezeteknevProperty());
		tablaKeresztnev.setCellValueFactory(cellData -> cellData.getValue().keresztnevProperty());
		tablaSzuletesiDatum.setCellValueFactory(cellData -> cellData.getValue().szuletesidatumProperty());
		tabla.setItems(tablaAdatok);
	}
	@FXML
    void menuItemTorol(ActionEvent event) 
	{
		Szemely szemelyTorol=tabla.getSelectionModel().getSelectedItem();
		tablaAdatok.remove(szemelyTorol);
    }
	@FXML
	    void menuItemSzerkeszt(ActionEvent event)
		{
		Szemely szemelySzerkeszt= tabla.getSelectionModel().getSelectedItem();
		/*tablaAdatok.remove(szemelySzerkeszt);
		idMezo.setText(szemelySzerkeszt.getId());
		vezeteknevMezo.setText(szemelySzerkeszt.getVezeteknev());
		keresztnevMezo.setText(szemelySzerkeszt.getKeresztnev());
		szuletesidatumMezo.setText(szemelySzerkeszt.getSzuletesidatum());
		tablaAdatok.*/
		
	    }


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		kezdoAdatok();
		tablaAdatokBeallitasa();

	}

}
