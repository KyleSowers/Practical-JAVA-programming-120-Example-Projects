//PRACTICE 41: A PROGRAM TO PRINT OUT STRING ARRAYS
package StringArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {
    public static void main(String args[]) throws IOException {
        //declare new string array
        String st[] = new String[7];
        //create new buffer reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //request array values from user
        System.out.println("Please, insert 7 string elements: ");
        //for loop will use input to assign as array values
        for (int x = 0; x < 7; x++) {
            st[x] = br.readLine();
        }
        //return result by for loop that reads array and outputs values with print statement
        System.out.print("The result of the string values are: ");
        {
            for (int x = 0; x < 7; x++) {
                System.out.print(" " + st[x]);
            }
        }
    }
}
