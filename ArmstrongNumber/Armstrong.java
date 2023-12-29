//PRACTICE 72: A PROGRAM TO CHECK ARMSTRONG NUMBERS
package ArmstrongNumber;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        //declare new int attributes
        int x, y, z = 0, ams;
        //create new class scanner
        Scanner sc = new Scanner(System.in);
        //request positive numbers from user
        System.out.println("Please insert only positive numbers: ");
        //read and store user input
        x = sc.nextInt();
        //store user value into second attribute through first attribute stored value
        y = x;
        //while loop will factor the attributes
        while (y != 0) {
            ams = y % 10;
            z = z + ams * ams * ams;
            y = y / 10;
        }
        //if else statement will check and share result for Armstrong Number
        if (z == x) {
            System.out.println(x + " is an Armstrong Number");
        } else {
            System.out.println(x + " is not an Armstrong Number");
        }
    }
}
