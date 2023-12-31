//PRACTICE 73: A PROGRAM TO CALCULATE ARITHMATIC MEAN
package ArithmaticMean;

import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {

        int x, y, add = 0, meannum;
        int num1[] = new int[50];

        Scanner sc = new Scanner(System.in);

        System.out.println("Please choose a number:");
        x = sc.nextInt();

        System.out.println("Please enter only " + x + " numbers");
        for (y = 0; y < x; y++) {
            num1[y] = sc.nextInt();
            add = add + num1[y];
        }
        meannum = add / x;

        System.out.println("Result of Arithmatic Mean is: " + meannum);
    }
}
