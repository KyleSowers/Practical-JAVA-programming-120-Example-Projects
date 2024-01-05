//PRACTICE 85: A PROGRAM TO SORT OBJECT USING COMPARABLE INTERFACE
package SortObjectList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
    //declare attributes
    private String name;
    private String occupation;
    private int salary;
    //constructor
    public Employee(String firstname, String job, int value) {
        super();
        this.name = firstname;
        this.occupation = job;
        this.salary = value;
    }
    //getters and setters for attributes
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
     //method to make string
     public String toString() {
        return "Name of employeeis: " + name + " Occupation is: " + salary;
     }
    //method to compare salaries against implemented salaries
     @Override
    public int compareTo(Employee comparemydata) {
        int compareValue = ((Employee) comparemydata).getSalary();
        return this.salary - compareValue;
     }

     public static void main(String args[]) {
        //create employees
        Employee employee1 = new Employee("Hello1","Programmer1",1000);
        Employee employee2 = new Employee("Hello2","Programmer2",7000);
        Employee employee3 = new Employee("Hello3","Programmer3",6000);
        Employee employee4 = new Employee("Hello4","Programmer4",4000);
        Employee employee5 = new Employee("Hello5","Programmer5",8000);
        //create new array list
        List<Employee> employee = new ArrayList();
        //add employees to array list
        employee.add(employee1);
        employee.add(employee2);
        employee.add(employee3);
        employee.add(employee4);
        employee.add(employee5);
        //print before sorting
         System.out.println("Objects before sorting: ");
         for (Employee emp1:employee) {
             System.out.println(emp1);
         }
        //create line break
         System.out.println("\n");
        //sort employees in list
         Collections.sort(employee);
        //print new ascending list of employees
         System.out.println("Objects after sorting: ");
         for (Employee emp1:employee) {
             System.out.println(emp1);
         }
         System.out.println("\n");
     }
}
