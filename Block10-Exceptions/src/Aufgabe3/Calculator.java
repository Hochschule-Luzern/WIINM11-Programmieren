package Aufgabe3;

public class Calculator {
	
	public static int getFactorial(int zahl) throws ArgumentOutOfRangeException{
		
		int result = 0;
		
		if(zahl > 19 || zahl < 0){
			
			String msg = "Der Wert darf nicht grösser 19 und kleiner 0 sein!";
			ArgumentOutOfRangeException e = new ArgumentOutOfRangeException(msg);
	        throw e;
		
		}else{
			result = 1;
			for(int i=1;i<=zahl;i++){
		
				result = result * i;
			}
		}
		return result;
	}
}
