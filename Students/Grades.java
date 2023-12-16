//PRACTICE 32: A PROGRAM TO DETERMINE STUDENT'S GRADE
package Students;

import java.util.Scanner;

public class Grades {
    public static void main(String args[]) {
        //declare instance variable
        int x;
        //create new scanner
        Scanner sc = new Scanner(System.in);
        //request grade/score
        System.out.println("PLease, enter your score: ");
        //store input
        x = sc.nextInt();
        //run if-else_if-else statement block
        //check for failing grade and print
        if (x >= 0 && x <=40) {
            System.out.println("You Failed");
            //check for passing grade and print
        } else if (x > 40 && x < 70) {
            System.out.println("You Passed");
            //check for excellent grade and print
        } else if (x >= 70) {
            System.out.println("Excellent");
            //check for negative numbers and print
        } else if (x < 0) {
            System.out.println("Only positive numbers are allowed");
            //check for all else and print
        } else {
            System.out.println("Please insert valid numbers");
        }
    }
}
