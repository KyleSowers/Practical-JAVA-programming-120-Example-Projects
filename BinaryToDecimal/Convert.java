//PRACTICE 76: A PROGRAM TO CONVERT FROM BINARY TO DECIMAL
package BinaryToDecimal;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        //declare new attributes
        int BNum, DNum = 0, x = 1, num1;
        //create new class scanner
        Scanner sc = new Scanner(System.in);
        //request binary value from user
        System.out.println("Please insert only binary number: ");
        //store value
        BNum = sc.nextInt();
        //declare new attribute and store value
        int BNum2 = BNum;
        //while loop verifies condition and performs arithmatic for conversion
        while (BNum != 0) {
            num1 = BNum % 10;
            DNum = DNum + num1 * x;
            x = x * 2;
            BNum = BNum / 10;
        }
        //print results
        System.out.print("Decimal equivalent of " + BNum2 + " is " + DNum);
    }
}
