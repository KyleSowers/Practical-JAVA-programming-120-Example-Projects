//PRACTICE 68: SUM OF DIGITS FROM USER
package SumOfDigits;

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        //new scanner
        Scanner sc = new Scanner(System.in);
        //request numbers
        System.out.println("Please insert some numbers: ");
        //store input from  use of new scanner
        int num1 = sc.nextInt();
        //declare attributes
        int add = 0;
        int addall = num1;
        //condition and factor results
        while (addall != 0) {
            int sum = addall % 10;
            add += sum;
            addall /= 10;
        }
        //print results
        System.out.println("The result of sum of " + num1 + " is " + add);
    }
}
