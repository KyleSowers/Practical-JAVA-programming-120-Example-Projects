//PRACTICE 85: A PROGRAM TO SORT OBJECT USING COMPARABLE INTERFACE
package SortObjectList;

public class Employee implements Comparable<Employee> {

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
        return "Name of employeeis: " + name + " Occupation is: " + salary;
     }

     @Override
    public int compareTo(Employee comparemydata) {
        int compareValue = ((Employee) comparemydata).getSalary();
        return this.salary - compareValue;
     }
}
