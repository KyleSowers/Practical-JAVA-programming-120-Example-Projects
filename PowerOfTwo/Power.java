//PRACTICE 98: A PROGRAM TO DETECT IF A NUMBER IS OF POWER OF 2
package PowerOfTwo;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        //ask user for a number
        System.out.println("Please, insert a number: ");
        //create new scanner
        Scanner sc = new Scanner(System.in);
        //use scanner to store user value in new attribute
        int num1 = sc.nextInt();
        //through if-else, check condition for power of 2 and print result
        if ((num1 & num1 - 1) == 0) {
            System.out.println("The number " + num1 + " is a power of 2");
        } else {
            System.out.println("The number " + num1 + " is not a power of 2");
        }
    }
}
