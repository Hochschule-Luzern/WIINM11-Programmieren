package Aufgabe3;


public class PapierBlatt extends AbstractGroesse{

	private String format;
	private int hoehe;
	private int laenge;
	private int breite;
	
	public PapierBlatt(String format) {
		//super();
		switch (format)
		{
		case "A0": 	laenge = 1189;
					breite = 841;
					hoehe  = 0;
					break;
		case "A1" : laenge = 842;
					breite = 594;
					hoehe  = 0;	
					break;
		case "A2": laenge = 594;
					breite = 420;
					hoehe  = 0;	
					break;
		case "A3": laenge = 420;
					breite = 297;
					hoehe  = 0;	
					break;
		case "A4": laenge = 297;
					breite = 210;
					hoehe  = 0;	
					break;
		case "A5": 	laenge = 210;
					breite = 148;
					hoehe  = 0;	
					break;
		case "A6": laenge = 148;
					breite = 105;
					hoehe  = 0;	
					break;
		case "A7": 	laenge = 105;
					breite = 74;
					hoehe  = 0;	
					break;
		case "A8": 	laenge = 74;
					breite = 52;
					hoehe  = 0;
					break;
		case "A9": 	laenge = 52;
					breite = 37;
					hoehe  = 0;	
					break;
		case "A10": laenge = 37;
					breite = 26;
					hoehe  = 0;
					break;
		 default: laenge = 0;
				 	breite = 0;
				 	hoehe  = 0;					
		}
	}

	
	
	@Override
	public int laenge() {
		return this.laenge;
	}

	@Override
	public int hoehe() {
		return hoehe;
	}

	@Override
	public int breite() {
		return this.breite;
	}


	public String getFormat() {
		return format;
	}
	
	public int grundflaeche(){
		return laenge*breite;
	}
	
	public int compareTo(Groesse o){
		
		int fo = o.breite()*o.laenge();
		int ft = laenge*breite;
		
		if(fo < ft){
			return 1;
		}
		if(fo > ft){
			return -1;
		}
		return 0;
	}
}
