//PRACTICE 72: A PROGRAM TO CHECK ARMSTRONG NUMBERS
package ArmstrongNumber;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        int x, y, z = 0, ams;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert only positive numbers: ");

        x = sc.nextInt();
        y = x;

        while (y != 0) {
            ams = y % 10;
            z = z + ams * ams * ams;
            y = y / 10;
        }
        if (z == x) {
            System.out.println(x + " is an Armstrong Number");
        } else {
            System.out.println(x + " is not an Armstrong Number");
        }
    }
}
