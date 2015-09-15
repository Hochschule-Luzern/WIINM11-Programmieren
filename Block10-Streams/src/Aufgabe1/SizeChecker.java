package Aufgabe1;

import java.io.File;

public class SizeChecker {
	public static void main(String args[]){
		
		try{
			File f = new File(args[0]);
			
			System.out.println("Die Grösse der Datei: "+f.getPath()+" ist: "+f.length()+ " Haerdaepfel");
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
