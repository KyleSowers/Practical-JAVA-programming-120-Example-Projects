//PRACTICE 30: A PROGRAM FOR USE OF MATH OPERATORS FOR CALCULATOR
package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operators {
    public static void main(String args[]) throws NumberFormatException, IOException {

        int x, y, z, xyz = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("PLease enter first number: ");
        x = Integer.parseInt(br.readLine());
        System.out.println("Please enter second number: ");
        y = Integer.parseInt(br.readLine());

        while (xyz! = 6) {
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Division");
            System.out.println("4: Multiplication");
            xyz = Integer.parseInt(br.readLine());
            switch(xyz)
        }
    }
}
