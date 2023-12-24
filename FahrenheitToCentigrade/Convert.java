package FahrenheitToCentigrade;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        float radian;
        double degree;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert value in Fahrenheit: ");
        radian = sc.nextFloat();

        degree = (radian - 32) / 1.8;

        System.out.println("Celsius equivalent of: " + radian + " Radian is " + degree + " Degree");
    }
}
