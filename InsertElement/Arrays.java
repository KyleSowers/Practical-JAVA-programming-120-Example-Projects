package InsertElement;

import java.util.Scanner;

public class Arrays {
    public static void main(String args[]) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert any element of your choice: ");

        x = sc.nextInt();
        int num1[] = new int[x-1];
        System.out.println("Please insert arrays of elements now: ");
        for (int w = 0; w < x; w++) {
            num1[w] = sc.nextInt();
        }
    }
}
