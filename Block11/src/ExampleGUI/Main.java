package ExampleGUI;



import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class Main extends Application{

	public void start(Stage stage){
	
		// Fenster Titel
		stage.setTitle("First JavaFX");
		
		//Container für Komponenten
		BorderPane root = new BorderPane();
		
		//Szene erstellen
		Scene scene = new Scene(root, 300, 200);
		
		// Labe hinzufügen
		Label label = new Label("Hoi");
		root.setTop(label);
		
		// Scene und stage verbinden
		stage.setScene(scene);
		
		// Stage sichtbar machen
		stage.show();
		
		GridPane grid = new GridPane();
		Label lblName = new Label("Name:");
		TextField txtName = new TextField();
		
		grid.add(lblName, 0, 0);
		grid.add(txtName, 1, 0);
		
		root.setCenter(grid);
		
		HBox hBox = new HBox();
		hBox.setPadding(new Insets(10));
		
		VBox vBoxLeft = new VBox();
		vBoxLeft.setStyle("-fx-padding:5px;-fx-background-color:gold");
		
		hBox.getChildren().addAll(vBoxLeft);
		
		vBoxLeft.getChildren().addAll(grid);
		
		root.setCenter(hBox);
		
	}
	public static void main(String[] args){
		launch(args);
	}
}

	

