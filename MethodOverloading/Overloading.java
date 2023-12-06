//PRACTICE 7: A PROGRAM FOR METHOD OVERLOADING
package MethodOverloading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Overloading {
    //Creating a method for two integers and the sum of..
    int sum(int num1, int num2) {
        return(num1 * num2);
    }
}

    class MethodCall {
    public static void main(String args[]) throws NumberFormatException, IOException {
        //Define variables
        int x, y;
        //Establish new BufferReader to read user input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Ask user for integers
        System.out.println("Please, enter two integers separately: ");
        //Store user results into x and y defined variables
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());
        //Call on the Overloading class, creating new instance of
        Overloading ol = new Overloading();
        //Returning Result statement including use of Overloading sum method of stored x and y variables
        System.out.println("Result of your numbers are : " + ol.sum(x, y));
    }
    }