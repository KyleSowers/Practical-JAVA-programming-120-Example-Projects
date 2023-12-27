//PRACTICE 61: A PROGRAM TO SWAP TWO DIFFERENT NUMBERS
package SwapNumbers;

public class Swap {
    public static void  main(String[] args) {
        //declare attributes with associated values to swap
        int x = 200;
        int y = 500;
        //show user values before swapping method takes place
        System.out.println("Values before swapping");
        System.out.println("Value of x is: " + x);
        System.out.println("Value of y is: " + y);
        //call swapping method
        swapvalues(x, y);
    }
    //create swapping method that will be called with associated attributes as arguments for method
    public static void swapvalues(int x, int y) {
        //method for swapping attributes
        int swapv = x;
        x = y;
        y = swapv;
        //establish new line for output of result
        System.out.println("\n");
        //print results of swap
        System.out.println("Values after swapping");
        System.out.println("Value of x is: " + x);
        System.out.println("Value of y is " + y);
    }
}
