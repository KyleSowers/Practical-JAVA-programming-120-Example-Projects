//PRACTICE 75: A PROGRAM TO CONVERT FROM DECIMAL TO OCTAL
package DecimalToOctal;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {

        int DNum, x = 1, y, num1;
        int ONum[] = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert Decimal Number only: ");
        DNum = sc.nextInt();

        num1 = DNum;

        while (num1 != 0) {
            ONum[x++] = num1 % 8;
            num1 = num1 / 8;
        }
        System.out.print("Octal equivalent of " + DNum + " is " );
    }
}
