//PRACTICE 36: A PROGRAM TO CHECK PALINDROME NUMBER
package Palindrome;

import java.util.Scanner;

public class Number {
    public static void main(String args[]) {
        //declare instance variables
        int w, x, y = 0, z = 0;
        //add new scanner to read input
        Scanner sc = new Scanner(System.in);
        //request number from user
        System.out.println("Please insert numbers to check Palindrome: ");
        //scan and store user input into variable z
        z = sc.nextInt();
        //store value of z into variable w
        w = z;
        //while loop to create a reverse set of input to check for palindrome
        while (z > 0) {
            x = z % 10;
            y = (y * 10) + x;
            z = z / 10;
        }
        //print result whether palindrome or not
        if (w == y) {
            System.out.println("This number is a Palindrome");
        } else {
            System.out.println("This number is not a Palindrome");
        }
    }
}
