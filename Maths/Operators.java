//PRACTICE 30: A PROGRAM FOR USE OF MATH OPERATORS FOR CALCULATOR
package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operators {
    public static void main(String args[]) throws NumberFormatException, IOException {
        //declare instance variables
        int x, y, z, xyz = 0;
        //created new buffer reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //request first integer from user
        System.out.println("PLease enter first number: ");
        //store value
        x = Integer.parseInt(br.readLine());
        //request second integer from user
        System.out.println("Please enter second number: ");
        //store value
        y = Integer.parseInt(br.readLine());
        //create a while loop condition with print statements preceding a switch
        while (xyz != 6) {
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Division");
            System.out.println("4: Multiplication");
            //reade user option/input
            xyz = Integer.parseInt(br.readLine());
            //switch cases for correct output/looping
            switch(xyz) {
                case 1:
                    z = x + y;
                    System.out.println("Result of Addition is: " + z);
                    break;
                case 2:
                    z = x - y;
                    System.out.println("Result of Subtraction is: " + z);
                    break;
                case 3:
                    z = x / y;
                    System.out.println("Result of Division is: " + z);
                    break;
                case 4:
                    z = x * y;
                    System.out.println("Result of Muliplication is: " + z);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
