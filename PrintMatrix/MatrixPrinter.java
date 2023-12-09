//PRACTICE 17: A PROGRAM TO PRINT NUMBERS IN MATRIX FORMAT
package PrintMatrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixPrinter {

    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Initializing a 3x3 matrix
        int num1[][] = new int[3][3];
        int x, y;
        System.out.println("Please, enter 9 Integer values: ");
        // Reading user input to populate the matrix
        for (x = 0; x < 3; x++)
        {
            for(y = 0; y < 3; y++)
            {
                num1[x][y] = Integer.parseInt(br.readLine());
            }
        }
        // Printing the matrix
    for (x = 0; x < num1.length; x++)
    {
        for (y = 0; y < 3; y++)
        {
            System.out.print(" " + num1[x][y]);
        }
        System.out.println(); // Move to the next line after each row
    }
}
}
