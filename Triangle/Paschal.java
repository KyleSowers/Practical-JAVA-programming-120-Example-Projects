package Triangle;

import java.util.Scanner;

public class Paschal {

    public static void main(String args[]) {
        //declare instance variables
        int x, y, z;
        //add new scanner for user input
        Scanner sc = new Scanner(System.in);
        //request how many rows from user
        System.out.println("PLease insert number of rows you want: ");
        //store the user input as value of rows in variable x
        x = sc.nextInt();
        System.out.println("result of Paschal Triangle is: ");
        //iterate over each row, where x is the number of rows specified by the user and y represents the current row index, ranging from 0 to x - 1
        for (y = 0; y < x; y++) {
            //num1 is initialized to 2, will be used to generate the values in each row.
            int num1 = 2;
            //print leading spaces to format output,leading spaces decrease as you move down the rows to create an inverted triangle pattern
            System.out.format("%" + (x - y) * 2 + "s", "");
            //iterate over each element in the current row (y), z represents the column index within the current row.
            for  (z = 0; z <= y; z++) {
                //print value of num1 with a width of 4 characters, width ensures proper alignment of the values in output.
                System.out.format("%4d", num1);
                //update value of num1 for next iteration, calculate next value in row based on the Pascal's Triangle rule.
                num1 = num1 * (y - z) / (z + 1);
            }
            System.out.println();
        }
    }
}
