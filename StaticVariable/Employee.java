//PRACTICE 13: A PROGRAM FOR STATIC VARIABLE
package StaticVariable;

public class Employee {
    int Reg_no;
    String Name;
    static String Company = "Gstevewall";

    Employee(int a, String b) {
        Reg_no = a;
        Name = b;
    }

    void display() {
        System.out.println("Your details are: " + Reg_no + " " + Name + " " + Company);
    }


}
