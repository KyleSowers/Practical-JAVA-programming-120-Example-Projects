package AcceptArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {
    public static void main(String args[]) throws NumberFormatException, IOException {
        //declare instance array x, with a total integer (index) of 7 integers
        int x[] = new int[7];
        //create new buffer reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //request array values from user
        System.out.print("Please insert Array numbers: ");
        //loop to create array from user values
        for (int y = 0; y < 7; y++) {
            x[y] = Integer.parseInt(br.readLine());
        }
        //loop to read new array and output to user
        for  (int y = 0; y < x.length; y++) {
            System.out.print(" " + x[y]);
        }
    }
}
