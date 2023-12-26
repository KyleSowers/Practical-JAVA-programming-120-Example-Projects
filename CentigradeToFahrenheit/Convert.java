//PRACTICE 58: A PROGRAM TO CONVERT CENTIGRADE TO FAHRENHEIT
package CentigradeToFahrenheit;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        //declare attributes to use
        float degreeF;
        double degreeC;
        //create new scanner
        Scanner sc = new Scanner(System.in);
        //request value from user
        System.out.println("Please insert values in Celsius");
        //read and store value
        degreeF = sc.nextFloat();
        //convert value and store result
        degreeC = (1.8 * degreeF) + 32;
        //print results
        System.out.println("Celsius equivalent of " + degreeF + " is: " + degreeC);
    }
}
