//PRACTICE 60: A PROGRAM TO PRINT OUT PRIME NUMBERS
package PrimeNumbers;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        //declare attributes
        int x = 0, num1 = 0;
        String pnum = "";
        //request a number from user
        System.out.println("Insert a number to print its prime numbers: ");
        //create new scanner
        Scanner sc = new Scanner(System.in);
        //use new scanner to read and store input
        int num2 = sc.nextInt();
        //nested for loop with both levels of if conditionals to determine and print out print numbers
        for (x = 1; x <= num2; x++) {
            int primecount = 0;
            for (num1 = x; num1 >= 1; num1--) {
                if (x % num1 == 0) {
                    primecount = primecount + 1;
                }
            }
            if (primecount == 2) {
                System.out.println("Prime number is " + x);
            }
        }
    }
}
