//PRACTICE 93: A PROGRAM TO CREATE A THREAD USING RUNNABLE INTERFACE
package UseRunnableThreadInterface;

public class RunnableInterface implements Runnable{

    public static void main(String[] args) {
        //create instance
        RunnableInterface runthread = new RunnableInterface();
        //create instance associated with...
        Thread th = new Thread(runthread);
        //call upon overriden run method
        th.start();
    }
    //override run method
    @Override
    public void run() {

        System.out.println("This is a runnable interface...");
    }
}
