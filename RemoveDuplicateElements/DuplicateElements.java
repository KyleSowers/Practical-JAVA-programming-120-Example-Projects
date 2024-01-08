//PRACTICE 91: A PROGRAM TO REMOVE DUPLICATE ELEMENT IN A LIST
package RemoveDuplicateElements;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class DuplicateElements {
    public static void main(String[] args) {
        //create a new arraylist of strings
        List<String> al = new ArrayList<String>();
        //add strings
        al.add("TTT");
        al.add("SSS");
        al.add("TTT");
        al.add("DDD");
        al.add("AAA");
        al.add("SSS");
        al.add("TTT");
        //print list before removing duplicates
        System.out.println("List before removing duplicate elements: ");
        System.out.println(al);
        //create new hashset to remove duplicates
        LinkedHashSet<String> hset = new LinkedHashSet<String>();
        //add values in arraylist to hashset
        hset.addAll(al);
        //clear arraylist
        al.clear();
        //add hashed values back into empty arraylist
        al.addAll(hset);
        //create new line
        System.out.println("\n");
        //print new arraylist without doubles
        System.out.println("List after removing duplicate elements: " + al);
    }
}
