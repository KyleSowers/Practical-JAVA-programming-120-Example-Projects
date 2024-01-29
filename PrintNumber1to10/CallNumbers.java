//PRACTICE 120: A PROGRAM TO PRINT OUT NUMBERS
package PrintNumber1to10;

class PrintNumbers extends Thread {

    public void run() {
        for (int x = 1; x <= 10; x++) {
            System.out.print(" " + x);
        }
        for (int x = 1; x <= 10; x++) {
            try {
                System.out.println(" " + x);
                Thread.sleep(1000);
            } catch (InterruptedException e){

            }
        }
    }
}

public class CallNumbers {

    public static void main(String[] args) {

    }
}
