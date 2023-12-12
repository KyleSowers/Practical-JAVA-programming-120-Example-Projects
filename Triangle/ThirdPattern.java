package Triangle;

public class ThirdPattern {
    public static void main(String args[]) {
        //declare instance variables
        int x, y;
        //nested loop to determine output values with print statements
        for (x = 7; x >= 1; x--) {
            for (y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
