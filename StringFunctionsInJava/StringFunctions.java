//PRACTICE 114: A PROJECT TO PRINT DIFFERENT STRING FUNCTIONS
package StringFunctionsInJava;

public class StringFunctions {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello     World";
        String str4 = new String("Welcome");

        System.out.println("Str1 is: " + str1);
        System.out.println("Str2 is: " + str2);
        System.out.println("Str3 is: " + str3);
        System.out.println("Str4 is: " + str4);

        System.out.println("\n");

        System.out.println("Str1 in lowercase is: " + str1.toLowerCase());
        System.out.println("Str3 in uppercase is: " + str3.toUpperCase());
    }
}
