//PRACTICE 94: A PROGRAM TO JOIN TWO THREADS
package JoinTwoThreads;

public class DoubleThreads {
    public static void main(String[] args) throws InterruptedException {
        //create new instance
        Thread FirstThread = new Thread() {
            //method
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + " Just Started");
                    System.out.println(Thread.currentThread().getName() + " Just Completed");
                } finally {

                }
//                catch (InterruptedException ex) {
//
//                }
            }
        };
        //create new instance
        Thread SecondThread = new Thread() {
            //method
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + " Just Started");
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + " Just Completed");
                } catch (InterruptedException ex) {

                }
            }
        };
        //call instances to start and join
        FirstThread.start();
        FirstThread.join();

        SecondThread.start();
        SecondThread.join();

        System.out.println("main Just Completed");
    }
}
