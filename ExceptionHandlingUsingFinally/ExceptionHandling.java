//PRACTICE 101: A PROGRAM TO IMPLEMENT EXCEPTION HANDLING USING FINALLY BLOCK
package ExceptionHandlingUsingFinally;

public class ExceptionHandling {

    public String FinallyBlock() {
        try {
            return "Return from try block";
        } finally {
            System.out.println("Return from finally block after return statement");
        }
    }
    public static void main(String[] args) {

    }
}
