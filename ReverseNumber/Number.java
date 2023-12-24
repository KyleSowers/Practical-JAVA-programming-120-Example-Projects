//PRACTICE 56: A  PROGRAM TO REVERSE A NUMBER
package ReverseNumber;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int num1 = 0, num2, reversenum1 = 0;

        System.out.println("Please insert some numbers: ");
        Scanner sc = new Scanner(System.in);

        num2 = num1 = sc.nextInt();

        while (num1 != 0) {
            reversenum1 = reversenum1 * 10;
            reversenum1 = reversenum1 + num1 % 10;
            num1 = num1 / 10;
        }
        System.out.println("Result of the reversed number " + num2 + " is: " + reversenum1);
    }
}
