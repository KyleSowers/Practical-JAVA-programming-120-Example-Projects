//PRACTICE 73: A PROGRAM TO CALCULATE ARITHMATIC MEAN
package ArithmaticMean;

import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        //declare attributes and new array
        int x, y, add = 0, meannum;
        int num1[] = new int[50];
        //create new scanner for class
        Scanner sc = new Scanner(System.in);
        //request amount of array elements from user
        System.out.println("Please choose a number:");
        //store value of array length
        x = sc.nextInt();
        //request the amount of numbers equaling the decided array length
        System.out.println("Please enter only " + x + " numbers");
        //loop to read/store/create array with user element values
        for (y = 0; y < x; y++) {
            //add each user input as element of array
            num1[y] = sc.nextInt();
            //add each element value and store into attribute
            add = add + num1[y];
        }
        //factor mean
        meannum = add / x;
        //print result
        System.out.println("Result of Arithmatic Mean is: " + meannum);
    }
}
