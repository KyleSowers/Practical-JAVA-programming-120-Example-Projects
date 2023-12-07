//PRACTICE 8: A PROGRAM FOR STRING OVERLOADING
package MethodOverloading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Overload {
    //Creating method for addition of strings
    String add(String a, String b) {
        return (a + b);
    }
}

class StringOverload {
    public static void main(String args[]) throws IOException {
        //Adding buffered reader to read user input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //define two strings
        String x, y;
        //Ask user for values
        System.out.println("Please Enter two values: ");
        //Store values into Strings
        x = br.readLine();
        y = br.readLine();
        //Create new instance of Overload
        Overload ol = new Overload();
        //Return result of called method of Overload (add) to user
        System.out.println("Result of your two values are: " + ol.add(x, y));
    }
}

