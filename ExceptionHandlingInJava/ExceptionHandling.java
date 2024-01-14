//PRACTICE 99: A PROGRAM FOR EXCEPTION HANDLING
package ExceptionHandlingInJava;

public class ExceptionHandling {

    public static void main(String[] args) {
        //declare attributes with values
        int a =30;
        int b = 0;
        //try statement, with arithmatic
        try {
            float c = a/b;
            System.out.println("The result of C is : " + c);
            //catch statement that catches the arithmatic error of use of  0 in multiplication
        } catch (ArithmeticException e) {
            System.out.println("Please do not use 0 as a divider");
        }
    }
}
