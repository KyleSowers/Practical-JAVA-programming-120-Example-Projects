//PRACTICE 15: A PROGRAM FOR SUPER CLASS
package SuperClass;

class FirstSuper {
    int x, y;
    FirstSuper(int a, int b) {
        x = a;
        y = b;
    }
    void show() {
        System.out.println("Value of X is: " + x);
        System.out.println("Value of Y is: " + y);
    }
}

class SecondSuper extends FirstSuper {
    int z;

    SecondSuper(int a, int b, int c) {
        super(a, b);
        z = c;
    }

}

