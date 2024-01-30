//PRACTICE 122: A PROGRAM TO CHECK FOR ODD NUMBERS
package CheckOddNumbers;
//class for desired method using threading
class Odd extends Thread {
    //method to check for odd numbers
    public void run() {
        //for loop declares attribute with value, checks condition, post increments until condition is no loger satisfied
        for (int x = 1; x <= 10; x++) {
            //if for loop condition satisfied, nested if statement divides attribute by two checking there is a remainder value
            if (x % 2 !=0) {
                //prints if there was a remainder value
                System.out.println(x + " is an odd number");
            } else {
                //prints if there was not a remainder value
                System.out.println(x + " is not an odd number");
            }
        }
    }
}

public class OddNumbers {
    //declare main method
    public static void main(String[] args) {
        //create new instance of class "Odd"
        Odd o = new Odd();
        //use instance to call start() method, through extended thread will run class "Odd"s method run()
        o.start();
    }
}
