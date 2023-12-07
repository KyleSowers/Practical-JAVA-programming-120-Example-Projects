package MethodOverloading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Overload {

    String add(String a, String b) {
        return (a + b);
    }
}

class StringOverload {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String x, y;
        System.out.println("Please Enter two values: ");
        x = br.readLine();
        y = br.readLine();

        Overload ol = new Overload();
        System.out.println("Result of your two values are: " + ol.add(x, y));
    }
}

