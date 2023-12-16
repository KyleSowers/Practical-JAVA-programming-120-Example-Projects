//PROJECT 34: A PROGRAM TO DETECT EVEN AND ODD NUMBERS
package EvenOdd;

import java.util.Scanner;

public class Number {
    public static void main(String args[]) {
        //declare instance variable
        int x;
        //request number from user
        System.out.println("Please provide a number");
        //create scanner to read input
        Scanner sc = new Scanner(System.in);
        //store user input value into variable
        x = sc.nextInt();
        //if-else to check with modulus operator if x is even or odd and print correct output
        if (x % 2 == 0) {
            System.out.println(x + " is even.");
        } else {
            System.out.println(x + " is odd.");
        }
    }
}
