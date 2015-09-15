package Aufgabe3;

public class Main {

	public static void main(String[] args){
		
		
		try{
			int zahl = Util.getIntZahl("Bitte geben sie eine Zahl zwischen 0 und 19 ein:");
			zahl = Calculator.getFactorial(zahl);
			System.out.println("Die Fakultät der eingegebenen Zahl ist: "+zahl);
		}catch(ArgumentOutOfRangeException e){
			System.out.println(e.getMessage());			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		

	}

}
