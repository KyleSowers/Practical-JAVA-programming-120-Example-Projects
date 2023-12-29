//PRACTICE 68: SUM OF DIGITS FROM USER
package SumOfDigits;

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert some numbers: ");
        int num1 = sc.nextInt();

        int add = 0;
        int addall = num1;
        while (addall != 0) {
            int sum = addall % 10;
            add += sum;
            addall /= 10;
        }
        System.out.println("The result of sum of " + num1 + " is " + add);
    }
}
