//PRACTICE 84: A PROGRAM TO GET EMPLOYEE'S DATA
package EmployeesData;

import java.util.ArrayList;
import java.util.List;

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

        Employee employee1 = new Employee("Hello","Programmer",1000);
        Employee employee2 = new Employee("Jude","Doctor",4000);
        Employee employee3 = new Employee("Joseph","Lawyer",500);
        Employee employee4 = new Employee("Vivian","Nurse",700);
        Employee employee5 = new Employee("Juliet","Chef",10000);
        Employee employee6 = new Employee("Mark","Gardener",70000);

        List<Employee> employeeList = new ArrayList();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
    }
}
