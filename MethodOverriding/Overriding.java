package MethodOverriding;

class First {
    //create instance variables
    int x, y;
    //Create First constructor, accepts two int values, stores into instance variables
    First(int a, int b) {
        x = a;
        y = b;
    }
    //Method, void of return value, outputs to console variable instance values
    void display() {
        System.out.println("x:" + x);
        System.out.println("y:" + y);
    }
}

class Second extends First {
    //Create z instance variable
    int z;
    //Create second constructor for three values, stored into instance variables, x and y called from super class
    Second(int a, int b, int c) {
        super(a, b);
        z = c;
    }
    //Create, void return value, output display
    void display() {
        super.display();
        System.out.println("z:" + z);
    }
}

public class Overriding {
    public static void main(String args[]) {
        //main, creates new instance of Second class which overrides the variable values and displays new values
        Second sc = new Second(100, 200, 300);
        sc.display();
    }
}
