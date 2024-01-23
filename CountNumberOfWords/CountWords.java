//PRACTICE 115: A PROGRAM TO COUNT NUMBER OF WORDS IN A STRING VARIABLE
package CountNumberOfWords;

public class CountWords {

    static int z, y = 0, output;
    static int count(String s) {
        char ch[] = new char[s.length()];
        for (z = 0; z < s.length(); z++) {

            ch[z] = s.charAt(z);
            if (((z > 0) && (ch[z] != ' ') && (ch[z - 1] == ' ')) || ((ch[0] != ' ') && (z == 0))) {
                y++;
            }
        }
    }
}
