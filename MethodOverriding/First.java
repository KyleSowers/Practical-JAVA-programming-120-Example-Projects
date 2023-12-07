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
