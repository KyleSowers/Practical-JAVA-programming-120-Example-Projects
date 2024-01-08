//PRACTICE 90: A PROGRAM TO SORT ARRAY IN DESCENDING ORDER
package SortInDescendingOrder;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {
    public static void main(String[] args) {
        //create new arraylist
        ArrayList<String> al = new ArrayList<String>();
        //add strings to arraylist
        al.add("KYC");
        al.add("EYE");
        al.add("HELLO");
        al.add("WELCOME");
        al.add("CUP");
        al.add("AT");
        al.add("JAVA");
        al.add("PYTHON");
        //show user arraylist before sorting method
        System.out.println("Array before sorting: ");
        for(String Str1: al) {
            System.out.println(Str1);
        }
        //create new line before sorting
        System.out.println("\n");
        //use collections class to use its sort method on arraylist and utilize the reverse order method
        Collections.sort(al, Collections.reverseOrder());
        //show user the new arraylist after sorting in reverse order
        System.out.println("Result of ArrayList in Descending order is: ");
        for (String Str1 : al) {
            System.out.println(Str1);
        }
    }
}
