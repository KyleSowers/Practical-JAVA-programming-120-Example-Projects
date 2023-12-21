//PRACTICE 45: A PROGRAM TO REVERSE AN ARRAY
package ReverseArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        //create new arraylist
        ArrayList al = new ArrayList();
        //add desired elements(values)
        al.add("E");
        al.add("J");
        al.add("I");
        al.add("K");
        al.add("E");
        //print result of list before reversal
        System.out.println("Before reversal: " + al);
        //call method for reversal
        Collections.reverse(al);
        //print reversal
        System.out.println("After reversal: " + al);
    }
}
