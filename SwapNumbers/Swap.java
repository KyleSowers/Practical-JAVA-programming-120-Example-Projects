//PRACTICE 61: A PROGRAM TO SWAP TWO DIFFERENT NUMBERS
package SwapNumbers;

public class Swap {
    public static void  main(String[] args) {

        int x = 200;
        int y = 500;

        System.out.println("Values before swapping");
        System.out.println("Value of x is: " + x);
        System.out.println("Value of y is: " + y);

        swapvalues(x, y);
    }
    public static void swapvalues(int x, int y) {
        int swapv = x;
        x = y;
        y = swapv;

        System.out.println("\n");

        System.out.println("Values after swapping");
        System.out.println("Value of x is: " + x);
        System.out.println("Value of y is " + y);
    }
}
