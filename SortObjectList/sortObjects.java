//PRACTICE 86: A PROGRAM TO SORT OBJECT USING COMPARATOR INTERFACE
package SortObjectList;

import java.util.Comparator;
import java.util.List;

public class sortObjects implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return(employee1.getSalary() - employee2.getSalary());
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("Hello1", "Programmer1", 1000);
        Employee employee2 = new Employee("Hello2", "Programmer2", 300);
        Employee employee3 = new Employee("Hello3", "Programmer3", 18000);
        Employee employee4 = new Employee("Hello4", "Programmer4", 900);
        Employee employee5 = new Employee("Hello5", "Programmer5", 8000);

        List<Employee> employeelist = new ArrayList();
        employeelist.add(employee1);
        employeelist.add(employee2);
        employeelist.add(employee3);
        employeelist.add(employee4);
        employeelist.add(employee5);
    }
}


