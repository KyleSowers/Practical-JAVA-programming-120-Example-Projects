//PRACTICE 71: A PROGRAM TO CONVERT FROM STRING TO OTHER DATA TYPES
package StringToDataTypes;

public class ConvertString {

    public static void main(String[] args) {

        String Str1 = "False";

        boolean bol = Boolean.parseBoolean(Str1);
        System.out.println("The Boolean result is: " + bol);
    }
}
