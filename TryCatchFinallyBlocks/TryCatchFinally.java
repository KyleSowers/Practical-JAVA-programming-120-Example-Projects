//PRACTICE 102: A PROGRAM TO IMPLEMENT TRY-CATCH-FINALLY BLOCKS
package TryCatchFinallyBlocks;

public class TryCatchFinally {

    public static void main(String[] args) {
        //declare new attributes with values
        int x = 12;
        int y = 0;
        //add try block with attempt for some method or arithmetic to provide attempted result
        try {
            int z = x/y;
            System.out.println(z);
            //catch if there is an arithmetic exception and provide statement if so
        } catch (ArithmeticException e) {
            System.out.println("Error occurred " + e);
            //create an output to identify it is the end of the blocks, no matter result prior
        } finally {
            System.out.println("This is finally");
        }

    }
}
