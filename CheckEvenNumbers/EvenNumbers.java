//PRACTICE 121: A PROGRAM TO CHECK FOR EVEN NUMBERS
package CheckEvenNumbers;
//class for method to solve for even numbers
class Even extends Thread {
    //method for solving
    public void run() {
        //iterate starting at value 1, post incrementing through and up to 10
        for (int x = 1; x <= 10; x++) {
            //determine if number is even and print result if or if not
            if (x % 2 == 0) {
                System.out.println(x + " is an even number");
            } else {
                System.out.println(x + " is not an even number");
            }
        }
    }
}

public class EvenNumbers {
    //main class
    public static void main(String[] args) {
        //new instance/object of class Even
        Even e = new Even();
        //use instance, through extended thread, to invoke the "Even" class method run()
        e.start();
    }
}
