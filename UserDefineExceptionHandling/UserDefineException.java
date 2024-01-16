//PRACTICE 104: A PROGRAM FOR USER DEFINE EXCEPTION
package UserDefineExceptionHandling;

class DefineException extends Exception{
    //new string attribute
    String sr1;
    //new method with string arguement
    DefineException(String sr2) {
        //transfer of value
        sr1 = sr2;
    }
    //new method
    public String toString() {
        return ("Our result is: " + sr1);
    }
}

public class UserDefineException {
    public static void main(String[] args) {
        //try-catch for exceptions
        try {
            throw new DefineException("A user defined Exception");
        } catch (DefineException exp) {
            System.out.println("This is inside the catch block");
            System.out.println(exp);
        }
    }
}
