public class Calculator{

	public static void main(String[] args){
		
		System.out.println("kgv von 7 und 8 ist: "+Calculator.ggt(8));
		System.out.println("kgv von 25 und 15 ist: "+Calculator.ggt(8));	
	}
	

	public static int[] primeFactors(int z){
		
		int i=2;
		int c=0;
		int[] list = new int[20];
	    
		while(true){
		
			// wenn restwert 0 ist dann ist i ein primfaktor
			if(z%i==0){
			
				list[c]=i;
				c++;
					
				// die zahl noch durch den primfaktor rechnen
				z=z/i;	
				
				// wurde ein primfaktor gefunden fängt man wieder von vorne an
				i=2;		
				
			
			// ist es kein primfaktor wird der nächste wert getestet
			}else{
			
				i++;
			}
			
			// ist i kleiner als die zahl abbruch
			if(z<i){	
				break;
			}
		}
		return list;
	}
	

	public static void ggt(int z1, int z2){
		
		int[] z1Arr = Calculator.primeFactors(z1);
		int[] z2Arr = Calculator.primeFactors(z2);
	}
	
	public static void kgv(int z1, int z2){
		
		int[] z1Arr = Calculator.primeFactors(z1);
		int[] z2Arr = Calculator.primeFactors(z2);
	}	
}