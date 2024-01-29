//PRACTICE 120: A PROGRAM TO PRINT OUT NUMBERS
package PrintNumber1to10;

//create class for method to print out numbers
class printNumbers extends Thread {
    //method
    public void run() {
        //print out on same line
        for (int x = 1; x <= 10; x++) {
            System.out.print(" " + x);
        }
        //printing results on new lines per iteration
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
    //main method
    public static void main(String[] args) {
        //create new instance/object of printNumbers class
         printNumbers pn = new printNumbers();
         //use new object and Thread to run the run() method
         pn.start();
    }
}
