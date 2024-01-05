//PRACTICE 85: A PROGRAM TO SORT OBJECT USING COMPARABLE INTERFACE
package SortObjectList;

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
}
