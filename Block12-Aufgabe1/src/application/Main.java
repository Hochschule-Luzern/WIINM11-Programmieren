package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Main extends Application {
		
	@FXML
	private TextField inSize;
	
	@FXML
	private TextField inWeight;
	
	@FXML
	private ComboBox<String> inAge;
	
	@FXML
	private Label outBMI;
	
	@Override
	public void start(Stage primaryStage) {
				
		try {
			primaryStage.setResizable(false);
			primaryStage.setTitle("BMI Rechner");			
			Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));

			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@FXML
	public void initialize(){
		
		ObservableList<String> options = FXCollections.observableArrayList();
		for(int i = 10; i<=99;i++){
			options.add(Integer.toString(i));
		}
		inAge.setItems(options);
		outBMI.textProperty().setValue("");
	}
	
	@FXML
	public void calculateBMI(){
				
		int size = Integer.parseInt(inSize.getText());
		int weight = Integer.parseInt(inWeight.getText());
		int age = Integer.parseInt(inAge.getValue());
		outBMI.setText(Integer.toString(age));
	}
}
