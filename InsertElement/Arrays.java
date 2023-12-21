//PRACTICE 44: A PROGRAM TO INSERT ELEMENT IN AN ARRAY
package InsertElement;

import java.util.Scanner;

public class Arrays {
    public static void main(String args[]) {
        //declare attributes(variables or fields)
        int x, y, z;
        //create new scanner for class
        Scanner sc = new Scanner(System.in);
        //print request to user for length of array
        System.out.println("Please insert any element amount of your choice: ");
        //read and store user input value into attribute x
        x = sc.nextInt();
        //declare new array
        int num1[] = new int[x + 1];
        //print request element values from user
        System.out.println("Please insert array element values now: ");
        //read, loop, and store input values into new array
        for (int w = 0; w < x; w++) {
            num1[w] = sc.nextInt();
        }
        //print request for position of a new element from user
        System.out.println("Choose a preferred position for your new element: ");
        //read and store input value into attribute y
        y = sc.nextInt();
        //print request element value form user
        System.out.print("Insert your preferred element value: ");
        //read and store input value into attribute z
        z = sc.nextInt();
        //loop through array adding new element to desired position
        for (int  w = (x - 1); w >= (y - 1); w--) {
            num1[w + 1] = num1[w];
        }
        num1[y - 1] = z;
        //print result
        System.out.print("The result after inserting element is: ");
        //read new array for printing result
        for (int w = 0; w < x; w++) {
            System.out.print(num1[w] + ",");
        }
        System.out.print(num1[x]);
    }
}
