//PRACTICE 98: A PROGRAM TO DETECT IF A NUMBER IS OF POWER OF 2
package PowerOfTwo;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {

        System.out.println("Please, insert a number: ");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        if ((num1 & num1 - 1) == 0) {
            System.out.println("The number " + num1 + " is a power of 2");
        } else {
            System.out.println("The number " + num1 + " is not a power of 2");
        }
    }
}
