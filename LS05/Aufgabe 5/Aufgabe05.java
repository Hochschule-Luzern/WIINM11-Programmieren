import java.util.Scanner;
public class Aufgabe05 {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Geben Sie die erste Zahl ein: ");
        int a = eingabe.nextInt();
        System.out.print("Geben Sie die zweite Zahl ein: ");
    	int b = eingabe.nextInt();
    	System.out.print("Geben sie die dritte Zahl ein: ");
    	int c = eingabe.nextInt();

    	if(a>=b){
    		if(b>=c){
    		System.out.print("Erste Zahl: "+a+"\nZweite Zahl: "+b+"\nDritte Zahl: "+c);	// out a b c
    		}else if(c>=a){
    		System.out.print("Erste Zahl: "+c+"\nZweite Zahl: "+a+"\nDritte Zahl: "+b);	// out c a b
    		}else{  
    		System.out.print("Erste Zahl: "+a+"\nZweite Zahl: "+c+"\nDritte Zahl: "+b);       //  out a c b
	       }
       }if(b>=a){
       	       if (a>=c){
       	     System.out.print("Erste Zahl: "+b+"\nZweite Zahl: "+a+"\nDritte Zahl: "+c);  	         //out b>a>c
       	      }else if(c>=b){
       	      System.out.print("Erste Zahl: "+c+"\nZweite Zahl: "+b+"\nDritte Zahl: "+c);	         // out c>b>a
       	      }else{
       	      System.out.print("Erste Zahl: "+b+"\nZweite Zahl: "+c+"\nDritte Zahl: "+a);	        // out b>c>a
       	     }  
       }
    }
}

