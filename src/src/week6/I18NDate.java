package week6;

import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;

public class I18NDate {
public static void main(String[] args) {
	printDate(Locale.UK);
	printDate(Locale.FRANCE);
	printDate(Locale.US);
	printDate(Locale.TRADITIONAL_CHINESE);
	printDate(Locale.CHINA);
	printDate(Locale.GERMANY);
	
	
}
static void printDate(Locale locale) {

	DateFormat formatter = DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
    Date currentDate = new Date();
    
    String date = formatter.format(currentDate);
    System.out.println(date+ " " +locale);
}
}