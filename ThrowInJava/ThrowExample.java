//PRACTICE 103: A PROGRAM TO IMPLEMENT THROW IN JAVA
package ThrowInJava;

public class ThrowExample {
    //create method for determining leap year
    public static void LeapYear(int yr) {
        //check if condition of not being a leap year is met
        if (yr % 4 != 0) {
            //throw exception if condition of if was satisfied, inform user not a leap year
            throw new ArithmeticException("This is not a leap year");
            //if condition not met, than leap year, inform user
        } else {
            System.out.println("This is a leap year");
        }
    }

    public static void main(String[] args) {
        //tell user check for leap year is beginning
        System.out.println("Checking leap year");
        //call method with arguement value to check for leap year and provide result to user
        LeapYear(2023);
    }
}
