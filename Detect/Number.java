//PRACTICE 33: PROGRAM TO DETECT NEGATIVE AND POSITIVE NUMBERS FROM A USER
package Detect;

import java.util.Scanner;

public class Number {
    public static void main(String args[]) {
        //declare instance variable
        int x;
        //request input from user
        System.out.println("Please insert any number: ");
        //create new scanner
        Scanner sc = new Scanner(System.in);
        //store input value into variable
        x =sc.nextInt();
        //check if negative, else positive, print appropriate result
        if (x < 0) {
            System.out.println("This is a negative number.");
        } else {
            System.out.println("This is a positive number.");
        }
    }
}
