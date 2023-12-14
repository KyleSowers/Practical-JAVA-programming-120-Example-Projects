package Triangle;

import java.util.Scanner;

public class Area {
    public static void main(String args[]) {
        //create new scanner
        Scanner sc = new Scanner(System.in);
        //request width and height values
        System.out.println("PLease enter a Width and Height of the Triangle: ");
        //store width and height values
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        //store equation value for area of triangle
        double result = (w*h)/2;
        //display results
        System.out.println("Result of area of triangle is: " + result);
    }
}
