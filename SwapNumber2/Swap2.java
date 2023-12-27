//PRACTICE 62: A PROGRAM TO SWAP TWO DIFFERENT NUMBERS (2)
package SwapNumber2;

public class Swap2 {
    public static void main(String[] args) {
        //declare attributes with values
        int x = 200;
        int y = 500;
        //print before swap values
        System.out.println("Values before swapping");
        System.out.println("Value of x is: " + x);
        System.out.println("Value of y is: " + y);
        //arithmatic to create swap
        x = x + y;
        y = x - y;
        x = x - y;
        //create new line
        System.out.println("\n");
        //print result of swapped attribute values
        System.out.println("Values after swapping");
        System.out.println("Value of x is: " + x);
        System.out.println("Value of y is: " + y);
    }
}
