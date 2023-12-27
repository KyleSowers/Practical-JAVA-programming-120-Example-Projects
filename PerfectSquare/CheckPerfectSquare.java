//PRACTICE 66: A PROGRAM TO CHECK A PERFECT SQUARE
package PerfectSquare;

import java.util.Scanner;

public class CheckPerfectSquare {
    public static void main(String[] args) {
        //add new scanner to class
        Scanner sc = new Scanner(System.in);
        //ask user for a number
        System.out.println("Please, insert a number: ");
        //store user number into attribute
        int x = sc.nextInt();
        //factor sqrt and store into new attribute
        int sqrt = (int)Math.sqrt(x);
        //condition to check for perfect square or not with print statements
        if (sqrt * sqrt == x) {
            System.out.println(x + " is a Perfect Square");
        } else {
            System.out.println(x + " is not a Perfect Square");
        }
    }
}
