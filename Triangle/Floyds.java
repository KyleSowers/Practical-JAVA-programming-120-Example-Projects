//PRACTICE 2614: A PROGRAM TO DRAW FLOYDS TRIANGLE
package Triangle;

import java.util.Scanner;

public class Floyds {

    public static void main(String args[]) {
        //declare instance variables
        int x, num1 = 1, y, z;
        //add new scanner
        Scanner sc = new Scanner(System.in);
        //ask user for desired amount of rows
        System.out.println("PLease insert number of rows: ");
        //store input value into variable x
        x = sc.nextInt();
        System.out.println("Result of Floyds Triangle is: ");
        //iterates over each row from 1 to specified number of rows (x)
        for (y = 1; y < x; y++) {
            //iterates within each row, printing numbers from num1 onwards
            for (z = 1; z <= y; z++) {
                //prints current value of num1 followed by a space
                System.out.print(num1 + " ");
                num1++;
            }
            System.out.println();
        }
    }
}
