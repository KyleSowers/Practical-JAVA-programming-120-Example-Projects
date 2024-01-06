//PRACTICE 86: A PROGRAM TO SORT OBJECT USING COMPARATOR INTERFACE
package SortObjectList;

import java.util.Comparator;

public class sortObjects implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return(employee1.getSalary() - employee2.getSalary());
    }

    public static void main(String[] args) {

    }
}


