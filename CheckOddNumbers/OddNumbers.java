//PRACTICE 122: A PROGRAM TO CHECK FOR ODD NUMBERS
package CheckOddNumbers;

class Odd extends Thread {

    public void run() {
        for (int x = 1; x <= 10; x++) {
            if (x % 2 !=0) {
                System.out.println(x + " is an odd number");
            }
        }
    }
}

public class OddNumbers {

    public static void main(String[] args) {

    }
}
