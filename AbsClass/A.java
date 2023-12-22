package AbsClass;

abstract class A {
    void Method2() {
        System.out.println("We have a concrete method here.");
    }
}

class B extends A {
    void Method1() {
        System.out.println("This is a method of class A");
    }
}