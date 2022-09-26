package week6;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class I18NTime {
	public static void main(String[] args) {
		printTime(Locale.UK);
		printTime(Locale.FRANCE);
		printTime(Locale.US);
		printTime(Locale.CHINA);
		printTime(Locale.GERMANY);
		printTime(Locale.ITALIAN);
		
	}
	static void printTime(Locale locale) {

		DateFormat formatter = DateFormat.getTimeInstance(DateFormat.DEFAULT,locale);
	    Date currentDate = new Date();
	    
	    String date = formatter.format(currentDate);
	    System.out.println(date+ " " +locale);
	}
}
