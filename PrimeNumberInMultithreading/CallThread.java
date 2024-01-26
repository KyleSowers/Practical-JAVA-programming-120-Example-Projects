//PRACTICE 117: A PROGRAM TO FIND PRIME NUMBERS USING MULTITHREADING
package PrimeNumberInMultithreading;

class GetPrime extends Thread {

    public void run() {

        int num1, num2 = 2;
        boolean res;

        for (num2 = 2; num2 <= 100; num2++) {

            if (num2 % num1 == 0) {

                res = true;
                break;
            }
        }
    }
}

public class CallThread {
    public static void main(String[] args) {

    }
}
