package week6;

import java.text.NumberFormat;
import java.util.Locale;

public class I18NCurrency {
	public static void main(String[] args) {
		printCurrency(Locale.UK);
		printCurrency(Locale.FRANCE);
		printCurrency(Locale.US);
		printCurrency(Locale.TRADITIONAL_CHINESE);
		printCurrency(Locale.GERMANY);
		
		
		
		
		
	}
	static void printCurrency(Locale locale) {
		double number = 105000.1234;
		NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
		String formatCurrency = formatter.format(number);
		System.out.println(formatCurrency + " " + locale);
}
}