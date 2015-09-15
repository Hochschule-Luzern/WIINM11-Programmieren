package application.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class PrimzahlenCheckerController {

	@FXML
	private TextField txtZahl;
	
	@FXML
	private Label lblResultat;
	
	@FXML
	private Label lblError;
	
	@FXML
	private Button btnCheck;

	btnCheck.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>()){
	
		public void handle(ActionEvent event) throws IOException{
			boolean prim = true;
			lblError.textProperty().setValue("");
			lblResultat.textProperty().setValue("");
		
			String str = txtZahl.getText();
			
			if(str != null && str.trim().length() > 0){
						
				try{
					
					int n = Integer.parseInt(str);
					prim = isPrime(n);
					
					if(prim){
						lblResultat.textProperty().setValue(n + ": Primzahl");
					}else if(n==18){
						
						FXMLLoader loader = new FXMLLoader();
						loader.setLocation(getClass().getResource("Javert.fxml"));
						Parent content = (Parent)loader.load();
						Stage stage = new Stage();
						stage.setScene(new Scene(content));
						stage.show();
						
					}else{
						lblResultat.textProperty().setValue(n + ": Keine Primzahl");
					}
				}catch(NumberFormatException e){
					lblResultat.textProperty().setValue("");
					lblError.textProperty().setValue("Raoul was machsch?!");
				}
			}
		}
	}
	
//	private void check() throws IOException{
//		boolean prim = true;
//		lblError.textProperty().setValue("");
//		lblResultat.textProperty().setValue("");
//	
//		String str = txtZahl.getText();
//		
//		if(str != null && str.trim().length() > 0){
//					
//			try{
//				
//				int n = Integer.parseInt(str);
//				prim = isPrime(n);
//				
//				if(prim){
//					lblResultat.textProperty().setValue(n + ": Primzahl");
//				}else if(n==18){
//					
//					FXMLLoader loader = new FXMLLoader();
//					loader.setLocation(getClass().getResource("Javert.fxml"));
//					Parent content = (Parent)loader.load();
//					Stage stage = new Stage();
//					stage.setScene(new Scene(content));
//					stage.show();
//					
//				}else{
//					lblResultat.textProperty().setValue(n + ": Keine Primzahl");
//				}
//			}catch(NumberFormatException e){
//				lblResultat.textProperty().setValue("");
//				lblError.textProperty().setValue("Raoul was machsch?!");
//			}
//		}
//	}
	
	
	public static boolean isPrime(int number){
        for(int i=2; i<number; i++){
           if(number%i == 0){
               return false; //number is divisible so its not prime
           }
        }
        return true; //number is prime now
    }
}
