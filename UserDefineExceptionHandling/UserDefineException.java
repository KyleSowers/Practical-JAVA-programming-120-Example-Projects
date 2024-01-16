//PRACTICE 104: A PROGRAM FOR USER DEFINE EXCEPTION
package UserDefineExceptionHandling;

class DefineException extends Exception{

    String sr1;
    DefineException(String sr2) {
        sr1 = sr2;
    }
    public String toString() {
        return ("Our result is: " + sr1);
    }
}

public class UserDefineException {
    public static void main(String[] args) {
        try {
            throw new DefineException("A user defined Exception");
        }
    }
}
