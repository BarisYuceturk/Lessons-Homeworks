package week6.I18N_G11NExamples;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18NSample {

	// greetings -Hello -Hallo -Bonjour
	// inquiry - How are you -Wie gehst du - Allez-yous
	// farewell - goodbye - Tschüss - Au revoir

	public static void main(String[] args) {

		String language;
		String country;

		if (args.length != 0) {
			language = new String();
			country = new String();

		} else {
			language = new String(args[0]);
			country = new String(args[1]);
		}

		Locale currentLocale = new Locale(language, country);

		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle_fr_FR", currentLocale);
		System.out.println(messages.getString("greetings"));
		System.out.println(messages.getString("inquiry"));
		System.out.println(messages.getString("farewell"));
	}

}
