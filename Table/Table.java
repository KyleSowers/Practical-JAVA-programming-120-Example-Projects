package Table;

import java.util.Scanner;

public class Table {
    public static void main(String args[]) {
        int x, y;
        System.out.println("Please insert a number to print Multiplication Table");

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("Result of Multiplication Table of " + x + " is: ");
        for (y = 1; y <= 20; y++) {
            System.out.println(x + "*" + y + "=" + (x*y));
        }
    }
}
