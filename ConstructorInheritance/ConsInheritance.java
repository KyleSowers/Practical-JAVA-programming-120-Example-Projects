//PRACTICE 105: A PROGRAM FOR CONSTRUCTOR INHERITANCE
package ConstructorInheritance;

public class ConsInheritance {
    //new class with constructor
    static class student {
        student() {
            System.out.println("This is first student constructor");
        }
    }
    //new extended class with constructor
    static class school extends student {
        school() {
            System.out.println("This is second student constructor");
        }
    }
    //new extended class with constructor
    static class studentschool extends school {
        studentschool() {
            System.out.println("This is third student constructor");
        }
    }
    //call on method that extends previous classes providing each constructor result
    public static void main(String[] args) {
        studentschool ss = new studentschool();
    }
}
