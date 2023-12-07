package FinalKeyword;

public class Employee {
    //Create a final instance variable, that cannot be changed for employee number
    final int Reg_no;
    //Create constructor for Employee that takes a num value and stores as final instance variable Reg_no
    Employee(int num) {
        Reg_no = num;
    }
    //Create a void (no return) display method for outputting result through a string statement
    void display() {
        System.out.println("Employee number is: " + Reg_no);
    }
    //Main Method
    public static void main(String args[]) {
        //Create new instance of Employee (Employee object), with num or Emp_no value
        Employee em = new Employee(201);
        //With new employee, call the void display method to output result
        em.display();
    }
}
