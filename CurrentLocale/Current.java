//PRACTICE 78: A PROGRAM TO CREATE CURRENT LOCALE
package CurrentLocale;

import java.util.Locale;

public class Current {
    public static void main(String[] args) {
        //create a Locale for class
        Locale lc = Locale.getDefault();
        //print country and language for user
        System.out.println(lc.getDisplayCountry());
        System.out.println(lc.getDisplayLanguage());
        //new line or space
        System.out.println("\n");
        //print country and language...abbreviation result
        System.out.println(lc.getCountry());
        System.out.println(lc.getLanguage());
        //new line or space
        System.out.println("\n");
        //another method for printing abbreviated country and language
        System.out.println(System.getProperty("user.country"));
        System.out.println(System.getProperty("user.language"));
    }
}
