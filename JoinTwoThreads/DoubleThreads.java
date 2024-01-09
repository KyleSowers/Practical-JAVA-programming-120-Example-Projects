//PRACTICE 94: A PROGRAM TO JOIN TWO THREADS
package JoinTwoThreads;

public class DoubleThreads {
    public static void main(String[] args) throws InterruptedException {

        Thread FirstThread = new Thread() {
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
        Thread SecondThread = new Thread() {
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + " Just Started");
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + " Just Completed");
                } catch (InterruptedException ex) {

                }
            }
        };
        FirstThread.start();
        FirstThread.join();

        SecondThread.start();
        SecondThread.join();

    }
}
