package UseRunnableThreadInterface;

public class RunnableInterface implements Runnable{

    public static void main(String[] args) {

        RunnableInterface runthread = new RunnableInterface();
        Thread th = new Thread(runthread);
        th.start();
    }
}
