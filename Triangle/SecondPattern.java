//PRACTICE 22: A PROGRAM TO DRAW TRIANGULAR PATTERN (2)
package Triangle;

public class SecondPattern {
    public static void main(String args[]) {
        //declare instance variables
        int x, y, z;
        //outerloop for initial values
        for (x = 7; x >= 1; x--){
            //first inner loop prints empty characters
            for (y = 1; y < x; y++) {
                System.out.print(" ");
            }
            //second inner loop print asterisks based on value of outer loops x
            for (z = 7; z >= x; z--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
