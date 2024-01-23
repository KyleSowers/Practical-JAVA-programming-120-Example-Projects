//PRACTICE 115: A PROGRAM TO COUNT NUMBER OF WORDS IN A STRING VARIABLE
package CountNumberOfWords;

import java.util.Scanner;

public class CountWords {
    //declare variables/attributes
    static int z, y = 0, output;
    //method for solving number f words
    static int count(String s) {
        char ch[] = new char[s.length()];
        for (z = 0; z < s.length(); z++) {

            ch[z] = s.charAt(z);
            if (((z > 0) && (ch[z] != ' ') && (ch[z - 1] == ' ')) || ((ch[0] != ' ') && (z == 0)))
                y++;
        }
        return y;
    }
    //main method for execution
    public static void main(String args[]) {
        //declare attribute to be checked as empty
        String Str1 = " ";
        //create scanner for user input
        Scanner sc = new Scanner(System.in);
        //request word(s)
        System.out.println("Please, insert some word");
        //store user value into empty attribute
        Str1 = sc.nextLine();
        //declare new attribute that calls on method from class to solve for count of words
        int words = CountWords.count(Str1);
        //inform user how many words
        System.out.println("the number of words is: " + words);
    }
}
