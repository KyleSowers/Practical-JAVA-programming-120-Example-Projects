//PRACTICE 117: A PROGRAM TO FIND PRIME NUMBERS USING MULTITHREADING
package PrimeNumberInMultithreading;
//class for method to determine prime number multithreading
class GetPrime extends Thread {
    //method to determine prime number multithreading
    public void run() {
        //declare fields
        int num1, num2 = 2;
        boolean res;
        //factoring
        for (num2 = 2; num2 <= 100; num2++) {

            res = false;
            for (num1 = 2; num1 < num2; num1++) {

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
}

public class CallThread {
    public static void main(String[] args) {
        //create new object/instance
        GetPrime gp = new GetPrime();
        //call method to run with new object/instance created
        gp.start();
    }
}
