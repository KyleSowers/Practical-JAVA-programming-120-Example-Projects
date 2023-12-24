//PRACTICE 53: A PROGRAM TO USE FOR LOOP
package ForLoop;

public class Loop {
    public static void main(String[] args) {
        //declare new attributes
        int x, y;
        //create loop that reads/compares x value and prints result if met
        for (x = 10; x >= 1; x--) {
            System.out.println("Value of x is: " + x);
        }
        //print to new line before next loop
        System.out.println("\n");
        //create a loop for y variable, that if met prints results
        for  (y = 1; y <= 10; y++) {
            System.out.println("The value of y is: " + y);
        }
    }
}
