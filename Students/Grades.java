package Students;

import java.util.Scanner;

public class Grades {
    public static void main(String args[]) {
        int x;

        Scanner sc = new Scanner(System.in);
        System.out.println("PLease, enter your score: ");

        x = sc.nextInt();
        if (x >= 0 && x <=40) {
            System.out.println("You Failed");
        } else if (x > 40 && x < 70) {
            System.out.println("You Passed");
        }
    }
}
