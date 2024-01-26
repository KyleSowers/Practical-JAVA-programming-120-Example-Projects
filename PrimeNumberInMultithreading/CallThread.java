//PRACTICE 117: A PROGRAM TO FIND PRIME NUMBERS USING MULTITHREADING
package PrimeNumberInMultithreading;

class GetPrime extends Thread {

    public void run() {

        int num1, num2 = 2;
        boolean res;

        res = false;
        for (num1 = 2; num2 <= 100; num2++) {

            if (num2 % num1 == 0) {

                res = true;
                break;
            }
        }
        if (res == false) {
            System.out.println(num2 + " is a prime number");
        }
    }
}

public class CallThread {
    public static void main(String[] args) {

        GetPrime gp = new GetPrime();
        gp.start();
    }
}
