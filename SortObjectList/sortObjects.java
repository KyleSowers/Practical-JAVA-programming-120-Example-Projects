//PRACTICE 86: A PROGRAM TO SORT OBJECT USING COMPARATOR INTERFACE
package SortObjectList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortObjects implements Comparator<Employee> {
    //override method with preferred information
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return(employee1.getSalary() - employee2.getSalary());
    }

    public static void main(String[] args) {
        //create 5 employee
        Employee employee1 = new Employee("Hello1", "Programmer1", 1000);
        Employee employee2 = new Employee("Hello2", "Programmer2", 300);
        Employee employee3 = new Employee("Hello3", "Programmer3", 18000);
        Employee employee4 = new Employee("Hello4", "Programmer4", 900);
        Employee employee5 = new Employee("Hello5", "Programmer5", 8000);
        //create new list
        List<Employee> employeelist = new ArrayList<>();
        //add 5 employee to list
        employeelist.add(employee1);
        employeelist.add(employee2);
        employeelist.add(employee3);
        employeelist.add(employee4);
        employeelist.add(employee5);
        //print list before sort
        System.out.println("Objects before sorting: ");
        for (Employee employee : employeelist) {
            System.out.println(employee);
        }
        //add new line
        System.out.println("\n");
        //sort list
        Collections.sort(employeelist, new sortObjects());
        //print list after sort
        System.out.println("Objects after sorting: ");
        for (Employee employee : employeelist) {
            System.out.println(employee);
        }
    }
}


