package FahrenheitToCentigrade;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        //Declared attributes
        float radian;
        double degree;
        //Create new scanner
        Scanner sc = new Scanner(System.in);
        //print request for value
        System.out.println("Please insert value in Fahrenheit: ");
        //store value
        radian = sc.nextFloat();
        //arithmatic for coversion
        degree = (radian - 32) / 1.8;
        //print result
        System.out.println("Celsius equivalent of: " + radian + " Radian is " + degree + " Degree");
    }
}
