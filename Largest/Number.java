//PRACTICE 29:  A PROGRAM TO DETECT LARGEST NUMBER INPUT FROM A USER
package Largest;

import java.util.Scanner;

public class Number {
    public static void main(String args[]) {
        //declare the instance variables to be used
        int x, y, z;
        //request user to provide values
        System.out.println("PLease insert 3 different integer numbers: ");
        //add new scanner to read user input
        Scanner sc = new Scanner(System.in);
        //store user values
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        //condition if-else if-else to determine the largest and give correct print statement
        if (x > y && x > z) {
            System.out.println("Number one is the largest");
        } else if (y > x && y > z) {
            System.out.println("Number two is the largest");
        } else if (z > x && z > y) {
            System.out.println("Number three is the largest");
        } else {
            System.out.println("These numbers are the same");
        }
    }
}
