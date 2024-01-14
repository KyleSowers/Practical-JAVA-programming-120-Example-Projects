//PRACTICE 102: A PROGRAM TO IMPLEMENT TRY-CATCH-FINALLY BLOCKS
package TryCatchFinallyBlocks;

public class TryCatchFinally {

    public static void main(String[] args) {

        int x = 12;
        int y = 0;
        try {
            int z = x/y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("Error occurred " + e);
        } finally {
            System.out.println("This is finally");
        }

    }
}
