//PRACTICE 71: A PROGRAM TO CONVERT FROM STRING TO OTHER DATA TYPES
package StringToDataTypes;

public class ConvertString {

    public static void main(String[] args) {
        //declare new string attribute
        String Str1 = "False";
        //declare new boolean attribute that parses the string value
        boolean bol = Boolean.parseBoolean(Str1);
        //print result of new boolean attribute
        System.out.println("The Boolean result is: " + bol);
        //declare new string attribute with string numeral value
        String Str2 = "500";
        //declare int with value
        int num1 = 300;
        //declare new int atribute that converts stirng attribute to int and stores value
        int num2 = Integer.parseInt(Str2);
        //declare new attribute that takes value of original and parsed int attribute values added
        int add = num1 + num2;
        //print result
        System.out.println("Integer result is: " + add);
        //declare new string attribute with string value
        String Str3 = "301.92";
        //declare new double attribute with double value
        Double dob = 45.78;
        //declare new double attribute that converts string attributes value to double and stores value
        Double dob1 = Double.parseDouble(Str3);
        //declare new double attribute that stores the value of the original double attribute and parsed double attribute added together
        Double adddob = dob + dob1;
        //print result
        System.out.println("Double result is: " + adddob);
    }
}
