package EvenOdd;

import java.util.Scanner;

public class Number {
    public static void main(String args[]) {
        int x;
        System.out.println("Please provide a number");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println(x + " is even.");
        } else {
            System.out.println(x + " is odd.");
        }
    }
}
