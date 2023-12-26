//PRACTICE 58: A PROGRAM TO CONVERT CENTIGRADE TO FAHRENHEIT
package CentigradeToFahrenheit;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {

        float degreeF;
        double degreeC;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert values in Celsius");
        degreeF = sc.nextFloat();

        degreeC = (1.8 * degreeF) + 32;

        System.out.println("Celsius equivalent of " + degreeF + " is: " + degreeC);
    }
}
