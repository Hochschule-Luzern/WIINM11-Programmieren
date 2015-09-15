package Aufgabe3;

import java.io.*;

public class Util {
	public static int getIntZahl(String msg) throws Exception {
		System.out.print(msg);
		int value = -1;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(
				System.in))) {
			String str = br.readLine();
			str = str.trim();
			Integer intObj = Integer.valueOf(str).intValue();
			value = intObj.intValue();
		} catch (NumberFormatException nfe) {
			throw new Exception("Eingabe nicht korrekt!", nfe);
		} catch (IOException ioe) {
			throw new Exception("Die Zahl konnte nicht eingelesen werden!", ioe);
		}
		return value;
	}
}