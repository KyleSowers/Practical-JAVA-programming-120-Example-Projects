//PRACTICE 77: A PROGRAM TO CONVERT FROM DECIMAL TO HEXADECIMAL
package DecimalToHexadecimal;

import java.util.Scanner;

public class Convert {

    public static void  main(String[] args) {
        //declare new attributes
        int DNum, num1;
        String HNum = "";
        //declare new array with specified values
        char Hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        //create new scanner for class
        Scanner sc = new Scanner(System.in);
        //request value from user
        System.out.println("Please, insert Decimal number: ");
        //store user value
        DNum = sc.nextInt();
        //additional store of value in newly declared attribute
        int DNum1 = DNum;
        //while condition is satisfied run conversion
        while (DNum > 0) {
            num1 = DNum % 16;
            HNum = Hex[num1] + HNum;
            DNum = DNum / 16;
        }
        //provide conversion result
        System.out.println("Hexadecimal equivalent of " + DNum1 + " is " + HNum);
    }
}
