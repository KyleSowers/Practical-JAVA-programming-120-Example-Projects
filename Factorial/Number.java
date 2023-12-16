//PRACTICE 31: A PROGRAM  FOR CALCULATING FACTORIAL
package Factorial;

import java.util.Scanner;

public class Number {
    public static void main(String args[]) {
        //declare instance variables
        int x, num1, num2 = 1;
        //ask for number
        System.out.println("Please insert a number");
        //make scanner
        Scanner sc = new Scanner(System.in);
        //store input value
        num1 = sc.nextInt();
        x = num1;
        //check value, if not postitive print, if positive move to else condition
        if (num1 < 0) {
            System.out.println("PLease insert only positive numbers");
        } else {
            while (num1 >= 1) {
                //equation for factorial
                num2 *= num1;
                num1 -= 1;
            }
            //produce initial value and its factorial
            System.out.println("Result of Factorial of " + x + " is: " + num2);
        }
    }
}
