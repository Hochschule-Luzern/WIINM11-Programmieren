package Aufgabe3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class CopyFile {

	public static void main(String args[]){
		
			try(
				FileReader fReader = new FileReader(args[0]);
				FileWriter fwriter = new FileWriter(args[1]);
			){			
				int c = -1;
				Date d = new Date();
				while( (c = fReader.read()) != -1){
					fwriter.write(c);
				}
				Date d = new Date();
			}catch(IOException e){
				System.out.println(e.getMessage());		
			}	
		
	}
}
