//PRACTICE 106: A PROGRAM FOR SUPER CLASS IN INHERITANCE
package SuperInheritanceInJava;

    //create class for student
    class student {
        //create attributes
        String firstname;
        String lastname;
        //controller
        student (String fname, String lname) {
            firstname = fname;
            lastname = lname;
        }
    }
    //create class for school that extends student
    class school extends student{
        //create needed attributes other than extended
        int grade;
        String subject;
        //create controller that super's and creates needed values
        school (String fname, String lname, int score, String sub) {
            //inherit values
            super (fname, lname);
            //add attribute values from constructor
            grade = score;
            subject = sub;
        }
    }

    public class SuperInheritance {
        public static void main(String[] args) {
            //create new instance of class
            school sch = new school("David", "Jacob", 98, "Jave");
            //print each argument value as result to user
            System.out.println("Student's firstname is: " + sch.firstname);
            System.out.println("Student's lastname is: " + sch.lastname);
            System.out.println("Student's grade is: " + sch.grade);
            System.out.println("Student's subject is " + sch.subject);
        }
    }

