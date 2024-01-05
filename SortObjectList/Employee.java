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

     public static void main(String args[]) {

        Employee employee1 = new Employee("Hello1","Programmer1",1000);
        Employee employee2 = new Employee("Hello2","Programmer2",7000);
        Employee employee3 = new Employee("Hello3","Programmer3",6000);
        Employee employee4 = new Employee("Hello4","Programmer4",4000);
        Employee employee5 = new Employee("Hello5","Programmer5",8000);
     }
}
