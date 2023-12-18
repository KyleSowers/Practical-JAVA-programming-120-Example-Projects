package VowelConstant;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Check {
    public static void main(String args[]) {
        //declare char instance variable
        char c = ' ';
        //create new buffer reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //request character from user
        System.out.print("Please insert a character: ");
        //check if input is char
        try {
            c = (char)br.read();
        } catch (Exception e) {
            //throw exception if not char
            System.out.println(e);
        }
        //use switch cases to identify char vowels and default for consonants
            switch(c) {
                case 'a':
                    System.out.println(c + " is a vowel");
                    break;
                case 'e':
                    System.out.println(c + " is a vowel");
                    break;
                case 'i':
                    System.out.println(c + " is a vowel");
                    break;
                case 'o':
                    System.out.println(c + " is a vowel");
                    break;
                case 'u':
                    System.out.println(c + " is a vowel");
                    break;
                case 'A':
                    System.out.println(c + " is a vowel");
                    break;
                case 'E':
                    System.out.println(c + " is a vowel");
                    break;
                case 'I':
                    System.out.println(c + " is a vowel");
                    break;
                case 'O':
                    System.out.println(c + " is a vowel");
                    break;
                case 'U':
                    System.out.println(c + " is a vowel");
                    break;
                default:
                    System.out.println(c + " is a consonant");
                    break;
            }

    }
}
