//PRACTICE 84: A PROGRAM TO GET EMPLOYEE'S DATA
package EmployeesData;

public class Employee {

    private String name;
    private String occupation;
    private int salary;

    public Employee(String firstname, String job, int value) {
        super();
        this.name = firstname;
        this.occupation = job;
        this.salary = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "name is: " + name + " Occupatin is: " + occupation + " Salary is: " + salary;
    }

    public static void main(String[] args) {

    }
}
