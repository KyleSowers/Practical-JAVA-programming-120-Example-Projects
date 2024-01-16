//PRACTICE 105: A PROGRAM FOR CONSTRUCTOR INHERITANCE
package ConstructorInheritance;

public class ConsInheritance {
    class student {
        student() {
            System.out.println("This is first student constructor");
        }
    }

    class school extends student {
        school() {
            System.out.println("This is second student constructor");
        }
    }

    class studentschool extends school {

    }

    public static void  main(String[] args) {
        studentschool ss = new studentschool();
    }
}
