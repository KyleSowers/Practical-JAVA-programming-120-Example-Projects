//PRACTICE 64: A PROGRAM TO DETECT A LEAP YEAR
package LeapYear;

import java.util.Scanner;

public class Year {
    public static void  main(String[] args) {
        //ask user for a year
        System.out.println("Please insert a preferred year: ");
        //create new scanner to read user input
        Scanner sc = new Scanner(System.in);
        //declare new variable and store input value
        int yr = sc.nextInt();
        //using modulus/operators determine if leap year and print correct result
        if ((yr % 400 == 0) || ((yr % 4 == 0) && (yr % 100 != 0))) {
            System.out.println("This year : " + yr + " is a leap year");
        } else {
            System.out.println("This year " + yr + " is not a leap year");
        }
    }
}
