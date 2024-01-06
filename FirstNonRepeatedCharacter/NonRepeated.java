//PRACTICE 87: A PROGRAM TO DETECT FIRST NON-REPEATED CHARACTER
package FirstNonRepeatedCharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeated {
        public static void main(String[] args) {
            Map<Character, Integer> chmap = new HashMap();
            Scanner sc = new Scanner(System.in);

            System.out.println("Please insert only string value: ");
            String Str1 = sc.nextLine();

            for (int x = 0; x < Str1.length(); x++) {
                char ch = Str1.charAt(x);
                if(chmap.containsKey(ch)) {
                    chmap.put(ch, chmap.get(ch) + 1);
                } else {
                    chmap.put(ch, 1);
                }
            }
        }
}
