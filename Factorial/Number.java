package Factorial;

import java.util.Scanner;

public class Number {
    public static void main(String args[]) {
        int x, num1, num2 = 1;
        System.out.println("Please insert a number");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        x = num1;
        if (num1 < 0) {
            System.out.println("PLease insert only positive numbers");
        } else {
            while (num1 >= 1) {
                num2 *= num1;
                num1 -= 1;
            }
            System.out.println("Result of Factorial of " + x + " is: " + num2);
        }
    }
}
