//PRACTICE 74: A PROGRAM TO CALCULATE HCF AND LCM
package HcFandLcm;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        //declare multiple attributes to factor results
        int a, b, c, d, e, h, l;
        //create new class scanner
        Scanner sc = new Scanner(System.in);
        //ask user for two numbers
        System.out.println("Please, insert two numbers ");
        //store values
        a = sc.nextInt();
        b = sc.nextInt();
        //share values
        c = a;
        d = b;
        //under condition factor attributes to resolve for HCF and LCM values
        while (d != 0) {
            e = d;
            d = c % d;
            c = e;
        }
        //Store variables for HCF and LCM with additional factoring for LCM
        h = c;
        l = (a * b) / h;
        //print results
        System.out.println("The result of HCF is: " + h);
        System.out.println("The result of LCM is: " + l);
    }
}
