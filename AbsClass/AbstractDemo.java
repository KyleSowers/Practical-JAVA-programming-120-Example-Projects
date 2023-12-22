//PRACTICE 49: A PROGRAM TO USE ABSTRACT CLASS
package AbsClass;

//create abstract class
abstract class A {
    //make void method with print statement (returns no value)
    void Method2() {
        System.out.println("We have a concrete method here.");
    }
}

//create additional class that inherits the abstract class
class B extends A {
    //create another void method with a print statement (no return value)
    void Method1() {
        System.out.println("This is a method of class A");
    }
}

//create public class with main method that will run code
public class AbstractDemo {
    public static void main(String args[]) {
        //create new object of class B
        B b = new B();
        //call methods of both classes using new object
        b.Method1();
        b.Method2();
    }
}