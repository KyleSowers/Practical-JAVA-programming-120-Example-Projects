//PRACTICE 75: A PROGRAM TO CONVERT FROM DECIMAL TO OCTAL
package DecimalToOctal;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        //declare attributes
        int DNum, x = 1, y, num1;
        //declare new array
        int ONum[] = new int[100];
        //create new scanner
        Scanner sc = new Scanner(System.in);
        //request value from user
        System.out.println("Please insert Decimal Number only: ");
        //store value
        DNum = sc.nextInt();
        //additional store of value
        num1 = DNum;
        //under condition, factor octal
        while (num1 != 0) {
            ONum[x++] = num1 % 8;
            num1 = num1 / 8;
        }
        //read and print result from array
        System.out.print("Octal equivalent of " + DNum + " is " );
        for (y = x - 1; y > 0; y--) {
            System.out.print(ONum[y]);
        }
    }
}
