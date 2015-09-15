package ch.hslu.wi;
import java.util.Date;
import java.util.GregorianCalendar;
import ch.hslu.wi.common.Util;

public class UtilTest {
	
	public static void main(String[] args) {
		
		Util util = new Util();
		GregorianCalendar gc = new GregorianCalendar();
		Date d = new Date();
		System.out.println("timeAsString: " + util.timeAsString());
		System.out.println("dateAsString: " + util.dateAsString());
		System.out.println("dateAsString-SDF: " + util.dateAsString("EEE MMM dd HH:mm:ss zzz yyyy"));
		System.out.println("dateWithCountryCode en_UK: " + util.dateWithCountryCode("en", "UK"));
		long timeGC = gc.getTimeInMillis();
		gc.setTimeInMillis(timeGC+100000000);
		System.out.println("timeAsString: " + util.timeAsString(gc));
		System.out.println("dateAsString: " + util.dateAsString(gc));
		System.out.println("dateAsString-SDF-GC: " + util.dateAsString("EEE MMM dd HH:mm:ss zzz yyyy", gc));
		System.out.println("dateWithCountryCode en_UK: " + util.dateWithCountryCode("en", "UK", gc));
		long timeD = d.getTime();
		d.setTime(timeD+1000000000);
		System.out.println("timeAsString: " + util.timeAsString(d));
		System.out.println("dateAsString: " + util.dateAsString(d));
		System.out.println("dateAsString-SDF-D: " + util.dateAsString("EEE MMM dd HH:mm:ss zzz yyyy", d));
		System.out.println("dateWithCountryCode en_UK: " + util.dateWithCountryCode("en", "UK", d));
	} 
}