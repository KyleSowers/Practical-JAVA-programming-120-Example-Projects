package FinalKeyword;

public class Employee {

    final int Reg_no;
    Employee(int num) {
        Reg_no = num;
    }
    void display() {
        System.out.println("Employee number is: " + Reg_no);
    }

    public static void main(String args[]) {
        Employee em = new Employee(201);
        em.display();
    }
}
