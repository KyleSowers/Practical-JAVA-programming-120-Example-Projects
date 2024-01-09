//PRACTICE 92: A PROGRAM TO RUN A THREAD
package ThreadInJava;

public class UseThread extends Thread {
    //initialize the run method with print statement
    public void run() {
        System.out.println("This is a runnable thread...");
    }
    //create main method
    public static void main(String[] args) {
        //new instance of UseThread
        UseThread ust = new UseThread();
        //use of start method invokes the run method
        ust.start();
    }
}
