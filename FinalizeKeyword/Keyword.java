package FinalizeKeyword;

class First {
    //creating an instance variable
    int x;
    //creating a constructor, taking an int value and storing in the instance variable
    public First(int x) {
        this.x = x;
    }
    //creating a method for console output
    protected void finalize() throws Throwable {
        System.out.println("Welcome to Finalize Keyword in Java Programming " + x);
    }
}

public class Keyword {
    public static void main(String args[]) {
        //creating two new object instances of First class with values
        First f1 = new First(100);
        First f2 = new First(200);
        //f2 is assigned to f1, meaning both reference the same object First(200)
        f1 = f2;
        System.gc(); //garbage collector may output f1 due to last line
        System.out.println("Hello Word");
    }
}

