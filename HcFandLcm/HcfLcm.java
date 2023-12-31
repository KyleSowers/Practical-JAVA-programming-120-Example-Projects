//PRACTICE 74: A PROGRAM TO CALCULATE HCF AND LCM
package HcFandLcm;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {

        int a, b, c, d, e, h, l;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, insert two numbers ");
        a = sc.nextInt();
        b = sc.nextInt();

        c = a;
        d = b;

        while (d != 0) {
            e = d;
            d = c % d;
            c = e;
        }
    }
}
