package ch.hslu.wi.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author C. Kaiser
 * 
 * Die Klasse dient dazu verschiedene Varianten eines Datums zu generieren oder zu übernehmen und als String zurück zu geben.
 * Neben dem aktuellen Datum können auch Objekte vom Typ GregorianCalendar und Date
 * übergeben werden um ein spezifisches Datum zu setzen.
 *
 */

public class Util {

	/*
	 * timeAsString()
	 * Rückgabe der aktuellen Zeit als String. 
	 * Format: hh:mm:ss
	 * Input: -
	 * Output: String
	*/
	public String timeAsString(){
		Calendar c = new GregorianCalendar();
	    c.setTime(new Date());
	    String time =  c.get(Calendar.HOUR_OF_DAY) + ":" +  c.get(Calendar.MINUTE) + ":" +  c.get(Calendar.SECOND);
		return time;
	}
	
	/*
	 * dateAsString()
	 * Rückgabe des aktuellen Datums als String. 
	 * Format: DD:MM:YYYY
	 * Input: -
	 * Output: String
	*/
	public String dateAsString(){
		Calendar c = new GregorianCalendar();
	    c.setTime(new Date());
	    String time =  c.get(Calendar.DAY_OF_MONTH) + "." +  (c.get(Calendar.MONTH)+1) + "." +  c.get(Calendar.YEAR);
		return time;
	}
	
	/*
	 * dateAsString(String pattern)
	 * Rückgabe des aktuellen Datums als String. Die Formatierung wird als String pattern übergeben (Bsp: "EEE MMM dd HH:mm:ss zzz yyyy").
	 * Format: siehe pattern.  
	 * Input: String
	 * Output: String
	*/
	public String dateAsString(String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(new Date());
	}
	
	/*
	 * timeAsString(GregorianCalendar gc)
	 * Rückgabe der Zeit des übergebenen GregorianCalendar-Objekts als String.
	 * Format: hh:mm:ss
	 * Input: GregorianCalendar
	 * Output: String
	*/
	public String timeAsString(GregorianCalendar gc){
		Calendar c = gc;
	    String time =  c.get(Calendar.HOUR_OF_DAY) + ":" +  c.get(Calendar.MINUTE) + ":" +  c.get(Calendar.SECOND);
		return time;
	}
	
	/*
	 * dateAsString(GregorianCalendar gc)
	 * Rückgabe des Datums des übergebenen GregorianCalendar-Objekts als String.
	 * Format: DD:MM:YYYY
	 * Input: GregorianCalendar
	 * Output: String
	*/
	public String dateAsString(GregorianCalendar gc){
		Calendar c = gc;
	    String time =  c.get(Calendar.DAY_OF_MONTH) + "." +  (c.get(Calendar.MONTH)+1) + "." +  c.get(Calendar.YEAR);
		return time;
	}
	
	/*
	 * dateAsString(String pattern, GregorianCalendar gc)
	 * Rückgabe von Datum und Uhrzeit des übergebenen GregorianCalendar-Objekts als String. 
	 * Die Formatierung wird durch das übergebene pattern bestimmt.  
	 * Format: siehe pattern.
	 * Input: GregorianCalendar, String
	 * Output: String
	*/
	public String dateAsString(String pattern, GregorianCalendar gc) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(new Date(gc.getTimeInMillis()));
	}
	
	/*
	 * timeAsString(Date d)
	 * Rückgabe der Zeit des übergebenen Date-Objekts als String.
	 * Format: hh:mm:ss
	 * Input: Date
	 * Output: String
	*/
	public String timeAsString(Date d){
		Calendar c = new GregorianCalendar();
	    c.setTime(d);
	    String time =  c.get(Calendar.HOUR_OF_DAY) + ":" +  c.get(Calendar.MINUTE) + ":" +  c.get(Calendar.SECOND);
		return time;
	}
	
	/*
	 * dateAsString(Date d)
	 * Rückgabe des Datums des übergebenen Date-Objekts als String.
	 * Format: DD:MM:YYYY
	 * Input: Date
	 * Output: String
	*/
	public String dateAsString(Date d){
		Calendar c = new GregorianCalendar();
	    c.setTime(d);
	    String time =  c.get(Calendar.DAY_OF_MONTH) + "." +  (c.get(Calendar.MONTH)+1) + "." +  c.get(Calendar.YEAR);
		return time;
	}
	
	/*
	 * dateAsString(String pattern, Date d)
	 * Rückgabe von Datum und Uhrzeit des übergebenen Date-Objekts als String. 
	 * Die Formatierung wird durch das übergebene pattern bestimmt. 
	 * Format: siehe pattern.
	 * Input: Date, String
	 * Output: String
	*/
	public String dateAsString(String pattern, Date d) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(d);
	}
	
	/*
	 * dateWithCountryCode(String language, String country)
	 * Rückgabe des aktuellen Datums als String. 
	 * Die Formatierung wird durch den Language-Code (ISO 639) und den Region-Code (ISO 3166) bestimmt. 
	 * Format für "en" "UK": MM/DD/YY
	 * Input: String, String
	 * Output: String
	*/
	public String dateWithCountryCode(String language, String country){
	    Locale l = new Locale(language, country);
	    DateFormat d = DateFormat.getDateInstance(DateFormat.SHORT,l);
	    Calendar c = new GregorianCalendar();
		return d.format(c.getTime());
	}
	
	/*
	 * dateWithCountryCode(String language, String country, GregorianCalendar gc)
	 * Rückgabe von Datum und Uhrzeit des übergebenen GregorianCalendar-Objekts als String. 
	 * Die Formatierung wird durch den Language-Code (ISO 639) und den Region-Code (ISO 3166) bestimmt. 
	 * Format für "en" "UK": MM/DD/YY
	 * Input: String, String, GregorianCalendar
	 * Output: String
	*/
	public String dateWithCountryCode(String language, String country, GregorianCalendar gc){
	    Locale l = new Locale(language, country);
	    DateFormat d = DateFormat.getDateInstance(DateFormat.SHORT,l);
	    Calendar c = gc;
		return d.format(c.getTime());
	}
	
	/*
	 * dateWithCountryCode(String language, String country, Date d)
	 * Rückgabe von Datum und Uhrzeit des übergebenen Date-Objekts als String. 
	 * Die Formatierung wird durch den Language-Code (ISO 639) und den Region-Code (ISO 3166) bestimmt. 
	 * Format für "en" "UK": MM/DD/YY
	 * Input: String, String, Date
	 * Output: String
	*/
	public String dateWithCountryCode(String language, String country, Date d){
	    Locale l = new Locale(language, country);
	    DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT,l);
	    Calendar c = new GregorianCalendar();
	    c.setTime(d);
		return df.format(c.getTime());
	}
	
}
