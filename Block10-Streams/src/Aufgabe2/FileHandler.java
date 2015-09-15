package Aufgabe2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandler {

	public static void main(String[] args) {

		 switch (args[0]) {
	         case "-c":{
	        	 copyFile(args[1], args[2]);
	        	 break;
	         }	                  
	         case "-s":{
	        	 showFile(args[1]);
	        	 break;
	         }
	         case "-r":{
	        	 redirect(args[1]);
	        	 break;
	         } 
		 }	
	}
	
	public static void copyFile(String sourcefile, String destfile){
		
		try(
			FileReader fReader = new FileReader(sourcefile);
			FileWriter fwriter = new FileWriter(destfile);
		){			
			int c = -1;
			while( (c = fReader.read()) != -1){
				fwriter.write(c);
			}
		}catch(IOException e){
			System.out.println(e.getMessage());		
		}	
	}
	
	public static void showFile(String file){
		
		try(FileReader fReader = new FileReader(file)){
			int c = -1;
			while( (c= fReader.read()) != -1){
				System.out.print((char)c);
			}
		}catch(IOException e){
			System.out.println(e.getMessage());		
		}

	}
	
	public static void redirect(String file){
			
		try(	
			InputStreamReader isr = new InputStreamReader(System.in);
			FileWriter fwriter = new FileWriter(file);
		){
			
	         System.out.println("Enter characters, 'q' to quit.");
	         char c;
	         do{
	            c = (char)isr.read();
	            fwriter.write(c);
	         } while(c != 'q');
		 
		}catch(IOException e){
			System.out.println(e.getMessage());		
		}
	}

}
