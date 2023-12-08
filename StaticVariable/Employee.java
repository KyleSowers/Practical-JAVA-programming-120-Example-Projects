//PRACTICE 13: A PROGRAM FOR STATIC VARIABLE
package StaticVariable;

public class Employee {
    //Create instance variables
    int Reg_no;
    String Name;
    //Static variables are assigned to all Employee instances with the associated value
    static String Company = "Gstevewall";
    //create constructor Employee, intakes int and string values, stored into the instance variables
    Employee(int a, String b) {
        Reg_no = a;
        Name = b;
    }
    //create void method, for outputting a message
    void display() {
        System.out.println("Your details are: " + Reg_no + " " + Name + " " + Company);
    }

    public static void  main(String args[]) {
        //create a new employee instance with stored values
        Employee em = new Employee(201, "Ejike");
        //call upon employee instance with method for output
        em.display();
    }
}
