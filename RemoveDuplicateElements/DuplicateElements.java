//PRACTICE 91: A PROGRAM TO REMOVE DUPLICATE ELEMENT IN A LIST
package RemoveDuplicateElements;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class DuplicateElements {
    public static void main(String[] args) {

        List<String> al = new ArrayList<String>();

        al.add("TTT");
        al.add("SSS");
        al.add("TTT");
        al.add("DDD");
        al.add("AAA");
        al.add("SSS");
        al.add("TTT");

        System.out.println("List before removing duplicate elements: ");
        System.out.println(al);

        LinkedHashSet<String> hset = new LinkedHashSet<String>();

        hset.addAll(al);

        al.clear();

        al.addAll(hset);

        System.out.println("\n");

        System.out.println("List after removing duplicate elements: " + al);
    }
}
