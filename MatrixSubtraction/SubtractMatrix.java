package MatrixSubtraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubtractMatrix {
    public static void main(String args[]) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1[][] = new int[3][3];
        int num2[][] = new int[3][3];
        int num3[][] = new int[3][3];

        int x, y;

        System.out.println("Please insert first 9 matrix values (3 rows, each with 3 integer values)");
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                num1[x][y] = Integer.parseInt(br.readLine());
            }
        }
        for (x = 0; x < num1.length; x++) {
            for (y = 0; y < 3; y++) {
                System.out.print(" " + num1[x][y]);
            }
            System.out.println();
        }

        System.out.println("Please insert second 9 matrix values (3 rows, each with 3 integer values)");
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                num2[x][y] = Integer.parseInt(br.readLine());
            }
        }
        for (x = 0; x < num1.length; x++) {
            for (y = 0; y < 3; y++) {
                System.out.print(" " + num2[x][y]);
            }
            System.out.println();
        }


    }
}
