package MatrixMultiplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class MultiplyMatrix {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1[][] = new int[4][4];
        int num2[][] = new int[4][4];
        int num3[][] = new int[4][4];

        int x, y, z;

        System.out.println("Please, enter First Matrix");
        for (x = 0; x < 4; x++) {
            for (y = 0; y < 4; y++) {
                num1[x][y] = Integer.parseInt(br.readLine());
            }
        }
        for  ( x = 0; x < num1.length; x++) {
            for  (y = 0; y < 4; y++) {
                System.out.print(" " + num1[x][y]);
            }
            System.out.println();
        }


    }
}
