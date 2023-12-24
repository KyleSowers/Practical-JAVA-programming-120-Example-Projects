//PRACTICE 56: A  PROGRAM TO REVERSE A NUMBER
package ReverseNumber;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        //declare attributes
        int num1 = 0, num2, reversenum1 = 0;
        //print request for numbers by user
        System.out.println("Please insert some numbers: ");
        //create new scanner for the class
        Scanner sc = new Scanner(System.in);
        //read and store input
        num2 = num1 = sc.nextInt();
        //loop and factor while condition is satisfied
        while (num1 != 0) {
            reversenum1 = reversenum1 * 10;
            reversenum1 = reversenum1 + num1 % 10;
            num1 = num1 / 10;
        }
        //print out result to user
        System.out.println("Result of the reversed number " + num2 + " is: " + reversenum1);
    }
}
