public class NumbReader{
	
	public static void main(String[] args){
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int zahl = 10;
		while(zahl != 0){
			System.out.println("Bitte geben Sie eine Zahl ein:");
			zahl = sc.nextInt();
			
			if(zahl > 0) System.out.println(zahl);
		}
		
		System.out.println("Programm wird BEENDET!");
	}
}