package PrimeNumbers;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        int x = 0, num1 = 0;
        String pnum = "";

        System.out.println("Insert a number to print its prime numbers: ");
        Scanner sc = new Scanner(System.in);

        int num2 = sc.nextInt();

        for (x = 1; x <= num2; x++) {
            int primecount = 0;
            for (x = 1; num1 >= 1; num1--) {
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
