//PRACTICE 101: A PROGRAM TO IMPLEMENT EXCEPTION HANDLING USING FINALLY BLOCK
package ExceptionHandlingUsingFinally;

public class ExceptionHandling {
    //create method
    public String FinallyBlock() {
        //method try block
        try {
            return "Return from try block";
            //method finally block will execute no matter result of try block
        } finally {
            System.out.println("Return from finally block after return statement");
        }
    }
    public static void main(String[] args) {
        //call for class method to print
        System.out.println(new ExceptionHandling().FinallyBlock());
    }
}
