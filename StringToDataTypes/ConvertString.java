//PRACTICE 71: A PROGRAM TO CONVERT FROM STRING TO OTHER DATA TYPES
package StringToDataTypes;

public class ConvertString {

    public static void main(String[] args) {

        String Str1 = "False";

        boolean bol = Boolean.parseBoolean(Str1);
        System.out.println("The Boolean result is: " + bol);

        String Str2 = "500";
        int num1 = 300;

        int num2 = Integer.parseInt(Str2);
        int add = num1 + num2;
        System.out.println("Integer result is: " + add);

        String Str3 = "301.92";
        Double dob = 45.78;

        Double dob1 = Double.parseDouble(Str3);
        Double adddob = dob + dob1;
        System.out.println("Double result is: " + adddob);
    }
}
