//PRACTICE 27: A PROGRAM TO CREATE MULTIPLICATION TABLE
package Table;

import java.util.Scanner;

public class Table {
    public static void main(String args[]) {
        //declare instance variables
        int x, y;
        //request number to use on multiplication table
        System.out.println("Please insert a number to print Multiplication Table");
        //add new scanner
        Scanner sc = new Scanner(System.in);
        //store input value
        x = sc.nextInt();
        System.out.println("Result of Multiplication Table of " + x + " is: ");
        //loop for multiplying 1 - 20 and print statements
        for (y = 1; y <= 20; y++) {
            System.out.println(x + "*" + y + "=" + (x*y));
        }
    }
}
