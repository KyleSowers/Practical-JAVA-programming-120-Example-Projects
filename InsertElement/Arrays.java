package InsertElement;

import java.util.Scanner;

public class Arrays {
    public static void main(String args[]) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert any element amount of your choice: ");

        x = sc.nextInt();
        int num1[] = new int[x-1];
        System.out.println("Please insert array element values now: ");
        for (int w = 0; w < x; w++) {
            num1[w] = sc.nextInt();
        }
        System.out.println("Choose a preferred position for your new element: ");
        y = sc.nextInt();
        System.out.print("Insert your preferred element value: ");
        z = sc.nextInt();
        for (int  w = (x - 1); w >= (y - 1); w--) {
            num1[w + 1] = num1[w];
        }
    }
}
