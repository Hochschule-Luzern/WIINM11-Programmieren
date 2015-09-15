package Aufgabe1;

public class Calculator{
	
	
	public static int getFactorial(int ZahlN){
		
		int result = 0;
		
		if(ZahlN > 19){
			
			System.out.println("Nein, Nein, Nein, die Zahl ist groesser als 19! Korrigieren SOFORT!!!");	
		}else{
			result = 1;
			for(int i=1;i<=ZahlN;i++){
		
				result = result * i;
			}

			//System.out.println("Die Fakultät von: "+ZahlN+" ist: "+result);
		}
		return result;
		
	}

	public static int getGratestCommonDivisor(int x, int y) {
		
		int r;
		while (y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		return x;
	}
	
	public static int getLeastCommonMultiple(int x, int y) {
		return (x * y)/getGratestCommonDivisor(x, y);
	}
}