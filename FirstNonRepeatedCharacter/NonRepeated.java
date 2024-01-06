//PRACTICE 87: A PROGRAM TO DETECT FIRST NON-REPEATED CHARACTER
package FirstNonRepeatedCharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeated {
        public static void main(String[] args) {
            //Create new hashmap
            Map<Character, Integer> chmap = new HashMap();
            //create new scanner
            Scanner sc = new Scanner(System.in);
            //request a string value
            System.out.println("Please insert only string value: ");
            //store string value
            String Str1 = sc.nextLine();
            //count characters and store into a map using the character and how many of each character (String, Integer)
            for (int x = 0; x < Str1.length(); x++) {
                char ch = Str1.charAt(x);
                if(chmap.containsKey(ch)) {
                    chmap.put(ch, chmap.get(ch) + 1);
                } else {
                    chmap.put(ch, 1);
                }
            }
            //Check for first map integer value of 1 (non-repeated) and share it as the result
            for (int x = 0; x < Str1.length(); x++) {
                if (chmap.get(Str1.charAt(x)) == 1) {
                    System.out.println("First non-repeated character of " + Str1 + " is " + Str1.charAt(x));
                    break;
                }
            }
        }
}
