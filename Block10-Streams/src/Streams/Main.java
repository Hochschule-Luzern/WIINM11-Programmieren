package Streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String filename = "C:/temp/file01.txt";
		try {
			Main.writewithFileWriter(filename);
			Main.readwithFileReader(filename);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void writewithFileWriter(String filename) throws IOException{
//		FileWriter fwriter = new FileWriter(filename);
//		String msg = "Guten Morgen allerseits!!!";
//		fwriter.write(msg);
//		fwriter.close();
		
		try(FileWriter fwriter = new FileWriter(filename)){
			fwriter.write("Guten Morgen allerseits!!!");
		}catch(IOException e){
			// Code			
		}
	}
	
	private static void readwithFileReader(String filename) throws IOException{
		try(FileReader fReader = new FileReader(filename)){
			int c = -1;
			while( (c= fReader.read()) != -1){
				System.out.print((char)c);
			}
		}
	}
	
}
