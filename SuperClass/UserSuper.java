//PRACTICE 15: A PROGRAM FOR SUPER CLASS
package SuperClass;

class FirstSuper {
    //create variable instances
    int x, y;
    //create constructor with to int values, stores values in variable instances
    FirstSuper(int a, int b) {
        x = a;
        y = b;
    }
    //create void method for outputs to console
    void show() {
        System.out.println("Value of X is: " + x);
        System.out.println("Value of Y is: " + y);
    }
}

class SecondSuper extends FirstSuper {
    //create additional variable instance
    int z;
    //create constructor to intake all three instance variable values, calls upon super variables and stores additional value
    SecondSuper(int a, int b, int c) {
        super(a, b);
        z = c;
    }
    //Method calls on super, outputs super output with new output
    void show() {
        super.show();
        System.out.println("Value of Z is: " + z);
    }
}

public class UserSuper {
    public static void main(String args[]) {
        //create new instance of SecondSuper with values
        SecondSuper fs = new SecondSuper(100, 200, 300);
        //new instance applies the show() method for output
        fs.show();
    }
}

