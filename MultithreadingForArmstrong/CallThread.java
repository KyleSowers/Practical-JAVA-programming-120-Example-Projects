//PRACTICE 116: A PROGRAM TO FIND ARMSTRONG USING MULTITHREADING
package MultithreadingForArmstrong;

class GetArmstrong extends Thread {
    //create class to establish method
    public void run() {
        //declare new attributes/variables
        int add = 0, res = 0, x, y;
        //factor
        for (y = 1; y < 500; y++) {
            x = y;
            add = res = 0;
            while (x > 0) {
                res = x % 10;
                add = add + (res * res * res);
                x = x / 10;
            }
            if (add == y) {
                System.out.println(" " + y);
            }
        }
    }
}
public class CallThread {
    //main method
    public static void main(String[] args) {
        //create new instance of class GetArmstrong
        GetArmstrong ga = new GetArmstrong();
        //use new instance to call start method
        ga.start();
    }
}
