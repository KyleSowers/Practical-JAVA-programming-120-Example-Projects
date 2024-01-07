//PRACTICE 89: A PROGRAM TO GET THE RESULT OF THE LONGEST PALINDROME
package LongestPalindrome;

public class Palindrome {
    public String LongPalin(String Str1) {
        if (Str1.isEmpty()) {
            return null;
        }
        if (Str1.length() == 1) {
            return Str1;
        }

        String lngs = Str1.substring(0, 1);
        for(int x = 0; x < Str1.length(); x++) {
            String lngx = LongestPalindrome(Str1, x, x);
            if (lngx.length() > lngs.length()) {
            lngs = lngx;
        }

        lngx = LongestPalindrome(Str1, x, x + 1);
        if(lngx.length() > lngs.length()) {
            lngs = lngx;
        }
    }
}
