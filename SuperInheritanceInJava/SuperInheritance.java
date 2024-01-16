//PRACTICE 106: A PROGRAM FOR SUPER CLASS IN INHERITANCE
package SuperInheritanceInJava;

public class SuperInheritance {
    class student {
        String firstname;
        String lastname;

        student (String fname, String lname) {
            firstname = fname;
            lastname = lname;
        }
    }

    class school extends student{
        int grade;
    }
}
