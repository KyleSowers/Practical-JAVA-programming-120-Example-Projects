package MethodOverriding;

public class First {
    int x, y;
    First(int a, int b) {
        x = a;
        y = b;
    }

    void display() {
        System.out.println("x:" + x);
        System.out.println("y:" + y);
    }
}

class Second extends First {
    int z;
    Second(int a, int b, int c) {
        super(a, b);
        z = c;
    }
    void display() {
        super.display();
        System.out.println("z:" + z);
    }
}
