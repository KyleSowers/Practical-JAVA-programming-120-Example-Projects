//PRACTICE 21: A PROGRAM TO DRAW TRIANGULAR PATTERN(1)
package Triangle;

public class Pattern {
    public static void main(String args[]) {
        //declare instance variables
        int x, y, z;
        //Outerloop starts at 7 and decrements through iterations decremented, but not less than 1
        for (x = 7; x >= 1; x--) {
            //nested loop responsible for printing the amount of blank spaces before the outer loops value
            for (y = 7; y > x; y--) {
                System.out.print(" ");
            }
            //nested loop responsible for printing the asterisks determined by the value of x
            for (z = 1; z <= x; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}