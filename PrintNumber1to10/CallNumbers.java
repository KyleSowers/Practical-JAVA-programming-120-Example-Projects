//PRACTICE 120: A PROGRAM TO PRINT OUT NUMBERS
package PrintNumber1to10;

class PrintNumbers extends Thread {

    public void run() {
        for (int x = 1; x <= 10; x++) {
            System.out.print(" " + x);
        }
    }
}

public class CallNumbers {

    public static void main(String[] args) {

    }
}
