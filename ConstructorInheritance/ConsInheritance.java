//PRACTICE 105: A PROGRAM FOR CONSTRUCTOR INHERITANCE
package ConstructorInheritance;

public class ConsInheritance {
    static class student {
        student() {
            System.out.println("This is first student constructor");
        }
    }

    static class school extends student {
        school() {
            System.out.println("This is second student constructor");
        }
    }

    static class studentschool extends school {
        studentschool() {
            System.out.println("This is third student constructor");
        }
    }

    public static void main(String[] args) {
        studentschool ss = new studentschool();
    }
}
