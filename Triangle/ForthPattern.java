package Triangle;

public class ForthPattern {
    public static void main(String args[]) {
            //declare instance variables
            int x, y;
            //loop for value of asterisks, starting at value 7, post decremented, not lower than 1
            for (x = 7; x <= 7; x++) {
                for (y = 1; y <= x; y++) {
                    //print statement for value of asterisks determined by outer x for loop
                    System.out.print("*");
                }
                //Prints separating each iteration by new line to make the triangle
                System.out.println();
            }
    }
}
