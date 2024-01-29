//PRACTICE 121: A PROGRAM TO CHECK FOR EVEN NUMBERS
package CheckEvenNumbers;

class Even extends Thread {

    public void run() {
        for (int x = 1; x <= 10; x++) {
            if (x % 2 == 0) {
                System.out.println(x + " is an even number");
            } else {
                System.out.println(x + " is not an even number");
            }
        }
    }
}

public class EvenNumbers {

    public static void main(String[] args) {

        Even e = new Even();
        e.start();
    }
}
