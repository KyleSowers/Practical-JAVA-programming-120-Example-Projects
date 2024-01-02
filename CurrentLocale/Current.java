//PRACTICE 78: A PROGRAM TO CREATE CURRENT LOCALE
package CurrentLocale;

import java.util.Locale;

public class Current {
    public static void main(String[] args) {

        Locale lc = Locale.getDefault();

        System.out.println(lc.getDisplayCountry());
        System.out.println(lc.getDisplayLanguage());

        System.out.println("\n");
    }
}
