//PRACTICE 103: A PROGRAM TO IMPLEMENT THROW IN JAVA
package ThrowInJava;

public class ThrowExample {

    public static void LeapYear(int yr) {
        if (yr % 4 != 0) {
            throw new ArithmeticException("This is not a leap year");
        } else {
            System.out.println("This is a leap year");
        }
    }

    public static void main(String[] args) {

    }
}
