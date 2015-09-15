package application.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import application.modell.*;
import application.persister.PersisterImpl;

public class AllPersonenController {

	@FXML
	private TableView<String> tvAllPersonen;
	
	@FXML
	private TextField tfName;
	
	@FXML
	private TextField tfVorname;
	
	@FXML
	private TextField tfStrasse;
	
	@FXML
	private TextField tfPLZ;
	
	@FXML
	private TextField tfOrt;
	
	@FXML
	private AnchorPane cNewPerson;
	
	private PersisterImpl Persister = new PersisterImpl();
	
	private ObservableList<String> data = FXCollections.observableArrayList();
	
	@FXML
	public void showData() throws Exception{
		
		data.add("Ernte");
		tvAllPersonen.setItems(data);
	}
	
	@FXML
	public void initialize(){
		tvAllPersonen.setVisible(true);
		cNewPerson.setVisible(false);
	}
	
	@FXML
	public void addPerson(){
		tvAllPersonen.setVisible(false);
		cNewPerson.setVisible(true);
	}
	
	@FXML
	public void deletePerson(){
		
	}
	
	@FXML
	public void closeApp(){
		
	}
	
	@FXML
	public void addNewPerson(){
		tvAllPersonen.setVisible(true);
		cNewPerson.setVisible(false);
		
		Person p = new Person();
		p.setName(tfName.getText());
		p.setVorname(tfVorname.getText());
		p.setPlz(Integer.parseInt(tfPLZ.getText()));
		p.setStrasse(tfStrasse.getText());
		p.setOrt(tfOrt.getText());
		
		
	}
}
