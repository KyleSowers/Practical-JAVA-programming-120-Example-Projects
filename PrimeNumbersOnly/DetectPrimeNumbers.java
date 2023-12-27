//PRACTICE 65: A PROGRAM TO DETECT PRIME NUMBERS ONLY
package PrimeNumbersOnly;

import java.util.Scanner;

public class DetectPrimeNumbers {
    public static void main(String[] args) {
        //declare attributes
        int num1, x, count = 0;
        //create new scanner from the import scanner class
        Scanner sc = new Scanner(System.in);
        //request input from user
        System.out.println("Please, insert a number: ");
        //store user input into attribute
        num1 = sc.nextInt();
        //for-if loop determines a count attribute value if a value can be found to equally divide from user input
        for (x = 2; x < num1; x++) {
            if(num1 % x == 0) {
                count++;
                break;
            }
        }
        //if-else statement uses count attribute value to print if it is prime or not
        if (count == 0) {
            System.out.println(num1 + " is a Prime Number");
        } else {
            System.out.println(num1 + " is not a Prime Number");
        }
    }
}
