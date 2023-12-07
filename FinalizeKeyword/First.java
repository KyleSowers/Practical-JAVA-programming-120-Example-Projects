package FinalizeKeyword;

public class First {
    int x;
    public First(int x) {
        this.x = x;
    }
    protected void finalize() throws Throwable {
        System.out.println("welcome to Finalize Keyword in Java Programming " + x);
    }
}
