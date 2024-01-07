//PRACTICE 88: A PROGRAM TO GENERATE PERMUTATION OF A STRING
package StringPermutation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, insert a string: ");
        String Str1 = sc.nextLine();

        System.out.print("The result of the permutation is: " + StrPermut(Str1));
    }

    public static Set<String> StrPermut(String Str1) {
        Set<String> strper = new HashSet<String>();

        if (Str1 == null) {
            return null;
        } else if (Str1.length() == 0) {
            strper.add("");
            return strper;
        }

        char first = Str1.charAt(0);
        String Str2 = Str1.substring(1);
    }
}
