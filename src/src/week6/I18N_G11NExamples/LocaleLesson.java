package week6.I18N_G11NExamples;

import java.util.Locale;

public class LocaleLesson {
public static void main(String[] args) {
	
	Locale locale = new Locale("en","EN");
	System.out.println(locale.getCountry());
	System.out.println(locale.getDisplayLanguage(locale));
	System.out.println(locale.getDisplayName());
//	System.out.println(locale.getISO3Country());
	System.out.println(locale.getISO3Language());
	
	
}
}
