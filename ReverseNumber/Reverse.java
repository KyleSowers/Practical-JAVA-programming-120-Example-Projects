//PRACTICE 59: A PROGRAM TO REVERSE A NUMBER USING FOR LOOP
package ReverseNumber;
import java.util.*;
public class Reverse {
    public static void main(String args[]) {
        //declare attributes
        int num1 = 0, num2, reversenum1 = 0;
        //request numbers from user
        System.out.println("Please insert different numbers");
        //create scanner
        Scanner sc = new Scanner(System.in);
        //read and store user value
        num2 = num1 = sc.nextInt();
        //loop and solve for reverse number
        for (;num1 !=0; ) {
            reversenum1 = reversenum1*10;
            reversenum1 = reversenum1 + num1%10;
            num1 = num1/10;
        }
        //provide result
        System.out.println("The reversed result of " + num2 + " is: " + reversenum1);
    }

}
